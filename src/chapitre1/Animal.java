package chapitre1;

public class Animal {

	// Les membres d'un classe
	
	//attributs d'instance
	String nom;
	int age;
	double poids;
	boolean canSwim;
	// attribut de classe
	static int nbr;
	
	int TRUE;
	public Animal() {  // constructeur par défaut
		//System.out.println("Conctructeur");
		nbr++;
	}
	
	public Animal(String nom) {  // constructeur avec paramètre
		this.nom =nom;
		System.out.println("Conctructeur avec paramètre nom");
		nbr++;
	}
	
	public Animal(int age) {  // constructeur avec paramètre
		this.age = age;
		System.out.println("Conctructeur avec paramètre age");
		nbr++;
	}
	
	public Animal(int age, String nom) {  // constructeur avec 2 paramètres
		this.nom = nom;
		this.age = age;
		System.out.println("Conctructeur avec paramètre age");
		nbr++;
	}
	
	//bloc d'initialisation d'instance
	/*{
		System.out.println("Bloc d'initialisation d'instance");
	}
	
	//bloc d'initialisation de classe
	static {
		System.out.println("Bloc d'initialisation de classe");
	}*/
	
	public void finalize() { // méthode qui sera appeler suite à System.gc()
		
		System.out.println("Destruction de Animal...");
	}
	
}
class Oieau{}