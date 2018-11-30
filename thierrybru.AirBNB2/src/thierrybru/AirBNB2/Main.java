package thierrybru.AirBNB2;
import java.util.Date;
import java.util.Scanner;

import thierrybru.AirBNB2.logements.Appartement;
import thierrybru.AirBNB2.logements.Logement;
import thierrybru.AirBNB2.logements.Maison;
import thierrybru.AirBNB2.reservations.Reservation;
import thierrybru.AirBNB2.reservations.Sejour;
import thierrybru.AirBNB2.reservations.SejourCourt;
import thierrybru.AirBNB2.reservations.SejourLong;
import thierrybru.AirBNB2.utilisateurs.Hote;
import thierrybru.AirBNB2.utilisateurs.Voyageur;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("-> Exercice 1");
		Voyageur utilisateur =  new Voyageur("Maxime","Albert",28);
		utilisateur.afficher();
		
		System.out.println("-> Exercice 2");
		Hote proprietaire =  new Hote("Peter","Bardu",30,6);
		Maison maison = new Maison(proprietaire, 70, "​18​ ​Bis​ ​rue​ ​Romain​ ​Rolland,​ ​37230​ ​Fondettes", 140, 5,true,240);
		Appartement appartement = new Appartement(proprietaire, 49, "​78 rue du Paradis,​ ​37230​ ​Fondettes", 50, 5,2,10);
		System.out.println("-MAISON ");
		maison.afficher();
		System.out.println("-APPARTEMENT");
		appartement.afficher();
		System.out.println("-> Exercice 3");
		
		Sejour sejourPrevu = new Sejour(new Date(2016-1900,12-1,5), 4, maison, 1);
		sejourPrevu.afficher();
		
		System.out.println("-> Exercice 4");
		Reservation reservation = new Reservation(1,sejourPrevu, utilisateur);
		reservation.afficher();*/
		
		Voyageur utilisateur =  new Voyageur("BRU","Thierry",41);
		Hote proprietaire =  new Hote("Peter","Bardu",30,6);
		Reservation reservation =null;
		Maison maison = new Maison(proprietaire, 70, "​18​ ​Bis​ ​rue​ ​Romain​ ​Rolland,​ ​37230​ ​Fondettes", 140, 5,true,240);
		Appartement appartement = new Appartement(proprietaire, 49, "​78 rue du Paradis,​ ​37230​ ​Fondettes", 50, 5,2,10);
		System.out.println("Vous êtes:");
		utilisateur.afficher();
		System.out.println("quel logement voulez-vous?");
		System.out.println("Logement:1");
		maison.afficher();
		System.out.println("Logement:2");
		appartement.afficher();
		System.out.println("Saississez le numéro du logement que vous voulez.");
		int nbLogement=scanner.nextInt();	
		System.out.println("Quelle est la durée du séjour?");
		int dureeSejour=scanner.nextInt();
		if (nbLogement==1)
			reservation = creationSejour( utilisateur, maison,dureeSejour);	
		else
			reservation = creationSejour( utilisateur, appartement,dureeSejour);	
		System.out.println("*******RECAPITULATIF COMMANDE*****");
		reservation.afficher();

		
		
	}

	private static Reservation creationSejour(Voyageur pUtilisateur, Logement pLogementChoisi, int pDureeSejour) {
		Reservation reservation;
		System.out.println("Vous avez choisi le logement suivant pour votre séjour:");
		pLogementChoisi.afficher();
	
	
		if (pDureeSejour<6)
		{
			System.out.println("Vous avez choisi un séjour court.");
			SejourCourt sejour = new SejourCourt(new Date(2018-1900,12-1,5), pDureeSejour, pLogementChoisi, 2);
			reservation=new Reservation(1, sejour, pUtilisateur);
		}
		else
		{
			System.out.println("Vous avez choisi un séjour long.");
			SejourLong sejour = new SejourLong(new Date(2018-1900,12-1,5), pDureeSejour, pLogementChoisi, 2);
			reservation=new Reservation(1, sejour, pUtilisateur);
		}
		return reservation;
	}

}
