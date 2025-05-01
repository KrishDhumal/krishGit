
public class Car {
	private String model;
	private String[] features;
	
	// Var-args can only be the last argument inside a method
	public Car(String model, String...features) {	// var-args
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features) 
			System.out.println("- " + f);
	}
	
	public static void main(String[] args) {
		// Create 2 objects of Car class
		// First model Suzuki Alto with its features
		// Second model MG Astor with its features
		// Print their specs
		
		Car alto = new Car("Suzuki Alto", "Keyless","AC","Power Windows");
		
		Car astor = new Car("MG Astor", "Keyless","ABS","Panaroma","Cruise");
		
		alto.specs();
		
		astor.specs();
		
	}
}
