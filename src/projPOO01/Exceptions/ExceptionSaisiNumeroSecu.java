package projPOO01.Exceptions;

/** Classe qui représente une exception levée sur une saisie de numéro de sécurité sociale
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class ExceptionSaisiNumeroSecu extends Exception {

	/**
	 * Constante (serializable)
	 */
	private static final long serialVersionUID = 1L;

	/** Constructeur
	 * 
	 */
	public ExceptionSaisiNumeroSecu() {
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 */
	public ExceptionSaisiNumeroSecu(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param cause
	 */
	public ExceptionSaisiNumeroSecu(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 */
	public ExceptionSaisiNumeroSecu(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/** Constructeur
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ExceptionSaisiNumeroSecu(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
