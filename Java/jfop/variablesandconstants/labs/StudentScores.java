/*Write a program that defines four variables named score1, score2, score3, and score4 — one for each of a student's four test scores. Assign appropriate values to the variables. Define another variable named average in the program. Have the program calculate the average of the test scores and assign the result to the variable:*/

public class StudentScores{
  public static void main(String [] args){
    double score1 = 85.6, score2 = 97.5, score3 = 90.02, score4 = 89.2, average;
    average = (score1+score2+score3+score4)/4;

    System.out.println("Exam 1 score: "+ score1);
    System.out.println("Exam 2 score: " + score2);
    System.out.println("Exam 3 score: "+ score3);
    System.out.println("Exam 4 score: " + score4);

    System.out.println("\nYour cumulative grade in the class is: " + average);

  }
}
