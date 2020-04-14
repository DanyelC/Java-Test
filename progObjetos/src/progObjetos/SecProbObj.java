package progObjetos;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class SecProbObj {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Price: ");
		double price=sc.nextDouble();
		
		Product prod = new Product(name, price);
		//double xa=prod.totalValueinStock();
		
		System.out.println("Product data: "+prod);
		System.out.println("");
		System.out.print("Enter with the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.addProducts(quantity);
		System.out.println("Updated data: "+prod);
		System.out.print("Enter with the number of products to be removed in stock: ");
		quantity=sc.nextInt();
		prod.removeProducts(quantity);
		System.out.println("Updated data: "+prod);


		
		
		
		sc.close();
	}

}
