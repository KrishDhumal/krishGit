
public class ArraysDemo {

	public static void main(String[] args) {

		int[] ar = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < ar.length; i++)
			System.out.println(ar[i]);

		for (int i : ar)
			System.out.println(i);

		int[][] jaggu = { {1, 2}, {3, 4, 5}, {6 ,7 ,8, 9} };
		
		for (int i = 0; i < jaggu.length; i++) {
			for (int j = 0; j < jaggu[i].length; j++) {
				System.out.print(jaggu[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[] a1 = new int[3];
		a1[1] = 5;
		a1[2] = 9;
		for (int i : a1) 
			System.out.println(i);
		
		int sum = 0;
		for (int i : ar) 
			sum += i;
		System.out.println("Sum: " + sum);
		
		
	}
}
