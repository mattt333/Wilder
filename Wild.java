package wild;

public class Wild {
	
// Creation de la m�thode main
	public static void main(String[] args) {

// Instanciation d'un objet Wilder breton avec en param�tre le nom, prenom et age		
Wilder breton = new Wilder("Galette", "Saucisse", 33);

//Application de la m�thode sayHello � l'objet breton
breton.sayHello();


//Instanciation d'un objet Wilder amn�sique, utilisant les param�tres par d�faut		
Wilder amnesique = new Wilder();

//Application de la m�thode sayHello � l'objet inconnu
amnesique.sayHello();
	}

}
