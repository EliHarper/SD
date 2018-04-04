package practice.exam.two;

public class UndeclaredBooleanUsage {

	private boolean b;
	public static void main(String[] args) {
		UndeclaredBooleanUsage u = new UndeclaredBooleanUsage();
		int one, two = 0;
		if (u.b) {
//			System.out.println(one);
		}
		
		//Booleans are automatically assigned false
		//one was never intitalized
	}

}
