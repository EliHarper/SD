package labs;

public class Thermometer {
	public char scale;
	public double currentTemp;
	

	public double getTempAsCelsius() {
		double temp;
		if (scale == 'C' || scale == 'c') {
			temp = currentTemp;
		} else {
			temp = (currentTemp - 32) * (1.8);
		}
		return temp;
	}

	public double getTempAsFahrenheit() {

		double temp = -1;
		if (scale == 'C' || scale == 'c') {
			temp = (currentTemp * 1.8) + 32;
		} 
		else {
			temp = currentTemp;
		}

		return temp;
	}

}
