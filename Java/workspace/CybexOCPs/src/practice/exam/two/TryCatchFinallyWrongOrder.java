package practice.exam.two;

public class TryCatchFinallyWrongOrder {

	public static void main(String[] args) {
		int i = 0;
		try {
			i++;
			e();
		}
		finally {
			i += 2;
		}
//		catch (Exception e) {
//			i +=10;
//		}  -> Won't compile b/c of the wrong order
	}

	private static void e() {
		throw new IllegalArgumentException();
	}

}
