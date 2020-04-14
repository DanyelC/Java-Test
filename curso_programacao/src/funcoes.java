import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		// leia 3 numeros inteiros e imprima o maior deles
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 3 numbers and I'will tell you the highest");
		 System.out.println("So?");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 int higher=max(a,b,c); // max é funcao q vou criar
		 
		 showResult(higher); // funcao q vai printar
		 
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux; // so existe dentro dessa classe
		if( x>y && x>z) {
			 aux=x;
		 } else if(y>z) {
			 aux=y;
		 }else {
			 aux=z;
		 }
		return aux;
	}
	
	public static void showResult(int a) {
		System.out.println("Higher: "+a);
	}

}
