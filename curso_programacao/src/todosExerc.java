import java.util.Locale;
import java.util.Scanner;

public class todosExerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);          //TALVEZ SEJA BOM ATIVAR DPS
		Scanner sc = new Scanner(System.in);
		//  **************************************   EXERCICIO UM **************************************
		
		/*
		 * int a = sc.nextInt(); int b = sc.nextInt(); sc.close(); int c= a+b;
		 * System.out.println("SOMA :" + c);
		 */
		//********************************************************************************************************************************************************
		
		
		
		//  **************************************  EXERCICIO DOIS *************************************
		/*
		 * double raio = sc.nextDouble(); double pi = 3.14159; sc.close(); double area =
		 * Math.pow(raio,2)*pi; System.out.printf("A=%.4f%n", area);
		 */
		//********************************************************************************************************************************************************
		
		
		//  **************************************  EXERCICIO TRES **************************************
		/*
		 * int a = sc.nextInt(); int b= sc.nextInt(); int c= sc.nextInt(); int d=
		 * sc.nextInt(); int res= a*b-c*d; System.out.println("DIFERENÇA = " + res);
		 */
		//********************************************************************************************************************************************************
		
		
		//  **************************************  EXERCICIO QUATRO *************************************
		/*
		 * int n = sc.nextInt(); int h = sc.nextInt(); double s = sc.nextDouble();
		 * double salario = h*s; System.out.println("NUMBER: " + n);
		 * System.out.printf("SALARY: U$ %.2f%n", salario);
		 */
		//********************************************************************************************************************************************************
		
		
		//  **************************************  EXERCICIO CINCO **************************************
		/*
		 * int cod1, cod2, num1, num2; double pre1, pre2; cod1 = sc.nextInt(); num1 =
		 * sc.nextInt(); pre1 = sc.nextDouble(); cod2 = sc.nextInt(); num2 =
		 * sc.nextInt(); pre2 = sc.nextDouble();
		 * 
		 * double valor = num1*pre1 + num2*pre2;
		 * System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		 */
		//********************************************************************************************************************************************************
		
		
		//  ************************************** EXERCICIO SEIS(PREGUIÇA) **************************************
		double a,b,c,tri,cic,tra,qua,ret;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		tri=a*c*0.5;
		cic=c*c*3.14159;
		tra=(a+b)*c*0.5;
		qua=Math.pow(b, 2);
		ret=a*b;
		System.out.println(tri+" "+cic+" "+tra+" "+qua+" "+ret);
		
		// JEITO CERTO:
		/*
		 * triangulo = A * C / 2.0; circulo = 3.14159 * C * C; trapezio = (A + B) / 2.0
		 * * C; quadrado = B * B; retangulo = A * B;
		 * 
		 * System.out.printf("TRIANGULO: %.3f%n", triangulo);
		 * System.out.printf("CIRCULO: %.3f%n", circulo);
		 * System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		 * System.out.printf("QUADRADO: %.3f%n", quadrado);
		 * System.out.printf("RETANGULO: %.3f%n", retangulo);
		 */
		sc.close();
	}

}
