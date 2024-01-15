package javas;
import java.util.Scanner;
import java.util.Random; //importing random class

public class NumberGame {
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //creating the object of random class->
        //random class is more suitable for generating random number
        Random random = new Random();
        //total rounds in a game->
        int maxRounds=4;
        //starting score is =0;
        int maxScore=0;
        for(int rounds=1; rounds<=maxRounds;rounds++){
            int generatedNumber= random.nextInt(100);
            //number of chances for each round->
            int maxChances= 5;
            int chance=0;
            System.out.println("for round->"+rounds);
            System.out.println("guess the number(0-100)->");
            do{
                System.out.println("Max chances left->"+(maxChances-chance));
                System.out.println("Enter the Guess number->");
                int getNum= sc.nextInt();
                if(getNum==generatedNumber){
                    System.out.println("wohowoho!!You are correct.");
                    int roundScore= maxChances-chance;
                    maxScore+=roundScore;
                    System.out.println("Round score->"+ roundScore);
                    break;
                }
                else if(getNum>generatedNumber){
                    System.out.println("Too large Number enterd by the user->");
                }
                else{
                    System.out.println("Too small number is entered");
                }
                chance++;
                
            }
            while(chance<maxChances);
// here i am handlling the max chance case->
            if(chance==maxChances){
                System.out.println("Sorry! Max Chances Reached");
                System.out.println("correct number is->"+ generatedNumber);
            }
            System.out.println("total score is->"+maxScore);
            // giving option to the player to play more->>>>>>or not>>>>
            
            if(rounds<maxRounds){
                System.out.println("Do you want to play another round->(yes/no)");
                String playAgain= sc.next().toLowerCase();
                if(!playAgain.equals("yes")){
                    break;
                }
            }

        }
        System.out.println("Thanks for playing!!");
        System.out.println("your final score is->"+ maxScore);


        sc.close();
    }

     
}
    

