package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int count=0;
		
		int[ ] [ ] matriz = new int [n] [n];                  // INSTANCIANDO A MATRIZ, SE QUISESSE MAIS UMA DIMENSAO, SO BOTAR MAIS 1  [ ]
		
		for(int i=0; i<matriz.length; i++) { 										// FOR QUE PERCORRE AS ----------##++LINHAS++##----------
			for (int j=0;j<matriz[i].length; j++) {										// FOR QUE PERCORRE AS ---------##++COLUNAS++##----------
				matriz [i][j]=sc.nextInt();
			}
		}
		System.out.println("Main diagonal:");
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz [i] [i]+" ");
		}
		System.out.println();
		System.out.println("Negative numbers:");
		for(int i=0; i<matriz.length; i++) { 										
			for (int j=0;j<matriz[i].length; j++) {										
				if (matriz [i][j]<0 ){
					System.out.print(matriz [i] [j]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Total negative numbers: "+count);
		sc.close();

	}

}

