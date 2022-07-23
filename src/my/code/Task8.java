package my.code;

import java.util.Random;
import java.util.Scanner;

public class Task8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		Random r = new Random();
		for (int i = 0; i < a.length; i ++) {
			a[i] = r.nextInt(100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int h = 0;
		int q = -1;
		for (int i = 0; i < a.length; i ++) {
			if (a[i] > q) {
				q = a[i];
				h = i;
			}
		}
		
		int j = 0;
		int w = 100;
		for (int i = 0; i < a.length; i ++) {
			if (a[i] < w) {
				w = a[i];
				j = i;
			}
		}
		System.out.println("max "+q);
		System.out.println("min "+w);
		
		int f = 0;
		int s = 0;
		for (int i = 0; i < a.length; i ++) {
			s = a[i] + f;
			f = a[i] + f;
		}
		System.out.println("Среднее арифметическое - "+ (double) s/a.length);
		
		if ((h-j)<0) {
			System.out.println("Кол-во символов между max и min - "+ ((j-h)-1));
		} else {
			System.out.println("Кол-во символов между min и max - "+ ((h-j)-1));
		}	
		
		
		//Scanner s = new Scanner(System.in);
		//for (int i = 0; i < a.length; i++) {
			//a[i] = 
		//}
		
	}

}
