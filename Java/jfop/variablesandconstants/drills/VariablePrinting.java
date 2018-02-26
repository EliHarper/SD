
public class VariablePrinting {

	public static void main(String[] args) {
		double battingAverage = .345;
		double thisYearBA = battingAverage;
		battingAverage = .362; //reassignment

		System.out.println(battingAverage+ " is the literal held in the battingAverage variable.");
		System.out.println(thisYearBA+ " is the literal held in the thisYearBA variable.");

		// Add Strings to the System.out.println() statements to display which variable is being output

	}

}
