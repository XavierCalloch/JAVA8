package projPOO01.Exceptions;

/** Classe qui représente une exception levée sur un numéro unique
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class ExceptionNumeroUnique extends Exception {

	/**
	 * Constante (serializable)
	 */
	private static final long serialVersionUID = 1L;

	/** Constructeur
	 * 
	 */
	public ExceptionNumeroUnique() {
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 */
	public ExceptionNumeroUnique(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param cause
	 */
	public ExceptionNumeroUnique(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 */
	public ExceptionNumeroUnique(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ExceptionNumeroUnique(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
