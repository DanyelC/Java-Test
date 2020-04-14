import java.util.Scanner;


public class EntradaTeste {

	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		
		//String x;
		//x = teste.next();
		//System.out.println("Você digitou: " + x);
		//teste.close();
		//int k;
		//String x;
		//double z;
		//k = teste.nextInt();
		//x = teste.next();
		//z = teste.nextDouble(); 
	//	System.out.printf("Vc digitou: %d , %s e %.2f%n", k,x,z);
		//ou fazer
	//	System.out.println("Digitados: ");
	//	System.out.println(k);
	//	System.out.println(x);
	//	System.out.println(z);
	//	teste.close();
		

		
//         FAZENDO LER ATE A PESSOA DAR ENTER
		
		String a, b, c;
		int x;
		char d;
		
		x=teste.nextInt();
		
		teste.nextLine();  //apenas p pegar o enter dps de digitar o enter
		
		a=teste.nextLine();
		b=teste.nextLine();
		c=teste.nextLine();
		d=teste.next().charAt(1);
		System.out.println(x);
		System.out.println(d);
		System.out.print("Voce digitou na primeira linha: ");
		System.out.println(a);
		System.out.print("Voce digitou na segunda linha: ");
		System.out.println(b);
		System.out.print("Voce digitou na terceira linha: ");
		System.out.println(c);
		teste.close();
		
	}

}
