package vect;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

//import entities.Prod;


public class Ex2Classe {

	public static void main(String[] args) {
				/*
				 * Make a program to read an integer N and the data (name and price) of N
				 * Products. Store the N products in a vector. In then show the average price of
				 * the products.
				 * 
				 */
																											//OS VETORES ARMAZENARÃO CLASSES!!!!!!
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		/*
		 * int n =sc.nextInt(); 
		 * Prod[] vect = new Prod [n];
		 * 
		 * for (int i =0; i<vect.length; i++) { sc.nextLine(); 
		 * String name=sc.nextLine();     //read the informations 
		 * double price = sc.nextDouble();      //read the informations 
		 * vect[i]= new Prod(name,price);      //faz o indice do vetor apontar p cada um 
		 * }
		 * 
		 * double sum=0; 
		 * for(int i = 0; i<vect.length; i++) { 
		 * sum+= vect[i].getPrice();
		 * }
		 * 
		 * System.out.printf("Media = %.2f%n", sum/vect.length);
		 */
		
		//EXERCICIO DE FIXAÇAO
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Room[] vectu = new Room [10];
		for (int i = 0; i<n; i++) {
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email= sc.nextLine();
			System.out.println("Room: ");
			int room=sc.nextInt();
			vectu[room]= new Room(name,email);                                               // A SACADA É COLOCAR A ROOM COMO INDICE DO VETOR  *******
		}																													 // NA HORA DE PRINTAR VAI FICAR MUITO MAIS FACIL ***************
																														
		
		System.out.println("Busy rooms:");
		for (int i =0; i<10;i++) {
			if (vectu[i] != null) { 																				// NA HORA DE LER, É SÓ VER QUEM NAO TA VÁZIO *******************
				System.out.println(i+": "+vectu[i]);
			}
		}
		sc.close();
	}
}
