/*Write a program that defines two variables: one named age (for your age)
 and one named mi (for your middle initial). Initialize the variables
 appropriately. Have the program print your first name as a string literal,
 your middle initial from the variable, your last name as a string literal,
 the string ": Age: ", and your age from the variable.*/

 public class AgeInitial{
   public static void main(String[] args){
     int age = 23;
     char mi = 'N';

     System.out.println("Eli " + mi + ". Harper: Age: "+ age);
   }
 }
