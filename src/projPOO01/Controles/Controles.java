package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.util.Date;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

/** Classe qui permet d'effectuer des contrôles sur les dates et les nombres entiers saisis
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Controles {

	/** Méthode qui effectue un contrôle sur une date
	 * @param d une chaîne de caractères représentant une date
	 * @return Date une date
	 * @throws ExceptionDate
	 */
	public static Date CtrlDate(String d) throws ExceptionDate{
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		sd.setLenient(false);
		Date dt = new Date();
		try {
			dt =sd.parse(d);
			
		}catch(Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}
	
	/** Méthode qui effectue un contrôle sur un nombre entier
	 * @param ns une chaîne de caractères représentant un nombre entier
	 * @throws ExceptionInt
	 */
	public static void CtrlInt(String ns) throws ExceptionInt{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
		}catch(Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}
		
		}
	
}
