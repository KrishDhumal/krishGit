public class CheckPalendrome {

	public static void main(String[] args) {
		
		String str = "malayalam";
		char[] rev = new char[str.length()];
		
		// Check if the string is palendrome or not
		for(int i=str.length() - 1, j=0; i>=0; i--, j++)
			rev[j] = str.charAt(i);
		
		String str2 = new String(rev);
		System.out.println(str.equals(str2) ? "Palendrome" : "Not Palendrome");
		
		
	}
}
