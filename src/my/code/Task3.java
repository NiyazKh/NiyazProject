package my.code;

import java.util.Scanner;

public abstract class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int i=0; i<q; i++) {
			for (int j = -1; j<i; j++){
				System.out.print("*");
				}
			System.out.println(" ");
		}

	}

}
