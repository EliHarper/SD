package exceptions;

public class Quesiton13 {

		   public static void main(String[] args){
		      String hello = "Hello", lo = "lo";
		      System.out.print((Other.hello == hello) + " ");   //line 2
		      System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
		      System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
		      System.out.println(hello == ("Hel"+lo).intern());          //line 5
		   }
		}
		class Other { static String hello = "Hello"; }
