package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ListEmployee;

public class exLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ListEmployee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n= sc.nextInt();
		System.out.println("");
		
		for (int i=1; i<=n;i++) {
			System.out.println("Emplyoee #"+i+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new ListEmployee(id,name,salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int sortudoID = sc.nextInt();
		ListEmployee teste = list.stream().filter(x -> x.getId() ==sortudoID).findFirst().orElse(null);   //cria uma nova lista "teste" com herança, 
		if (teste == null) {																																//filtrando para ter apenas o obj que voce quer
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			teste.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (ListEmployee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

		
		
	}

}
