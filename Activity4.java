import java.util.*;

class Benson_gradeBook {

   public static void main(String[] args){
   
   int[][] scores = {{87, 96, 70},
                    {68, 87, 90},
                    {94, 100, 90},
                    {100, 81, 82},
                    {83, 65, 85},
                    {78, 87, 65},
                    {85, 75, 83},
                    {91, 94, 100},
                    {76, 72, 84},
                    {87, 93, 73}};
   
   int lowestGrade = scores[0][0];
   int highestGrade = scores[0][0];
                    
   System.out.println("Welcome to the grade book for \n CS101 Introduction to C++ Programming!");
   System.out.println();
   System.out.println("The grades are:");
   System.out.println();
   System.out.println("Student    Test 1  Test 2  Test 3  Average");
   
   for(int i = 0; i < scores.length; i++){
      int sum = 0;
      double average;
      System.out.print("Student "+(i+1)+"    ");
      
      for(int j = 0; j < scores[i].length; j++){
         
         System.out.print(scores[i][j]+"     ");
         
         sum = sum + scores[i][j];
         average = sum/3.0;
         
         System.out.println(average);
      } 
    
   }   
   
   
  
                     
   }
}
