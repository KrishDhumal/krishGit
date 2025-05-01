
public class SortingString {

	public static void main(String[] args) {
		
		String[] basket = {"Apple","Chiku","Kiwi","Banana","Fig","Grapes","Pineapple"};
		
		for (int i = 0; i < basket.length; i++) {
			for (int j = i + 1; j < basket.length; j++) {
				if(basket[i].compareTo(basket[j]) > 0) {
					String temp = basket[i];
					basket[i] = basket[j];
					basket[j] = temp;
				}
			}
		}
		
		for (String fruit : basket) 
			System.out.println(fruit);
	}
}
