package wild;


//Cr�ation de la classe Wilder
public class Wilder {

//Cr�ation des variables d'instance la classe Wilder : prenom, nom,age
	String prenom;
	String nom;
	int age;
	public void sayHello() {
	System.out.println("Bonjour, je m'appelle "+prenom+" "+nom);
	}	

	
// Cr�ation du constructeur par d�faut	
public Wilder () {
		prenom = "inconnu";
		nom = "inconnu";
		age = 0;
}

//Cr�ation du constructeur avec param�tre	
public Wilder(String pPrenom, String pNom, int pAge)	{
	prenom = pPrenom;
	nom = pNom;
	age = pAge;
	}


		
}
