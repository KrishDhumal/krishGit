
public class AssertDemo3 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 99999);
		
		assert num <= 99999 && num >= 9999 : "Invalid number: " + num;
		
		System.out.println("Number: " + num);
	}
}
 