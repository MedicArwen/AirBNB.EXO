package thierrybru.AirBNB2.reservations;

import java.util.Date;

import thierrybru.AirBNB2.logements.Logement;

public class SejourLong extends Sejour implements ConditionsTarifairesInterfaces {
	public final int PROMOTION_EN_POURCENTAGE = 20;
	private int mPromotion;
	public SejourLong(Date pDateArrivee, int pNbNuits, Logement pLogement, int pNbVoyageurs) {
		super(pDateArrivee, pNbNuits, pLogement, pNbVoyageurs);
		
		this.mPromotion = pLogement.GetTarifJournee() *PROMOTION_EN_POURCENTAGE/100;
		this.miseAJourDuPrix((pLogement.GetTarifJournee()-mPromotion)*this.getNbNuit()*getNbVoyageurs() );
	}
	public boolean beneficiePromotion()
	{
		return true;
	}
	public int getPromotion()
	{
		return this.mPromotion*this.getNbNuit()*getNbVoyageurs();
	}


	public void afficher() {
		this.getLogement().afficher();

		String affichage="La​ ​date​ ​d'arrivée​ ​est​ ​le​ "+this.getmDateArriveeString()+"​ ​pour​ "+this.getNbNuit()+"​ ​nuits.";
		int prix=this.getPrix()-this.getPromotion();
			affichage+="\nLe​ ​prix​ ​de​ ​ce​ ​séjour​ ​est​ ​de​ ​"+prix+"€ ("+this.getPromotion()+"€ de promotion).";
			affichage+="\nPrix Hors Promotion: ​"+this.getPrix()+"€.";
		
		System.out.println(affichage);
		}
	public boolean verificationNombreDeVoyageurs()
	{

		return (this.getNbVoyageurs()<this.getLogement().getNbVoyageursMax());
	}
	public void miseAJourDuPrix(int pNouveauPrix)
	{
		this.setPrix(pNouveauPrix);
	}
}
