package utility;

import java.util.Scanner;

/**
 * Class Utility
 * @author Vinayak
 *
 */
public class Utility
{
	static private Scanner _scanner=new Scanner(System.in);

	/**
	 * To get Integer input
	 * @author Vinayak
	 * @return
	 */
	public static int _getIntegerInput()
	{
		int input=0;
		try
		{
			String strInput=_scanner.nextLine();
			input=Integer.parseInt(strInput);
			if(input<0)
			{
				System.out.println(Defination.ERR_WRONG_INPUT);
				input=_getIntegerInput();
			}
		}
		catch(Exception E)
		{
			System.out.println(Defination.ERR_WRONG_INPUT);
			input=_getIntegerInput();
		}
		return input;
	}

	/**
	 * To get String input
	 * @author Vinayak
	 * @return
	 */
	public static String _getStringInput()
	{
		String input;
		input=_scanner.nextLine();
//		try
//		{
//			if(! input.matches("[a-zA-Z]{1,25}"))
//			{
//				throw new Exception();
//			}
//		}
//		catch(Exception E)
//		{
//			System.out.println(Defination.ERR_WRONG_INPUT);
//			input=_getStringInput();
//		}
		return input;
	}
}