package test;

import list.ArrayListOperator;
import list.LinkedListOperator;
import list.VectorOperator;
import map.HashMapOperator;
import map.HashTableOperator;
import map.LinkedHashMapOperator;
import map.TreeMapOperator;
import set.HashSetOperator;
import set.LinkedHashSetOperator;
import set.TreeSetOperator;
import utility.Defination;
import utility.Utility;
import excepttion.ProgTerminateException;

public class DisplayManager
{
	/**
	 * User Choice.
	 */
	int _choice;
	/**
	 * To perform working of code
	 * @throws ProgTerminateException
	 */
	public void begin()
	{
		try
		{
			System.out.println(Defination.ENTER_CHOICE);
			System.out.println(Defination.COMM_COLL_INTERFACE);
			_choice = Utility._getIntegerInput();
			switch(_choice)
			{
				case 1:
					selectListClasses();
					break;
				case 2:
					selectSetClasses();
					break;
				case 3:
					selectMapClasses();
					break;
				case 4: 
					throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);
				default:
					System.err.println(Defination.ERR_WRONG_INPUT);
					begin();
			}
		}
		catch(ProgTerminateException p)
		{
			System.err.println(p.getMessage());
		}
	}

	/**
	 * To select Methods of ArrayList Class
	 * @throws ProgTerminateException
	 */
	public void arrayListOPerations()
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		ArrayListOperator arrListObj = new ArrayListOperator();
		switch(_choice)
		{
		case 1:
			arrListObj.addData();
			arrayListOPerations();
		case 2:
			System.out.println(arrListObj.getData());
			arrayListOPerations();
		case 3: 
			arrListObj.removeObject();
			arrayListOPerations();
		case 4:
			arrListObj.display();
			arrayListOPerations();
		case 5:
			selectListClasses();
		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);
		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			arrayListOPerations();
		}
	}

	/**
	 * To select Methods of LinkedList Class
	 * @throws ProgTerminateException
	 */
	public void linkedListOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		LinkedListOperator linklistObj = new LinkedListOperator();
		switch(_choice)
		{
		case 1:
			linklistObj.addData();
			linkedListOperations();
		case 2:
			System.out.println(linklistObj.getData());
			linkedListOperations();
		case 3: 
			linklistObj.removeObject();
			linkedListOperations();
		case 4:
			linklistObj.display();
			linkedListOperations();
		case 5:
			selectListClasses();
		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);
		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			linkedListOperations();
		}
	}

	/**
	 * To select Methods of Vector Class
	 * @throws ProgTerminateException
	 */
	public void vectorOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		VectorOperator vectObj = new VectorOperator();
		switch(_choice)
		{
		case 1:
			vectObj.addData();
			vectorOperations();
		case 2:
			System.out.println(vectObj.getData());
			vectorOperations();
		case 3: 
			vectObj.removeObject();
			vectorOperations();
		case 4:
			vectObj.display();
			vectorOperations();
		case 5:
			selectListClasses();
		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);
		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			vectorOperations();
		}
	}

	/**
	 * To select Classes of List Interface
	 * @throws ProgTerminateException
	 */
	public void selectListClasses() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_LIST_CLASS);
		_choice = Utility._getIntegerInput();
		switch(_choice)
		{
			case 1:
				arrayListOPerations();
			case 2:
				linkedListOperations();
			case 3:
				vectorOperations();
			case 4:
				begin();
			case 5:
				throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);
			default:
				System.err.println(Defination.ERR_WRONG_INPUT);
				selectListClasses();
		}
	}

	/**
	 * To select Methods of HashMap
	 * @throws ProgTerminateException
	 */
	public void hashMapOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		HashMapOperator hashMapObj = new HashMapOperator(); 
		switch(_choice)
		{
		case 1:
			hashMapObj.addData();
			hashMapOperations();
		case 2:
			System.out.println(hashMapObj.getData());
			hashMapOperations();
		case 3: 
			hashMapObj.removeObject();
			hashMapOperations();
		case 4:
			hashMapObj.display();
			hashMapOperations();
		case 5:
			selectMapClasses();

		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);
		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			hashMapOperations();
		}
	}

	/**
	 * To select Methods of LinkedHashMap
	 * @throws ProgTerminateException
	 */
	public void linkedHashMapOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		LinkedHashMapOperator linkMapObj = new  LinkedHashMapOperator();
		switch(_choice)
		{
		case 1:
			linkMapObj.addData();
			linkedHashMapOperations();

		case 2:
			System.out.println(linkMapObj.getData());
			linkedHashMapOperations();

		case 3: 
			linkMapObj.removeObject();
			linkedHashMapOperations();

		case 4:
			linkMapObj.display();
			linkedHashMapOperations();
			
		case 5:
			selectMapClasses();

		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			linkedHashMapOperations();
		}
	}

	/**
	 * To select Methods of  TreeMap
	 * @throws ProgTerminateException
	 */
	public void treeMapOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		TreeMapOperator treeMapObj = new TreeMapOperator(); 
		switch(_choice)
		{
		case 1:
			treeMapObj.addData();
			treeMapOperations();

		case 2:
			System.out.println(treeMapObj.getData());
			treeMapOperations();

		case 3: 
			treeMapObj.removeObject();
			treeMapOperations();

		case 4:
			treeMapObj.display();
			treeMapOperations();

		case 5:
			selectMapClasses();

		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			treeMapOperations();
		}
	}

	/**
	 * To select Methods of HashTable
	 * @throws ProgTerminateException
	 */
	public void hashtableOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		HashTableOperator hashtableObj = new HashTableOperator(); 
		switch(_choice)
		{
		case 1:
			hashtableObj.addData();
			hashtableOperations();

		case 2:
			System.out.println(hashtableObj.getData());
			hashtableOperations();

		case 3: 
			hashtableObj.removeObject();
			hashtableOperations();

		case 4:
			hashtableObj.display();
			hashtableOperations();

		case 5:
			selectMapClasses();

		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			hashtableOperations();
		}
	}

	/**
	 * To select Classes of Map Interface
	 * @throws ProgTerminateException
	 */
	public void selectMapClasses() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_MAP_CLASS);
		_choice = Utility._getIntegerInput();
		switch(_choice)
		{
			case 1:
				hashMapOperations();

			case 2:
				linkedHashMapOperations();

			case 3:
				treeMapOperations();

			case 4:
				hashtableOperations();

			case 5:
				begin();

			case 6:
				throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

			default:
				System.err.println(Defination.ERR_WRONG_INPUT);
				selectMapClasses();
		}
	}

	/**
	 * To Select methods of HashSet class
	 * @throws ProgTerminateException
	 */
	public void hashSetOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		HashSetOperator hashSetObj = new HashSetOperator();
		switch(_choice)
		{
		case 1:
			hashSetObj.addData();
			hashSetOperations();

		case 2:
			System.out.println(hashSetObj.getData());
			hashSetOperations();

		case 3: 
			hashSetObj.removeObject();
			hashSetOperations();

		case 4:
			hashSetObj.display();
			hashSetOperations();

		case 5:
			selectSetClasses();

		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			hashSetOperations();
		}
	}

	/**
	 * To select methods of LinkedHashSet class 
	 * @throws ProgTerminateException
	 */
	public void linkedHashSetOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		LinkedHashSetOperator linkhashSetObj = new LinkedHashSetOperator();
		switch(_choice)
		{
		case 1:
			linkhashSetObj.addData();
			linkedHashSetOperations();

		case 2:
			System.out.println(linkhashSetObj.getData());
			linkedHashSetOperations();

		case 3: 
			linkhashSetObj.removeObject();
			linkedHashSetOperations();

		case 4:
			linkhashSetObj.display();
			linkedHashSetOperations();

		case 5:
			selectSetClasses();
			
		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			linkedHashSetOperations();
		}
	}

	/**
	 * To select methods of TreeSet class
	 * @throws ProgTerminateException
	 */
	public void treeSetOperations() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_CLASS_FUNCTION);
		_choice = Utility._getIntegerInput();
		TreeSetOperator treeSetObj = new TreeSetOperator();
		switch(_choice)
		{
		case 1:
			treeSetObj.addData();
			treeSetOperations();

		case 2:
			System.out.println(treeSetObj.getData());
			treeSetOperations();

		case 3: 
			treeSetObj.removeObject();
			treeSetOperations();

		case 4:
			treeSetObj.display();
			treeSetOperations();

		case 5:
			selectSetClasses();

		case 6:
			throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

		default:
			System.err.println(Defination.ERR_WRONG_INPUT);
			treeSetOperations();
		}
	}

	/**
	 * To select classes of Set Interface
	 * @throws ProgTerminateException
	 */
	public void selectSetClasses() throws ProgTerminateException
	{
		System.out.println(Defination.ENTER_CHOICE);
		System.out.println(Defination.COMM_SET_CLASS);
		_choice = Utility._getIntegerInput();
		switch(_choice)
		{
			case 1:
				hashSetOperations();

			case 2:
				linkedHashSetOperations();

			case 3:
				treeSetOperations();

			case 4:
				begin();

			case 5:
				throw new ProgTerminateException(Defination.ERR_PROG_TERMINATED);

			default:
				System.err.println(Defination.ERR_WRONG_INPUT);
				selectSetClasses();
		}
	}
}