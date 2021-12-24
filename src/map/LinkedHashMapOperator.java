package map;

import java.util.LinkedHashMap;
import java.util.Map;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class LinkedHashMapOperator
 * @author Vinayak
 *
 */
public class LinkedHashMapOperator extends CollectionOperator
{
	/**
	 * Key of LinkedHashMap
	 */
	int _key;
	/**
	 * Object of LinkedHashMap.
	 */
	static LinkedHashMap<Integer, String> _linkHashMap = new LinkedHashMap<Integer,String>();

	/**
	 * To Add objects in LinkedHashMap
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_linkHashMap.put(_key, _data);
	}

	/**
	 * TO get object in LinkedHashMap
	 * @throws ProgTerminateException
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_linkHashMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.linkedHashMapOperations();
		}
		else if(!_linkHashMap.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			getData();
		}
		return _linkHashMap.get(_key);
	}

	/**
	 * To remove Object from LinkedHashMap
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_linkHashMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.linkedHashMapOperations();
		}
		else if(!_linkHashMap.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			removeObject();
		}
		else
		{
			_linkHashMap.remove(_key);
		}
	}

	/**
	 * To display LinkedHashMap
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_linkHashMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.linkedHashMapOperations();
		}
		for(Map.Entry<Integer, String> m : _linkHashMap.entrySet())
		{
			   System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}