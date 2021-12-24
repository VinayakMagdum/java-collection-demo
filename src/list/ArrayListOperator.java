package list;

import java.util.ArrayList;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class ArrayListOperator
 */
public class ArrayListOperator extends CollectionOperator
{
	/**
	 * Object of ArrayList.
	 */
	private static ArrayList<String> _arrList = new ArrayList<String>();

	/**
	 * To add Object in ArrayList
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_arrList.add(_data);
	}

	/**
	 * To get Object Form ArrayList
	 * @throws ProgTerminateException
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_INDEX_TO_GET);
		_index = Utility._getIntegerInput();
		if(_arrList.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.arrayListOPerations();
		}
		else if(_index >= _arrList.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			getData();
		}
			return _arrList.get(_index);
	}

	/**
	 * TO get object from ArrayList
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_INDEX_TO_REMOVE);
		_index = Utility._getIntegerInput();
		if(_arrList.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.arrayListOPerations();
		}
		else if(_index >= _arrList.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			removeObject();
		}
		else
		{
			_arrList.remove(_index);
		}
	}

	/**
	 * To display ArrayList
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_arrList.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.arrayListOPerations();
		}
		for(String obj : _arrList)
		{
			System.out.println(obj);
		}
	}
}