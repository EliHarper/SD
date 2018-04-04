package exceptions;
//What will the following program print?
public class Question03{
   public Question03(){
      s1 = sM1("1");
   }
   static String s1 = sM1("a");
   String s3 = sM1("2");{
      s1 = sM1("3");
   }
   static{
      s1 = sM1("b");
   }
   static String s2 = sM1("c");
   String s4 = sM1("4");
    public static void main(String args[]){
        Question03 it = new Question03();
    }
    private static String sM1(String s){
       System.out.println(s);  return s;
    }
}