package practice.exam.two;

public class ToString {
	public static void main(String[] args) {
		String ref = null;
		try {
			System.out.println(ref.toString());
			System.out.println("a");
		}
		finally {
			System.out.println("Okay");
		}
	}
}
