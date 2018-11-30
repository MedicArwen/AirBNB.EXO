package thierrybru.AirBNB2.logements;

import thierrybru.AirBNB2.utilisateurs.Hote;

public class Appartement extends Logement{
	private int mNumeroEtage;
	private int mSuperficieBalcon;
	
	public int getSuperficieTotale()
	{
		return super.getSuperficie()+ mSuperficieBalcon;
	}

	public Appartement(Hote pHote,int pTarifJournee, String pAdresse, int pSuperficie, int pNbVoyageursMax, int pNumeroEtage, int pSurfaceBalcon)
	{
		super( pHote, pTarifJournee,  pAdresse,  pSuperficie,  pNbVoyageursMax);
		this.mNumeroEtage=pNumeroEtage;
		this.mSuperficieBalcon=pSurfaceBalcon;
	}
	
	private String infoBalcon()
	{
		if (mSuperficieBalcon>0)
			return "Balcon: Oui ("+this.mSuperficieBalcon+")";
		else
			return "Balcon: Non";
	}
	private String infoEtage()
	{
		String texte="";
		switch (this.mNumeroEtage) {
		case 0:
			texte=" au rez-de-chaussée";
			break;
		case 1:
			texte=" au 1er étage";
			break;
		default:
			texte=" au "+this.mNumeroEtage+"ème étage";
			break;
		}
		return texte;
	}
	@Override
	public void afficher()
	{
		this.getHote().afficher();
		System.out.print("\nLe logement est un appartement située "+super.getAdresse());
		System.out.println(infoEtage());
		System.out.println("Superficie: "+this.getSuperficieTotale()+"m2");
		System.out.println(infoBalcon());
	}
}
