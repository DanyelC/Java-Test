package matriz;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] matriz = new int[l][c];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		int obs = sc.nextInt();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (obs == matriz[i][j]) {
					System.out.println("Position " + i + ", " + j + " :");
					if (j != 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					} // left right up down
					if (j < c - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i != 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i < l - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}
}
