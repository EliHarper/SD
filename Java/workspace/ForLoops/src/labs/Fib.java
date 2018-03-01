package labs;

public class Fib {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int fib;
		
		System.out.println("0: 0");
		System.out.println("1: 1");
		for (int i = 2; i<21; i++) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.println(i + ": "+ fib);
			}
		}
	}
//	0: 0
//	1: 1
//	2: 1
//	3: 2
//	4: 3
//	5: 5
//	6: 8
//	7: 13

