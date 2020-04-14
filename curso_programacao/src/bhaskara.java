import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		Scanner conta = new Scanner(System.in);
		
		//r = [-b +/- raiz(DELTA)]/ 2a
		//DELTA = quadrado(b) - 4ac
		
		double A, B, C, R1, R2, Delta;
		A=conta.nextDouble();
		B=conta.nextDouble();
		C=conta.nextDouble();
		
		Delta= (Math.pow(B, 2.0) - 4*A*C);
		R1= (0-B + Math.sqrt(Delta))/2.0*A;
		R2= (0-B - Math.sqrt(Delta))/2.0*A;
		System.out.println(R1);
		System.out.println(R2);
		
		conta.close();
	}

}
