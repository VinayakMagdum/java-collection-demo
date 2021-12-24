package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Classs LinkedHashSetOperator
 * @author Vinayak
 *
 */
public class LinkedHashSetOperator extends CollectionOperator
{
	/**
	 * Object of LinkedHashSet.
	 */
	private static LinkedHashSet<String> _linkhashSet = new LinkedHashSet<String>();

	/**
	 * To add data in the LinkedHashSet
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_linkhashSet.add(_data);
	}

	/**
	 * To get Object from the LinkedHashSet
	 * @throws ProgTerminateException
	 */
	public Object getData()
	{
		int count=0;
		String str ;
		String data="";
		System.out.println(Defination.ENTER_INDEX_TO_GET);
		_index = Utility._getIntegerInput();
		Iterator<String> itr = _linkhashSet.iterator();
		
		if(_linkhashSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.linkedHashSetOperations();
		}
		else if(_index >= _linkhashSet.size())
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
	 * To remove Objects from the LinkedHashSet
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		String object;
		System.out.println(Defination.ENTER_OBJECT_TO_REMOVE);
		object = Utility._getStringInput();
		if(_linkhashSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.linkedHashSetOperations();
		}
		else if(_index >= _linkhashSet.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			removeObject();
		}
		else
		{	
			_linkhashSet.remove(object);
		}
	}

	/**
	 * To Display Objects in the LinkedHashSet
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_linkhashSet.isEmpty())
		{
			System.err.println(Defination.ERR_SET_EMPTY);
			_invok.linkedHashSetOperations();
		}
		for(String obj : _linkhashSet)
		{
			System.out.println(obj);
		}
	}
}