package set;

import java.util.Iterator;
import java.util.TreeSet;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class TreeSetOperator
 * @author Vinayak
 *
 */
public class TreeSetOperator extends CollectionOperator
{
	/**
	 * Object of TreeSet.
	 */
	private static TreeSet<String> _treeSet = new TreeSet<String>();
	
	/**
	 * To add data in the TreeSet
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_treeSet.add(_data);
	}

	/**
	 * To get Object from the TreeSet
	 * @throws ProgTerminateException
	 */
	public Object getData()
	{
		int count=0;
		String str ;
		String data="";
		System.out.println(Defination.ENTER_INDEX_TO_GET);
		_index = Utility._getIntegerInput();
		Iterator<String> itr = _treeSet.iterator();

		if(_treeSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.treeSetOperations();
		}
		else if(_index >= _treeSet.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			getData();
		}
		while(itr.hasNext() && count<=_index)
		{
			str = itr.next();
			if(count == _index)
			{
				data = str;
			}
			count++;
		}
		return data;
	}

	/**
	 * To remove Objects from the TreeSet
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		String object;
		System.out.println(Defination.ENTER_OBJECT_TO_REMOVE);
		object = Utility._getStringInput();
		if(_treeSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.treeSetOperations();
		}
		else if(_index >= _treeSet.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			removeObject();
		}
		_treeSet.remove(object);
	}

	/**
	 * To Display Objects in the TreeSet
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_treeSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.treeSetOperations();
		}
		for(String obj : _treeSet)
		{
			System.out.println(obj);
		}
	}
}