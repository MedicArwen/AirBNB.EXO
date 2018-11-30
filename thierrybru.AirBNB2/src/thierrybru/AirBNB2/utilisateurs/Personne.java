package thierrybru.AirBNB2.utilisateurs;


public class Personne {
	private String mPrenom;
	private String mNom;
	private int mAge;
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	public Personne(String pPrenom,String pNom, int pAge)
	{
		this.mPrenom = pPrenom;
		this.mNom = pNom;
		this.mAge = pAge;
	}
	public String getInfoPersonne()
	{
		return this.mPrenom+" "+this.mNom+" ("+this.mAge+" ans)";
	}
	public void afficher()
	{
		 System.out.print(this.mPrenom+" "+this.mNom+" ("+this.mAge+" ans)");
	}
}
