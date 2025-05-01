
public class StaticDemo {
	private int data;
	private static int count;
	
	static {	// Executes at the time of class loading
		System.out.println("Class is loaded...");
		count = 100;
	}
	
	{ // Instance block
		System.out.println("Object is created...");
	}
	
	public StaticDemo(int data) {
		this.data = data;
		count ++;
	}
	
	public void print() {
		System.out.println("Data: " + data + "\tCount: " + count);
	}
	
	public static void sayHello() {
		System.out.println("Hola Amiga, como estas");
	}
	
	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo(10);
		s1.print();
		
		StaticDemo s2 = new StaticDemo(20);
		s2.print();

		StaticDemo s3 = new StaticDemo(30);
		s3.print();
		
		StaticDemo.sayHello();
	}
}
