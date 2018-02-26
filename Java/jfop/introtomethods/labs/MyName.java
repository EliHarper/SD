public class MyName{
  public static void main(String[] args){
    FirstName();
    Space();
    LastName();
    FullName();
  }
  public static void FirstName(){
    System.out.print("Eli");
  }
  public static void LastName(){
    System.out.print("Harper");
    System.out.println();
  }
  public static void Space(){
    System.out.print(" ");
  }
  public static void FullName(){
    FirstName();
    Space();
    LastName();
  }
}
