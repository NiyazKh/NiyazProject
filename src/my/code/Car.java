package my.code;

import java.util.Scanner;

public class Car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String car = in.next();
		
		if (car.equals("car")){
			System.out.println("        000000");
			System.out.println("       00000000");
			System.out.println("  000000000000000");
			System.out.println(" 000000000000000000");
			System.out.println(" 000 .. 00000 .. 00");
			System.out.println("    0000     0000");
			System.out.println("     **       **");
		} else {
			System.out.println("incorrect");
		}
		
		//                   000000
		//                  00000000
		//             000000000000000
		//            000000000000000000
		//            000 .. 00000 .. 00
		//               0000     0000
		//                **       **
	}

}

