package chapitre1;


public class App {

	public static void main(String[] args) {
		
		String ch = "oca";
		//System.out.println(Animal.nbr);
		
		
		//Animal a1 = new Animal(); // appel au constructeur par défaut
		/*System.out.println(Animal.nbr);*/
		///Animal a2 = new Animal();
		/*System.out.println(Animal.nbr);
		
		System.out.println(a1.nbr);*/
		
		///////////// Les types primitifs en Java
		/*
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int x = 1_000_000;
		double y = 1_2.5;
		
		int k = 0X12FE;  //Base Hexa
		System.out.println(k);
		
		int h = 0B111;  //Base Binaire
		System.out.println(h);
		
		int j = 012;   //Base Octale
		System.out.println(j);*/
		
		int _ = 10;
		int $ = 12;
		
		int x3;  // variable locale
		//System.out.println(x3);
		//System.out.println(_);
		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		long v1 = 9223372036854L;
		
		float f = 12.5F;
		
		
		Animal a1 = new Animal();
		System.out.println(a1.age);
		System.out.println(a1.canSwim);
		System.out.println(a1.poids);
		System.out.println(a1.nom);

	}

}
