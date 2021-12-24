package set;

import java.util.HashSet;

import excepttion.ProgTerminateException;
import utility.Defination;
import java.util.Iterator;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class HashSetOperator
 * @author Vinayak
 *
 */
public class HashSetOperator extends CollectionOperator
{
	/**
	 * Object of hashSet.
	 */
	private static HashSet<String> _hashSet = new HashSet<String>();
	
	/**
	 * To add data in the HashSet
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_hashSet.add(_data);
	}

	/**
	 * To get Object from the HashSet
	 * @throws ProgTerminateException
	 */
	public Object getData()
	{
		int count=0;
		String str;
		String data="";
		System.out.println(Defination.ENTER_INDEX_TO_GET);
		_index = Utility._getIntegerInput();
		Iterator<String> itr = _hashSet.iterator();
		
		if(_hashSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.hashSetOperations();
		}
		else if(_index >= _hashSet.size())
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
	 * To remove Objects from the HashSet
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		String object;
		System.out.println(Defination.ENTER_OBJECT_TO_REMOVE);
		object = Utility._getStringInput();
		if(_hashSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.hashSetOperations();
		}
		else if(_index >= _hashSet.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			removeObject();
		}
		else
		{
			_hashSet.remove(object);
		}
	}

	/**
	 * To Display Objects in the HashSet
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_hashSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.hashSetOperations();
		}
		for(String obj : _hashSet)
		{
			System.out.println(obj);
		}
	}
}