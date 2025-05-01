
@FunctionalInterface
interface Maths {
	int random();
}

public class MathsDemo {

	public static void main(String[] args) {
		
		Maths m1 = () -> (int)(Math.random() * 100);
		System.out.println(m1.random());
		
		Maths m2 = () -> {
			double r = Math.random() * 10;
			return (int)r;
		};
		System.out.println(m2.random());
	}
}
