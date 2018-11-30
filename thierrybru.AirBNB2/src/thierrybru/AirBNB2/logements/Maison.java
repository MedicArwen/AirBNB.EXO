package thierrybru.AirBNB2.logements;

import thierrybru.AirBNB2.utilisateurs.Hote;

public class Maison extends Logement{
	private int mSuperficieJardin;
	private boolean mPossedePiscine;
	
	public Maison(Hote pHote,int pTarifJournee, String pAdresse, int pSuperficie, int pNbVoyageursMax, boolean pPossedePiscine, int pSuperficieJardin)
	{
		super( pHote, pTarifJournee,  pAdresse,  pSuperficie,  pNbVoyageursMax);
		this.mPossedePiscine=pPossedePiscine;
		this.mSuperficieJardin=pSuperficieJardin;
	}
	public int getSuperficieTotale()
	{
		return super.getSuperficie()+this.mSuperficieJardin;
	}
	private String infoJardin()
	{
		if (mSuperficieJardin>0)
			return "Jardin: Oui ("+this.mSuperficieJardin+")";
		else
			return "Jardin: Non";
	}
	private String infoPiscine()
	{
		if (this.mPossedePiscine)
			return "Piscine: Oui";
		else
			return "Piscine: Non";
	}
	
	@Override
	public void afficher()
	{
		this.getHote().afficher();
		System.out.println("\nLe logement est une maison située "+super.getAdresse());
		System.out.println("Superficie: "+getSuperficieTotale()+"m2");
		System.out.println(infoJardin());
		System.out.println(infoPiscine());
	}
}
