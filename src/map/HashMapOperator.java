package map;

import java.util.HashMap;
import java.util.Map;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class HashMapOperator
 * @author Vinayak
 *
 */
public class HashMapOperator extends CollectionOperator
{
	/**
	 * Key of HashMap
	 */
	int _key;
	/**
	 * Object of HashMap.
	 */
	static HashMap<Integer, String> _hashMap = new HashMap<Integer,String>();

	/**
	 * To Add objects in HashMap
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_hashMap.put(_key, _data);
	}

	/**
	 * TO get object in HashMap
	 * @throws ProgTerminateException
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_hashMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.hashMapOperations();
		}
		else if(!_hashMap.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			getData();
		}
		return _hashMap.get(_key);
	}

	/**
	 * To remove Object from HashMap
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_hashMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.hashMapOperations();
		}
		else if(!_hashMap.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			removeObject();
		}
		else
		{
			_hashMap.remove(_key);
		}
	}

	/**
	 * To display HashMap
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_hashMap.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.hashMapOperations();
		}
		for(Map.Entry<Integer, String> m : _hashMap.entrySet())
		{
			   System.out.println(m.getKey()+ " " + m.getValue());
		}
	}
}