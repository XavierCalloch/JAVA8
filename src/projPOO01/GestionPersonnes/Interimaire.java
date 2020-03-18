package projPOO01.GestionPersonnes;

import projPOO01.Exceptions.ExceptionSaisiNumeroSecu;

/** Représente un intérimaire
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Interimaire extends Salarie {
	
	/** contrat de l'agence de l'intérimaire */
	private String contratAgence;
	
	/** durée du contrat en mois */
	private int duree;
	
	/** Constructeur
	 * @param nom			nom de l'intérimaire
	 * @param prenom		prénom de l'intérimaire
	 * @param adresse		adresse de l'intérimaire
	 * @param ville			ville de l'intérimaire
	 * @param codepostal	code postal de l'intérimaire
	 * @param secu			numéro de sécurité sociale de l'intérimaire
	 * @param salaire		salaire de l'intérimaire
	 * @param contratAgence	contrat de l'agence de l'intérimaire
	 * @param duree			durée du contrat en mois
	 */
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu, double salaire, String contratAgence, int duree) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.contratAgence = contratAgence;
		this.duree = duree;
	}
	
	/** Méthode qui retourne une exception si l'on saisit moins de 5 caractères dans le contrat
	 * de l'agence de l'intérimaire
	 * @param contratAgence contrat de l'agence de l'intérimaire
	 * @throws Exception
	 */
	public static void CtrlSaisiContratAgence(String contrat) throws Exception{
		if(contrat.length() < 5) {
			throw new Exception("Veuillez saisir au moins 5 caractères dans le contrat");
		}
	}
	
	/** Méthode qui retourne une exception si l'on saisit un contrat d'une durée inférieure ou égale à 1 mois
	 * @param d durée du contrat en mois
	 * @throws Exception
	 */
	public static void CtrlSaisiDureeContrat(int d) throws Exception{
		if(d <= 1) {
			throw new Exception("Veuillez saisir un contrat d'une durée supérieure à 1 mois");
		}
	}

	/** Getter
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/** Setter
	 * @param contratAgence the contratAgence to set
	 */
	public void setContratAgence(String contratAgence) {
		this.contratAgence = contratAgence;
	}

	/** Getter
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/** Setter
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
}
