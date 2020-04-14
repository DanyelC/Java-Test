package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class adj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista= new ArrayList<>();
		
		lista.add("primeiro");
		lista.add("segundo");
		lista.add("quarto");
		lista.add("terceiro");
		lista.add("quarto");
		
		System.out.println(lista);
		
		Collections.reverse(lista);
		List <String> lili= new ArrayList<>(lista);
		Collections.reverse(lista);
		System.out.println(lista);
		System.out.println(lili);
		
		System.out.println(lili.lastIndexOf("quarto"));
	}

}
