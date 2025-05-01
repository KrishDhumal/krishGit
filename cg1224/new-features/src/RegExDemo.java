
public class RegExDemo {

	public static void main(String[] args) {
		
		String name = "Samson";
		// Rules for name:1-First letter must be caps,2-Min 4 chars,3-Only alphabets
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		
		System.out.println(name.matches(nameRegex));
		
		String mobile = "8223343534";
		// Rules:1-start with 6-9,2-Total 10 digits
		String mobileRegex = "[6-9]{1}[0-9]{9}";
		
		System.out.println(mobile.matches(mobileRegex));
		
		String email = "zubair@email.com";
		
		String emailRegex = "[a-z0-9]{4,}+@[a-z0-9]{3,}+.[a-z]{2,}";
		
		System.out.println(email.matches(emailRegex));
	}
}
