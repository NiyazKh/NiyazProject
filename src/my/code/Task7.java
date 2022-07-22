package my.code;

public class Task7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arrayOfInts = new int[5];
		//arrayOfInts[0] = 1;
		//arrayOfInts[2] = arrayOfInts[1] - arrayOfInts[0];
		
		int[] a = new int[10];
		//int[] b = new int[10];
		//b[0] = 1;
		
		for (int i = 1; i <= a.length; i++){
			a[i-1] = i;
			System.out.print(a[i-1] + ",");
		}
		System.out.println();
		
		for (int i = 1; i <= a.length; i++){
			a[i-1] = i*2;
			System.out.print(a[i-1] + ",");
		}
		System.out.println();
		
		for (int i = 1; i <= a.length; i++){
			a[i-1] = (i*2)-1;
			System.out.print(a[i-1] + ",");
		}
		System.out.println();
		
		for (int i = 1; i <= a.length; i++){
			a[i-1] = i*i;
			System.out.print(a[i-1] + ",");
		}
		System.out.println();
		
		int j = -1;
		for (int i = 1; i <= a.length; i++){
			j = j*(-1);
			a[i-1] = j;
			System.out.print(a[i-1] + ",");
		}
		System.out.println();
		
		a[0] = 1;
		int k = 1;
		for (int i = 1; i <= a.length; i++){
			a[i-1] = i*k;
			k = i * k;
			System.out.print(a[i-1] + ",");
		}
		System.out.println();
		
		a[1] = 1;
		System.out.print(a[0] + "," + a[1] + ",");
		for (int i = 2; i < a.length; i++){
			a[i] = a[i-1] + a[i-2];
			System.out.print(a[i] + ",");
		}
		
	}

}
