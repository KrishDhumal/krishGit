import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface Temp {
	void test();
	
	default String report() {
		return "Reported";
	}
}

@FunctionalInterface
interface Sam {
	void check(int n);
}

@FunctionalInterface
interface OddEven {
	boolean checkEven(int a);
}

@FunctionalInterface
interface Mathematics {
	int powerup(int a, int p);
}

public class FunDemo {
	public static void main(String[] args) {
		
		OddEven e1 = (n) -> n % 2 == 0;
		System.out.println(e1.checkEven(4));
		
		Predicate<Integer> p1 = (n) -> n % 2 == 0;
		System.out.println(p1.test(5));
		
		Consumer<Integer> c1 = (a) -> System.out.println(a*a);
		c1.accept(5);
		
		Mathematics m1 = (n, p) -> (int)Math.pow(n, p);
		System.out.println(m1.powerup(5, 5));
		
		Temp t1 = () -> System.out.println("Testing Done");
		t1.test();
		System.out.println(t1.report());
		
		Temp t2 = () -> System.out.println(t1.report());
		t2.test();
		
		class TempImpl implements Temp {

			@Override
			public void test() {
				System.out.println("Testing Done");
			}
		}
		Temp t3 = new TempImpl();
		t3.test();
		
		Sam s1 = (a) -> System.out.println(a*a);
		s1.check(5);	
	}
}
