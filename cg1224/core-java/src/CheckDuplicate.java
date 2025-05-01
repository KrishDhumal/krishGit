
public class CheckDuplicate {

	public static void main(String[] args) {
		
		String str = "pineapple";
		
		// Get rid of duplicate chars - output: pineal
		StringBuffer buff = new StringBuffer(str);
		
		for(int i=0; i<buff.length(); i++) {
			
			for(int j = i+1; j<buff.length(); j++) {
			
				if(buff.charAt(i) == buff.charAt(j)) {
					buff = buff.deleteCharAt(j);
					j--;
				}
			}
		}
		System.out.println(buff);
	}
}
