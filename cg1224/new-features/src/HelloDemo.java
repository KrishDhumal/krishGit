class HelloImpl implements Hello {

	@Override
	public String sayHello() {
		return "Just a normal greeting";
	}
}

public class HelloDemo {
	class HelloInnerImpl implements Hello {

		@Override
		public String sayHello() {
			return "Greeting from inner class";
		}
	}

	public void oneMoreGreeting() {
		class HelloNestedImpl implements Hello {

			@Override
			public String sayHello() {
				return "Greeting from nested class";
			}
		}
		System.out.println(new HelloNestedImpl().sayHello());
	}

	public void oneLastGreeting() {
		System.out.println(new Hello() {
			@Override
			public String sayHello() {
				return "Greeting from anonymous impl";
			}
		}.sayHello());
	}

	public void pakkaWalaLastGreeting() {
		Hello h = new Hello () {
			
			@Override
			public String sayHello() {
				return "Ajeeb greeting";
			}
		};
		
		System.out.println(h.sayHello());
	}
	
	public static void main(String[] args) {
		HelloImpl hi = new HelloImpl();
		System.out.println(hi.sayHello());

		HelloDemo demo = new HelloDemo();
		HelloInnerImpl hey = demo.new HelloInnerImpl();
		System.out.println(hey.sayHello());

		demo.oneMoreGreeting();
		demo.oneLastGreeting();
		demo.pakkaWalaLastGreeting();
		
		Hello h = () -> "Another funny greeting";	// Lambda Expression
		System.out.println(h.sayHello());
	}
}









