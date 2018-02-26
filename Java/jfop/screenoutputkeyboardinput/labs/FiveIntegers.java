import java.util.Scanner;

public class FiveIntegers{

  static int a, b, c, d, e;
  public static void main(String[] frogs){

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter an integer: ");
    a = keyboard.nextInt();
    System.out.println("Another one: ");
    b = keyboard.nextInt();
    System.out.println("Another one: ");
    c = keyboard.nextInt();
    System.out.println("Another one: ");
    d = keyboard.nextInt();
    System.out.println("Another one: ");
    e = keyboard.nextInt();

    SepSpace();
    SepTab();
    SepLine();
  }

  public static void SepSpace(){
    System.out.println(a+" "+b+" "+c+" "+d+" "+e);
  }

  public static void SepTab(){
    System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
  }

  public static void SepLine(){
    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
  }
}
