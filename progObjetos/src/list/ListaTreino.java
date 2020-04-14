package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTreino {
	
	public static void main(String[] args) {
		
		List<String> nome = new ArrayList<>(); 						
		String a="MA";
		for (int i = 0; i<10; i++) {
			nome.add(a);
			a+="A";
		}
		nome.add(1, "QUALFOI");
		System.out.println(nome.size());
		System.out.println(nome);
		
		nome.removeIf( x -> x.charAt(1)!='A');
		System.out.println(nome);
	}
}