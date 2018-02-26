import java.util.Scanner;

public class ThreeVariables{
  public static void main(String[] args){
    String depCode;
    double yearlyMulah;
    int id;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter your department code: ");
    depCode = keyboard.next();

    System.out.println("Please enter your salary: ");
    yearlyMulah = keyboard.nextDouble();

    System.out.println("Please enter your id number: ");
    id = keyboard.nextInt();

    System.out.println("Let me get this straight. Your code is: " + depCode+ ", your salary is: "+ yearlyMulah + ", and your employee id number is: " + id);
    System.out.println("Here's all of that again, seperated only by tabs: " +depCode+"\t"+ yearlyMulah + "\t"+ id);
    System.out.println("Here it is one last time seperated by new lines: " + "\n"+depCode+"\n"+yearlyMulah+"\n"+id);

  }
}
