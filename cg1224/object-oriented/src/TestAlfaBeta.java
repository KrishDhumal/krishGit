class Alfa {
	public Alfa() {
		System.out.println("Alfa Constructor");
	}
	
	public void demo() {
		System.out.println("Alfa Demo");
	}
}

class Beta extends Alfa {
	public Beta() {
		System.out.println("Beta Constructor");
	}
	
	public void test() {
		System.out.println("Beta Test");
	}
}

public class TestAlfaBeta {

	public static void main(String[] args) {
		Alfa a = new Alfa();
		a.demo();
		
		Beta b = new Beta();
	}
}
