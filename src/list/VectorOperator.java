package list;

import java.util.Vector;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class VectorOperator
 * @author Vinayak
 *
 */
public class VectorOperator extends CollectionOperator
{
	/**
	 * Object of Vector Class.
	 */
	private static Vector<String> _vect = new Vector<String>();

	/**
	 * To add Object in Vector
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_vect.add(_data);
	}

	/**
	 * To get Object Form Vector
	 * @throws ProgTerminateException
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_INDEX_TO_GET);
		_index = Utility._getIntegerInput();
		if(_vect.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.vectorOperations();
		}
		else if(_index >= _vect.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			getData();
		}
		return _vect.get(_index);
	}

	/**
	 * TO get object from Vector
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_INDEX_TO_REMOVE);
		_index = Utility._getIntegerInput();
		if(_vect.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.vectorOperations();
		}
		else if(_index >= _vect.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			removeObject();
		}
		_vect.remove(_index);
	}

	/**
	 * To display Vector
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_vect.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.vectorOperations();
		}
		for(String str : _vect)
		{
			System.out.println(str);
		}
	}
}