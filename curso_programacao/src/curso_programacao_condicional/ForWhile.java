package curso_programacao_condicional;

import java.util.Scanner;

public class ForWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * int x = sc.nextInt(); int contador = 0;
		 * 
		 * while (x!=0) { contador+=x; x=sc.nextInt();
		 * 
		 * 
		 * 
		 * } System.out.println(contador);
		 */
		// *********************************************************************************************
//		int x=sc.nextInt();
//		while (x!=2002) {
//			System.out.println("Senha Invalida");
//			x=sc.nextInt();
//		}
//		System.out.println("Acesso Permitido");
		// **************************************************************************************************

		/*
		 * int x, y; x = sc.nextInt(); y = sc.nextInt(); String lugar; while (x != 0 &&
		 * y != 0) { if (x > 0 && y > 0) { lugar = "primeiro"; } else if (x > 0 && y <
		 * 0) { lugar = "quarto"; } else if (x < 0 && y < 0) { lugar = "terceiro"; }
		 * else { lugar = "segundo"; } System.out.println(lugar); x = sc.nextInt(); y =
		 * sc.nextInt(); }
		 */
		// *******************************************************************************************************
		/*
		 * int a,x,y,z; x=y=z=0; a=sc.nextInt(); while(a!=0) { switch(a) { case 1: x+=1;
		 * a=sc.nextInt(); break; case 2: y+=1; a=sc.nextInt(); break; case 3: z+=1;
		 * a=sc.nextInt(); break; default: a=sc.nextInt(); break;
		 * 
		 * } } System.out.println("MUITO OBRIGADO"); System.out.println("Alcool: "+x);
		 * System.out.println("Gasolina: "+y); System.out.println("Diesel: "+z);
		 */
//		 int x=sc.nextInt();
//		 int k=0;
//		 int y;
//		 for(int i=0;i<x;i++) {
//			  y=sc.nextInt();
//			  k+=y;
//		 }
//		 System.out.println(k);

		/*
		 * int x = sc.nextInt(); for (int i=1; i<=x;i++) { if (i%2!=0) {
		 * System.out.println(i); } }
		 */

//		int x = sc.nextInt();
//		int in = 0;
//		int out = 0;
//		for (int i = 0; i < x; i++) {
//			int a = sc.nextInt();
//			if (a >= 10 && a <= 20) {
//				in += 1;
//			} else {
//				out += 1;
//			}
//		}
//		
//		System.out.println(in + " in");
//		System.out.println(out+ " out");
		 int x = sc.nextInt();
		 int y= sc.nextInt();
		 int z=sc.nextInt();
		 int aux;
		 
		 if( x>y && x>z) {
			 aux=x;
		 } else if(y>z) {
			 aux=y;
		 }else {
			 aux=z;
		 }
		 
		 System.out.println(aux);
		

		

		sc.close();
		}
	}


