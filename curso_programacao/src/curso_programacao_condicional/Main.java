package curso_programacao_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		//*************************************************************************************************
		/*
		 * int a= sc.nextInt(); if(a>=0) { System.out.println("POSITIVO"); }else {
		 * System.out.println("NEGATIVO"); }
		 */
		//************************************************************************************************
		
		
		//************************************************************************************************
		/*
		 * int a= sc.nextInt(); if(a%2 != 0) { System.out.println("ÍMPAR"); }else {
		 * System.out.println("PAR"); }
		 */
		//************************************************************************************************
		
		
		//************************************************************************************************
		/*
		 * int a, b; a=sc.nextInt(); b=sc.nextInt(); if (a%b == 0 || b%a == 0) {
		 * System.out.println("MÚLTIPLOS"); }else { System.out.println("NÃO MÚLTIPLOS");
		 * }
		 */
		//************************************************************************************************

		
		//************************************************************************************************
		/*
		 * int a,b; a=sc.nextInt(); b=sc.nextInt(); if (a==b){
		 * System.out.println("O JOGO DUROU 24 HORAS(S)"); }else if (a<b) {
		 * System.out.println("O JOGO DUROU " + (b-a) + " HORAS"); }else {
		 * System.out.println("O JOGO DUROU " + (24-a+b) + " HORA(S)"); }
		 */
		//************************************************************************************************
		
		
		//************************************************************************************************
		/*
		 * double a,b,c,d,e,z; int x,y; a = 4.00; b = 4.50; c = 5.00; d = 2.00; e =
		 * 1.50; x = sc.nextInt(); y = sc.nextInt();
		 * 
		 * if(x==3) { System.out.printf("Total: R$ %.2f", c*y); }
		 */
		//************************************************************************************************
		
		
		//************************************************************************************************
		
		//([0,25], (25,50], (50,75], (75,100])
		/*
		 * double a=sc.nextDouble(); if (a>100 ||a<0) {
		 * System.out.println("Fora de intervalo");
		 * 
		 * }else if(a<=25){ System.out.println("Intervalo [0,25]");
		 * 
		 * } else if(a<=50){ System.out.println("Intervalo (25,50]");
		 * 
		 * }else if(a<=75){ System.out.println("Intervalo (50,75]");
		 * 
		 * }else { System.out.println("Intervalo (75,100]"); }
		 */
		//************************************************************************************************
		
		
		//************************************************************************************************
		/*
		 * double x,y; x=sc.nextDouble(); y=sc.nextDouble(); if (x==y && x==0) {
		 * System.out.println("ORIGEM"); }else if(x==0){ System.out.println("EIXO Y");
		 * }else if(y==0) { System.out.println("EIXO X"); }else if(x>0 && y>0) {
		 * System.out.println("Q1"); }else if(x>0 && y<0) { System.out.println("Q4");
		 * }else if (x<0 && y<0) { System.out.println("Q3"); }else {
		 * System.out.println("Q2"); }
		 */
		//************************************************************************************************
		sc.close();
	}

}
