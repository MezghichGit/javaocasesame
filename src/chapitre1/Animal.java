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
	public Animal() {  // constructeur par d�faut
		//System.out.println("Conctructeur");
		nbr++;
	}
	
	public Animal(String nom) {  // constructeur avec param�tre
		this.nom =nom;
		System.out.println("Conctructeur avec param�tre nom");
		nbr++;
	}
	
	public Animal(int age) {  // constructeur avec param�tre
		this.age = age;
		System.out.println("Conctructeur avec param�tre age");
		nbr++;
	}
	
	public Animal(int age, String nom) {  // constructeur avec 2 param�tres
		this.nom = nom;
		this.age = age;
		System.out.println("Conctructeur avec param�tre age");
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
	
	public void finalize() { // m�thode qui sera appeler suite � System.gc()
		
		System.out.println("Destruction de Animal...");
	}
	
}
class Oieau{}