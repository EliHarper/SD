package labs;

public class CarTester {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "blue";
		c1.purchasePrice = 20000.00;
		c1.make = "Hyundai";
		c1.model = "Elantra";
		c1.numberOfWheels = 4;
		
		Car c2 = new Car();
		c2.color = "yellow";
		c2.purchasePrice = 100000.00;
		c2.make = "Lamborghini";
		c2.model = "Countash";
		c2.numberOfWheels = 4;
		
		c1.displayCar();
		c2.displayCar();
	}
}
