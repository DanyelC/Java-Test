package progObjetos;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class progObjetos {								                                            //APRENDA A FAZER DIAGRAMA UML

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double a,b,c,d,e,f;
		Triangle x,y;
		x=new Triangle();
		y=new Triangle();		                                                                      //APRENDA A FAZER DIAGRAMA UML
		
		// double px,py;
		
		double areax,areay;
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble(); //guardar o numero no atributo "a" do objeto x, que é da classe triangle
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		
		/*
		 * px = (x.a+x.b+x.c)/2; py = (y.a+y.b+y.c)/2; areax =
		 * Math.sqrt((px*(px-x.a)*(px-x.b)*(px-x.c))); areay =
		 * Math.sqrt((py*(py-y.a)*(py-y.b)*(py-y.c)));
		 */
		
		areax = x.area();
		areay = y.area();
		
		System.out.printf("Triangle X area: %.4f%n",areax);
		System.out.printf("Triangle Y area: %.4f%n",areay);
		if (areax>areay) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
	
	                                                                                                                   //APRENDA A FAZER DIAGRAMA UML
}
