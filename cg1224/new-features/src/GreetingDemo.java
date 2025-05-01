
@FunctionalInterface
interface Greeting {
	void greet(String name);
	
	default void goodBye(String name) {
		System.out.println("Goodbye, " + name);
	}
	
	static void seasons() {
		System.out.println("Seasons greetings");
	}
}

public class GreetingDemo {
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		Greeting g1 = (name) -> System.out.println("Hello, " + name);
		g1.greet("Zubair");
		
		Greeting g2 = (naav) -> System.out.println("Namaste, " + naav);
		g2.greet("Vishal");
		
		g1.goodBye("Danny");
		Greeting.seasons();
	}
}
