package thierrybru.AirBNB2.reservations;

import java.util.Date;

import thierrybru.AirBNB2.logements.Logement;

public class SejourCourt extends Sejour implements ConditionsTarifairesInterfaces{

	public SejourCourt(Date pDateArrivee, int pNbNuits, Logement pLogement, int pNbVoyageurs) {
		super(pDateArrivee, pNbNuits, pLogement, pNbVoyageurs);
		this.miseAJourDuPrix(pLogement.GetTarifJournee()*this.getNbNuit()*getNbVoyageurs() );
	}
	public boolean beneficiePromotion()
	{
		return false;
	}
	public void afficher() {
		this.getLogement().afficher();
		String affichage="La​ ​date​ ​d'arrivée​ ​est​ ​le​ "+this.getmDateArriveeString()+"​ ​pour​ "+this.getNbNuit()+"​ ​nuits.";
		affichage+="\n Le​ ​prix​ ​de​ ​ce​ ​séjour​ ​est​ ​de​ ​"+this.getPrix()+"€.";		
		System.out.println(affichage);
	}
	public boolean verificationNombreDeVoyageurs()
	{
		return (this.getNbVoyageurs()<this.getLogement().getNbVoyageursMax());
	}
	public void miseAJourDuPrix(int pNouveauPrixSejour)
	{
		this.setPrix(pNouveauPrixSejour);
	}
}
