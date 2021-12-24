package map;

import java.util.Hashtable;
import java.util.Map;

import excepttion.ProgTerminateException;
import utility.Defination;
import utility.Utility;
import collection.CollectionOperator;

/**
 * Class HashTableOperator
 * @author Vinayak
 *
 */
public class HashTableOperator extends CollectionOperator
{
	/**
	 * Key of Hashtable
	 */
	int _key;
	/**
	 * Object of Hashtable.
	 */
	static Hashtable<Integer, String> _hashTable = new Hashtable<Integer,String>();

	/**
	 * To Add objects in HashTable
	 */
	public void addData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		System.out.println(Defination.ENTER_DATA);
		_data = Utility._getStringInput();
		_hashTable.put(_key, _data);
	}

	/**
	 * TO get object in HashTable
	 * @throws ProgTerminateException
	 */
	public String getData()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_hashTable.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.hashtableOperations();
		}
		else if(!_hashTable.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			getData();
		}
		return _hashTable.get(_key);
	}

	/**
	 * To remove Object from HashTable
	 * @throws ProgTerminateException
	 */
	public void removeObject()
	{
		System.out.println(Defination.ENTER_KEY);
		_key = Utility._getIntegerInput();
		if(_hashTable.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.hashtableOperations();
		}
		else if(!_hashTable.containsKey(_key))
		{
			System.err.println(Defination.ERR_KEY_NOT_FOUND);
			removeObject();
		}
		else
		{
			_hashTable.remove(_key);
		}
	}

	/**
	 * To display HashTable
	 * @throws ProgTerminateException
	 */
	public void display()
	{
		if(_hashTable.isEmpty())
		{
			System.err.println(Defination.ERR_MAP_EMPTY);
			_invok.hashtableOperations();
		}
		for(Map.Entry<Integer, String> m : _hashTable.entrySet())
		{
			   System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}