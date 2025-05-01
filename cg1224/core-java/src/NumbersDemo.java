
public class NumbersDemo {

	public static void main(String[] args) {
//		int num = 5;
//		
//		for(int c=1; c<=10; c++) {
//			int val = num * c;
//			System.out.println(val);
//		}
		
		// Print odd and even numbers
//		for(int x = 1; x <= 10; x++) {
//			if(x % 2 == 0)
//				System.out.println("Even: " + x);
//			else
//				System.out.println("Odd: " + x);
//		}
		
		for(int x = 1; x <= 10; x++) 
			System.out.println(x % 2 == 0?"Even: " + x : "Odd: " + x);
		
		int p = 4;
		boolean isPrime = true;
		for(int a = 2; a < p; a++) {
			if(p % a == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime?"Prime No: "+p:"Not Prime: " + p);
	}
}
