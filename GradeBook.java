
class Benson_gradeBook {

   public static void main(String[] args){
   
        //store sa array and scores
        int[][] scores = {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        //initialize values sa lowest and highest
        int lowest = scores[0][0];
        int highest = scores[0][0];
                            
        System.out.println("Welcome to the grade book for \nCS101 Introduction to C++ Programming!");
        System.out.println("\nThe grades are:");
        System.out.print("\nStudent   ");

         for (int i = 0; i < scores[0].length; i++) {
             System.out.print("Test" + (i + 1) + "  ");
         }
         
         System.out.println("Average");
        
        //i-loop una ang student row, then ang test column dayon
        for(int i = 0; i < scores.length; i++){

            int sum = 0;
            System.out.print("Student "+(i+1)+"   ");

            for(int j = 0; j < scores[i].length; j++){

                System.out.print(scores[i][j]+"    ");
                lowest = Math.min(lowest, scores[i][j]);
                highest = Math.max(highest, scores[i][j]);
                sum += scores[i][j];
            }
            
            double average = sum/ (double)scores[i].length;
            System.out.printf("%.2f",average);
            System.out.println();
        }
        
        System.out.print("\nLowest grade in the grade book is "+lowest+"\n"
                        +"Highest grade in the grade book is "+highest
        );
    }
}
