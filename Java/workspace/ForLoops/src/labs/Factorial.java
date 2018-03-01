package labs;

public class Factorial {

	public static void main(String[] args) {
		int factorialHolder;
		System.out.println("1: 1");
		for (int i = 1; i<11; i = i+1) {
			factorialHolder = i;
			for (int j = i-1; j>0; j= j-1) {
				factorialHolder = factorialHolder*j;
				if (j == 1) {
					System.out.println(i + ": "+ factorialHolder);
				}
				//The program becomes inaccurate at 17
			}
		}
	}
}
