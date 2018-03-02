package labs;

public class RandomString {

	public static void main(String[] args) {
		
		String animals[] = new String[] {"horse", "elephant", "giraffe", "zebra", "lion", "bear", "cow", "chicken", "whale","bee"};
		
		for (int i = 0; i < 10; i++) {
			int index;
			index = (int)(Math.random()*10);
			
			System.out.println((i+1) + ": " +animals[index]);
		}
	}

}
