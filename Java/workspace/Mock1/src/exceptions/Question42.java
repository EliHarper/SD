package exceptions;

public class Question42 {
//	What will the following code snippet print?
public static void main(String[] args) {
	
	Object t = new Integer(107);
	int k = ((Integer) t).intValue()/9;
	//Since t is an Object, intValue is not a valid method; it's only for
//		Integers (original code didn't have the parens around t + (Integer)
	System.out.println(k);
	}
}
