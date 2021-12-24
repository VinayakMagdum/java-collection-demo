package excepttion;

/**
 * Class ProgTerminateException
 * @author Vinayak
 *
 */
public class ProgTerminateException extends RuntimeException
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Parameterised Constructor.
	 * @param msg
	 */
	public ProgTerminateException(String msg)
	{
			super(msg);
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage()
	{
		return super.getMessage();
	}
}