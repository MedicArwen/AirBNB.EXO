package thierrybru.AirBNB2.utilisateurs;

public class Hote extends Personne{
private int mDelaiReponse;

/**
 * 
 * @param pPrenom prénom de l'hote
 * @param pNom nom de l'hote
 * @param pAge age en année de l'hote
 * @param pDelaiReponse délai de réponse en heure
 */
	public Hote(String pPrenom,String pNom,int pAge,int pDelaiReponse)
	{
		super(pPrenom, pNom, pAge);
		this.mDelaiReponse=pDelaiReponse;
	}
	@Override
	public void afficher()
	{
		super.afficher();
		System.out.print(" qui s'engage à répondre dans");
		if (this.mDelaiReponse==1)
			{
			System.out.print(" l'heure.");
			}
		else
			{
			System.out.print(" les "+this.mDelaiReponse+" heures.");
			}
	}
}
