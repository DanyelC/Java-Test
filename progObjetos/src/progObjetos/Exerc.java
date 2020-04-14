package progObjetos;

import java.util.Locale;
import java.util.Scanner;


import entities.CurrencyConverter;

public class Exerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Rect rect=new Rect();
		 * System.out.println("Escreva os valores da Base e da Altura:");
		 * rect.Height=sc.nextDouble(); rect.Width=sc.nextDouble();
		 * System.out.println("AREA: "+ rect.area()); System.out.println("PEREIMETER: "+
		 * rect.perimeter()); System.out.println("DIAGONAL: "+ rect.diagonal());
		 */
		/*
		 * 
		 * 
		 * ==========OUTRO EXERCICIO===============
		 * 
		 * 
		 * 
		 * Employee emp = new Employee(); System.out.print("Name: "); String
		 * nome=sc.nextLine(); emp.Name =nome; System.out.print("Gross Salary: ");
		 * double salario = sc.nextDouble(); emp.GrossSalary=salario;
		 * System.out.print("Tax: "); salario=sc.nextDouble(); emp.Tax=salario;
		 * System.out.println(); System.out.println("Employee: " + emp);
		 * System.out.println();
		 * System.out.print("Which percentage to increase salary? "); double percentage
		 * = sc.nextDouble(); emp.increaseSalary(percentage); System.out.println();
		 * System.out.println("Updated data: " + emp);
		 * 
		 * 
		 * 
		 * ==========OUTRO EXERCICIO===============
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		 * Aluno aluno= new Aluno(); String nome=sc.nextLine(); aluno.nome=nome; double
		 * n1,n2,n3; n1=sc.nextDouble(); n2=sc.nextDouble(); n3=sc.nextDouble();
		 * aluno.nota1=n1; aluno.nota2=n2; aluno.nota3=n3; aluno.total();
		 * aluno.passou();
		 * 
		 * 
		 * ==========OUTRO EXERCICIO==============
		 * 
		 */
		System.out.println("What is the dollar price? ");
		double preco =sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		System.out.println("Amount to be paid in reais = "+ CurrencyConverter.dollarToReal(preco, quantity));
		
		
		sc.close();
	
	}

}
