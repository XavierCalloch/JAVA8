package projPOO01.Exceptions;

/** Classe qui représente une exception levée sur un nombre entier
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class ExceptionInt extends Exception {

	/**
	 * Constante (serializable)
	 */
	private static final long serialVersionUID = 1L;

	/** Constructeur
	 * 
	 */
	public ExceptionInt() {
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 */
	public ExceptionInt(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 */
	public ExceptionInt(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 * @param arg1
	 */
	public ExceptionInt(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public ExceptionInt(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
