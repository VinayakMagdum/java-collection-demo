package map;

import java.util.HashMap;
import java.util.TreeMap;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class TreeMapOperator
 * @author Vinayak
 *
 */
public class TreeMapOperator extends CollectionOperator
{
	/**
	 * Key of TreeMap
	 */
	private int _key;
	/**
	 * Object of TreeMap.
	 */
	private static TreeMap<Integer, String> _treeMap = new TreeMap<Integer,String>();

	/**
	 * To Add objects in TreeMap
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_treeMap.put(_key, _data);
	}

	/**
	 * TO get object in TreeMap
	 * @throws ProgTerminateException
	 * @throws . 
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_treeMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.treeMapOperations();
		}
		else if(!_treeMap.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			getData();
		}
		return _treeMap.get(_key);
	}

	/**
	 * To remove Object from TreeMap
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_treeMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.treeMapOperations();
		}
		else if(!_treeMap.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			removeObject();
		}
		else
		{
			_treeMap.remove(_key);
		}
	}

	/**
	 * To display TreeMap
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_treeMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.treeMapOperations();
		}
		for(HashMap.Entry<Integer, String> m : _treeMap.entrySet())
		{
			   System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}