package fr.aldayeh.FirstTpj;

public class Main {
	public static void game(int n) {
		  
		  int k= 50;
		  System.out.println("Entrer un nombre");
		  System.out.println(n);
		  if (k<n)			  
			  System.out.println("le nombre plus grand");
		  else
			  System.out.println("le nombre plus petit");
		  System.out.println("Entrer un nombre");
		  System.out.println(n);
		  
		

	}


	public static void main(String[] args) {
		
		
		
		System.out.println("Hello");
		String text;
		text ="Quel est votre nome ?";
		String age;
		age="Quel est votre age ?";
		
		System.out.println(text);
		
		
		String name="Nicolas";
		String nom ="Nicolas";
		if(name==nom)
			System.out.println("Nicolas");
		
		int ages=21;
		int agn=22;
		System.out.println(age);
		System.out.println(agn);
		if(ages==agn)
			System.out.println("Bonjour Nicolas, vous avez 21 ans");
		else
			System.out.println("Bonjour Nicolas, vous n'êtes pas Nicolas ");
		
		game(30);
		/*for (int i=0;i<5;i++) {
			System.out.println("faaa");
			System.out.println(i);
			System.out.println("faaa");
			String [] freinds= {"fawaz","ahmad", "yassin", "jean","Mari"};
			System.out.println(freinds[2]);
			
			//testjour1();
		}*/

	}

}
