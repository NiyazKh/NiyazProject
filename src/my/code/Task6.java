package my.code;

import java.util.Scanner;

public class Task6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int i=0; i<q; i++) {
			for (int k = 0; k<i; k++){
				System.out.print(" ");
				}
			for (int j = q; j>i; j--){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
