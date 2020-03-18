package projPOO01.GestionPersonnes;

import java.util.ArrayList;
import java.util.List;

import projPOO01.Exceptions.ExceptionNumeroUnique;
import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.commande;

/** Représente un client
 * @author Xavier CALLOCH
 * Date: 2020-03-18
 *
 */
public class Client extends Personne implements IFournisseur, IClient {

	
	/** identifiant client */
	private int idclient;
	/** liste d'achats */
	private List<Achat> achats = new ArrayList<Achat>();


	/** Constructeur
	 * @param nom nom du client
	 * @param prenom prénom du client
	 * @param adresse adresse du client
	 * @param ville ville du client
	 * @param codepostal code postal du client
	 * @param idclient identifiant du client
	 */
	public Client(String nom, String prenom, String adresse, String ville, String codepostal, int idclient) {
		super(nom, prenom, adresse, ville, codepostal);
		// TODO Auto-generated constructor stub
		this.idclient=idclient;
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "[idclient=" + idclient + ", achats=" + achats+"]";
	}



	/**
	 * @return
	 */
	public int getIdclient() {
		return idclient;
	}


	public List<Achat> getAchats() {
		return achats;
	}



	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}


	@Override
	public boolean livre() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void commande(List<commande> listcommande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void achete(List<Achat> listachat) {
		// TODO Auto-generated method stub
		this.achats = listachat;

	}

	@Override
	public boolean paie() {
		// TODO Auto-generated method stub

		return true;
	}



	@Override
	public boolean isClient() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public boolean isFournisseur() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void CtrlNumeroUniqueClient(String ns, ArrayList<Client> list) throws ExceptionNumeroUnique{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
				
			
		}catch(Exception e) {
			throw new ExceptionNumeroUnique("Le numero saisi n'est pas un entier");
		}
		for(Client c1:list) 
		{
			if(n!=c1.getIdclient()) {
				
			}else {
				throw new ExceptionNumeroUnique("Le numero unique est déja utilisé");
				
			}
		}
		
	}

}
