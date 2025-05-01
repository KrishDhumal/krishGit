import com.zubair.bank.AccountsFactory;
import com.zubair.bank.BalanceException;
import com.zubair.bank.Banking;

public class TestAccounts {

	public static void main(String[] args) {
		
		Banking s1 = AccountsFactory.openSavingsAccount("John");
		
		try {
			s1.withdraw(10);
		} catch (BalanceException e) {
//			e.printStackTrace();	// Developers: Troubleshoot the problem
//			System.out.println(e.toString()); // Logging: Audit application behavior
			System.out.println(e.getMessage());	// End Users information
		}
		
	}
}
