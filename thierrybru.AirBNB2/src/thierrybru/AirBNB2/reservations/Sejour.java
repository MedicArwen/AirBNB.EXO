package thierrybru.AirBNB2.reservations;

import java.text.SimpleDateFormat;
import java.util.Date;

import thierrybru.AirBNB2.logements.Logement;

public abstract class Sejour implements ServiceInterface 
{
private Date mDateArrivee;
private int mNbNuits;
private Logement mLogement;
private int mNbVoyageurs;
private int mPrix;
public Logement getLogement() {return mLogement;}
public int getNbNuit() {return mNbNuits;}
public int getNbVoyageurs() {return mNbVoyageurs;}
public int getPrix() {return mPrix;}
public void setPrix(int pPrixSejour) { mPrix=pPrixSejour;}

public String getmDateArriveeString() {
	SimpleDateFormat formater = null;
	formater = new SimpleDateFormat("dd/MM/yyyy");
	return formater.format(mDateArrivee);
}
public Date getDateArrivee()
{
	return mDateArrivee;
}

public Sejour(Date pDateArrivee, int pNbNuits, Logement pLogement, int pNbVoyageurs) {
	super();
	this.mDateArrivee= pDateArrivee;
	this.mNbNuits = pNbNuits;
	this.mLogement = pLogement;
	this.mNbVoyageurs = pNbVoyageurs;
}

public abstract void afficher();
public boolean verficationDateArrivee()
{
	return this.mDateArrivee.after((new Date()));
}
public boolean verificationNombreDeNuits()
{
		return ((this.mNbNuits<=31)&&(this.mNbNuits>0));
}
public abstract boolean verificationNombreDeVoyageurs();
public abstract void miseAJourDuPrix(int pNouveauTarif);

}
