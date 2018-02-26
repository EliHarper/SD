public class PrintHeader{
  public static void main(String[] args){
    FullWelcome();
  }

  public static void AllStar(){
    System.out.println("***********");
  }
  public static void Welcome(){
    System.out.println("* Welcome *");
  }

  public static void SpaceStar(){
    System.out.println("*         *");
  }

  public static void FullWelcome(){
    AllStar();
    SpaceStar();
    Welcome();
    SpaceStar();
    AllStar();
  }
}
