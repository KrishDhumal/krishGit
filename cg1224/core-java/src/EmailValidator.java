
public class EmailValidator {
	// Rules for validating email are...
	// 1. Only 1 occurrence of @ and .
	// 2. Min 4 chars before @
	// 3. Min 3 chars between @ and .
	// 4. Min 2 chars after .
	// 5. No regular expressions.
	public static void main(String[] args) {
		
		String email = "bair@man.co";
		
		int iat = email.indexOf('@');
		int idot = email.indexOf('.');
		
		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat >= 4 && idot - iat >= 4 && email.length() - idot >= 3)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		
		System.out.println(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat >= 4 && idot - iat >= 4 && email.length() - idot >= 3?"Valid Email":"Invalid Email");
	}
}
