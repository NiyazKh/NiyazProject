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
		
	}

}
