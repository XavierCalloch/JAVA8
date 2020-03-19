package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.commande;

public interface IFournisseur {
	/**
	 * @return false par défaut
	 */
	default public boolean livre() {
		return false;
	}
	
	public void commande(List<commande> listcommande);
	
	/**
	 * @return true par défaut
	 */
	default public boolean isFournisseur() {
		return true;
	}
}
