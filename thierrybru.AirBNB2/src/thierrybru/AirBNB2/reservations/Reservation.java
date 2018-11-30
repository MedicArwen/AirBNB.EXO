package thierrybru.AirBNB2.reservations;


import java.util.Date;

import thierrybru.AirBNB2.utilisateurs.Voyageur;
/**
 * 
 * @author etudiant-16
 *
 */
public class Reservation
{
	private int mIdentifiant;
	private Sejour mSejour;
	private Voyageur mVoyageur;
	private boolean mEstValidee;
	private Date mDateReservation;
	public Reservation(int pIdentifiant, Sejour pSejour, Voyageur pVoyageur) {
		this.mIdentifiant = pIdentifiant;
		this.mSejour = pSejour;
		this.mVoyageur = pVoyageur;
		this.mEstValidee = false;
		this.mDateReservation = mSejour.getDateArrivee();
	}
	/**
	 * show a String describing the reservation of an houses
	 */
	public void afficher()
	{
		System.out.println(this.mVoyageur.getInfoPersonne()+" ​a​ ​fait​ ​une​ ​réservation​ ​chez​ "+this.mSejour.getLogement().getHote().getInfoPersonne());
		this.mSejour.afficher();
	}
	
	
}
