package list;

import java.util.LinkedList;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class LinkedListOperator
 * @author Vinayak
 *
 */
public class LinkedListOperator extends CollectionOperator
{
	/**
	 * Object of LinkedList.
	 */
	private static LinkedList<String> _linkList = new LinkedList<String>();

	/**
	 * To add Object in LinkedList
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_linkList.add(_data);
	}

	/**
	 * To get Object Form LinkedList
	 * @throws ProgTerminateException
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_INDEX_TO_GET);
		_index = Utility._getIntegerInput();
		if(_linkList.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.linkedListOperations();
		}
		else if(_index >= _linkList.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			getData();
		}
		return _linkList.get(_index);
	}

	/**
	 * TO get object from LinkedList
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_INDEX_TO_REMOVE);
		_index = Utility._getIntegerInput();
		if(_linkList.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.linkedListOperations();
		}
		else if(_index >= _linkList.size())
		{
			System.err.println(Defination.ERR_INDEX_GREATER);
			removeObject();
		}
		_linkList.remove(_index);
	}

	/**
	 * To display LinkedList
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_linkList.isEmpty())
		{
			System.err.println(Defination.ERR_LIST_EMPTY);
			_invok.linkedListOperations();
		}
		for(String str : _linkList)
		{
			System.out.println(str);
		}
	}
}