package progObjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cadastro nova=new Cadastro();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char resposta = sc.next().charAt(0);
		
		if (resposta=='y') {
			System.out.print("Enter initial deposit value: ");
			double deposit=sc.nextDouble();
			nova=new Cadastro(number, holder,deposit);
		}else {
			nova=new Cadastro(number, holder);
		}
		
		System.out.println("");
		
		System.out.println("Account data:");
		System.out.println(nova);
		
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		double balance = sc.nextDouble();
		nova.deposit(balance);
		System.out.println("Updated account data:");
		System.out.println(nova);
		
		System.out.println("");
		
		System.out.print("Enter a withdrawl value: ");
		balance = sc.nextDouble();
		nova.withdrawl(balance);
		System.out.println("Updated account data:");
		System.out.println(nova);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
