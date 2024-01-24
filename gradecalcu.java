import java.util.Scanner;
public class CalculateGrade{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Valid Subject Number(1-8)");
        System.out.print("Enter the Number of Subject-> ");
         // Validate if the input is an integer
         if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer. Exiting.");
            sc.close();
            return;
        }
        int subject= sc.nextInt();
        

        System.out.println();
        if(subject<1 && subject>8){
            System.out.println("Invalid subject number");
            sc.close();
            return;
        }
        else{
        int totalMarks= subject*100;
        // System.out.println();
        int sum=0;
        float averagePercentage=0.0f;
        for(int i=1; i<=subject;i++){
          System.out.print("subject "+i+" ->");
          int marks=sc.nextInt();
        // Validate non-negative marks
        // Validate marks range
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100. Exiting.");
            sc.close();
            return;
        }
          sum+=marks;
        }
        System.out.println();
        System.out.println("Obtained Marks-> "+sum);
        averagePercentage= ((float)sum/totalMarks)*100;
       // System.out.println("Percentage is-> "+averagePercentage);
        //assign the grade on the basis of percentage.
        String storeGrade=" ";

        if ( averagePercentage>= 90.9f) {
            storeGrade="Grade:A";
            
        } else if (averagePercentage >= 80.0f) {
            storeGrade="Grade:B";   
        } else if (averagePercentage >= 70.0f) {
            storeGrade="Grade:C";  
        } else if (averagePercentage >= 60.0f) {
            storeGrade="Grade:D";
        } else {
            storeGrade="Grade:F";   
        }
        System.out.println("Showing the Details->");
        System.out.println("Obtained Marks "+sum+" Averagepercentage "+averagePercentage+"%"+" Grade "+storeGrade);

        sc.close();
    }
    
        
    }
}
