package chapitre1;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a2 = a3;
		a1 = null;
		
		System.gc(); //appel explicte au garbage collector
		
		for(int i = 0; i<1000; i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Suite du programme...");

	}

}
