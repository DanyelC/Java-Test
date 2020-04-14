import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		int k = 10;
		double x = 11.34734;
		String nome = "Maria";
		int idade = 31;
		double renda = 4439.17; 
		System.out.println("Olá,mundo");
		System.out.println(x);
		System.out.println(k);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US); // so p fazer sair 11.35 ao inves de 11,35
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " +x+ " Metros" ); // Printar string e valor. "+" é p concatenar
		System.out.printf("Resultado = %.2f metros%n", x); // mais fácil %n é pula linha
		System.out.printf("%s tem %d anos e ganha %.2f reais todo mês%n", nome, idade, renda);
	    

		
	}

}
