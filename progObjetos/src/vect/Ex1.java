package vect;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
					/*
					 * Make a program to read an integer N and the height of N people. Store the N
					 * heights in a vector. Then show the average height of these people.
					 * 
					 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i=0; i<n; i++ ) {
			vect[i]= sc.nextDouble();
		}
		double soma=0;
		for(int i=0; i<n;i++) {
			soma+=vect[i];
		}
		double print=soma/n;
		System.out.printf("AVERAGE HEIGHT: %.3f",print);
		sc.close();
		

	}

}
