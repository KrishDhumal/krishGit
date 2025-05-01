import com.zubair.lib.Book;
import com.zubair.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		
		Book bk = new Book("The Alchemist");
		Member mbr = new Member("George");
		
		bk.status();
		mbr.status();
		
		bk.issueBook(mbr);
		
		bk.status();
		mbr.status();
		
		bk.returnBook(mbr);
		
		bk.status();
		mbr.status();
		
		
	}
}
