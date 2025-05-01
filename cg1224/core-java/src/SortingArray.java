
public class SortingArray {

	public static void main(String[] args) {
		
		int[] ar = {5,2,7,3,1};
		
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i] > ar[j]) {
					int x = ar[i];
					ar[i] = ar[j];
					ar[j] = x;
				}
			}
		}
		
		for (int i : ar) {
			System.out.println(i);
		}
	}
}
