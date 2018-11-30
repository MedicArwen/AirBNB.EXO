package thierrybru.AirBNB2.logements;

import thierrybru.AirBNB2.utilisateurs.Hote;

public abstract class Logement {
	private Hote mHote;
	private int mTarifJournalier;
	private String mAdresse;
	private int mSuperficie;
	private int mNbVoyageursMax;
	
	public int GetTarifJournee() {return mTarifJournalier;}
	public Hote getHote () { return mHote;}	
	public String getAdresse() { return mAdresse;}
	public int getSuperficie() {return mSuperficie;}
	public int getNbVoyageursMax() {return mNbVoyageursMax;}

	public abstract int getSuperficieTotale();
	public abstract void afficher();
	
	public Logement(){}
	public Logement(Hote pHote,int pTarifJournee, String pAdresse, int pSuperficie, int pNbVoyageursMax)
	{
		this.mHote=pHote;
		this.mTarifJournalier=pTarifJournee;
		this.mAdresse = pAdresse;
		this.mSuperficie=pSuperficie;
		this.mNbVoyageursMax =pNbVoyageursMax;
	}
	

	
}
