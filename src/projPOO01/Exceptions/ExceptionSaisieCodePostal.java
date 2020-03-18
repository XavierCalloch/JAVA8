package projPOO01.Exceptions;

/** Classe qui représente une exception levée sur une saisie de code postal
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class ExceptionSaisieCodePostal extends Exception {

	/**
	 * Constante (serializable)
	 */
	private static final long serialVersionUID = 1L;

	/** Constructeur
	 * 
	 */
	public ExceptionSaisieCodePostal() {
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 */
	public ExceptionSaisieCodePostal(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param cause
	 */
	public ExceptionSaisieCodePostal(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 */
	public ExceptionSaisieCodePostal(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ExceptionSaisieCodePostal(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
