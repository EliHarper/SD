package practice.exam.two;

public class StringBuilderShenanigans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a = new StringBuilder();
		StringBuilder b = a.append("2");
		a.append("234");
		b.deleteCharAt(1);

		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder(2);
//		StringBuilder s3 = new StringBuilder(6.0);
		StringBuilder s4 = new StringBuilder("b");
//		StringBuilder s5 = new StringBuilder(false);
		
	}

}
