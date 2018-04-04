package exceptions;
//Consider the following class :

public class Question11 {
	public static void main(String[] args) {
		if (args[0].equals("open"))
			if (args[1].equals("someone"))
				System.out.println("Hello!");
			else
				System.out.println("Go away " + args[1]);
	}
}

// Which of the following statements are true if the above program is run with
// the command line :
// java Test closed