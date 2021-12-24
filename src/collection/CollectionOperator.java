package collection;

import excepttion.ProgTerminateException;
import test.DisplayManager;

/**
 * Class ListOperator
 * @author Vinayak
 *
 */
public abstract class CollectionOperator
{
	/**
	 * Object of Invoker Class.
	 */
	protected DisplayManager _invok = new DisplayManager();
	/**
	 * Data to add into Collection class. 
	 */
	protected String _data;
	/**
	 * index
	 */
	protected int _index;

	/**
	 * To add object in List
	 */
	protected abstract void addData();

	/**
	 * To get Object in the List
	 * @return - objetc in list
	 * @throws ProgTerminateException
	 */
	protected abstract Object getData();

	/**
	 * To remove object from List
	 * @throws ProgTerminateException
	 */
	protected abstract void removeObject();

	/**
	 * To display objects in the list
	 * @throws ProgTerminateException
	 */
	protected abstract void display();
}