package labs;

public class Car {
	//Fields that define a Car instance.
	public String make, model, color; 
	//if there's a problem w/ these, change Strings to all new lines
	public int numberOfWheels; 
	public double purchasePrice;
	
	public static void main(String[] args) {
		
	}
	
	public String getCarData() {
		
		String data;
		data = ("Make: " + make + "\nModel: "+ model +"\nColor: "
		+ color +"\nNumber of wheels: "+ numberOfWheels +
		"\nPurchase price: "+ purchasePrice);
				
		return data;
	}
	
	public void displayCar() {
		System.out.println(getCarData());
	}
}
