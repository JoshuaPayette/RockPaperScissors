import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {




    public static void main(String[]args){
        //declare variables
        Scanner board = new Scanner(System.in);
        Random generator = new Random();
        int player,computer;
        int rock,paper, scissors;

        //initialize variables
        rock = 1;
        paper = 2;
        scissors = 3


        //main code
        System.out.println("Welcome to the horrifying and dangerous game of\n ROCK, PAPER, SCISSORS.");
        System.out.println("In this game you will be going against me the computer");
        System.out.println("You have three options Rock, Paper or Scissors.To play rock you type 1.");
        System.out.println("For scissors type 2. For paper type 3. I will play at the same time as you");
        System.out.println("Alright, Rock Paper Scissors SHOOT!");


        while()
        int computerGuess = generator.nextInt(3) + 1;

    }
}
