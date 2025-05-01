
public class StringDemo {

	public static void main(String[] args) {
		// ** String pool is an optimized memory area where if 2 strings are holding the same values
		//	they will share the same memory location.
		// Memory allocation happens in String Pool
		String s1 = "Hello";	
		// Memory allocation happens in Heap
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		s3 = "  Hey Lo  ";
		System.out.println(s3.trim());
		
		char[] chars = s2.toCharArray();
		
		String s4 = String.valueOf(chars);
		System.out.println(s4);
		
		String s5 = new String(chars);
		System.out.println(s5);
		
	}
}
