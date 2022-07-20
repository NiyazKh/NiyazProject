package my.code;

import java.util.Scanner;

public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int w = in.nextInt();
		
		for (int i=0; i<q; i++) {
			for (int j=0; j<w; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
