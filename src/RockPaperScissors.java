import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {




    public static void main(String[]args) {
        //declare variables
        Scanner board = new Scanner(System.in);
        // declare variables
        int player, computer, counter;
        counter = 0;
        // player input
        System.out.println("Welcome to the treacherous game of:\nROCK, PAPER, SCISSORS");
        System.out.println("Play if you dare mere mortal.......    The Rules are as follows: ");
        System.out.println("Enter 0 for paper, 1 for Scissors, or 2 for Rock (-1 to quit) : ");
        System.out.println("I (the ancient being) will be ready to keep going after every throw just enter another number");
        System.out.println("I'd understand if you want to quit right now. ");
        System.out.println("Go ahead, PLAY:");

        player = board.nextInt();
        do {

            // switch statement for player
            switch (player) {
                case 0:
                    System.out.println("Player picks Paper");
                    break;
                case 1:
                    System.out.println("Player picks Scissors");
                    break;
                case 2:
                    System.out.println("Player picks Rock");
                    break;
                case -1:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Invalid input");
            }

            // generate a random number for computer
            Random randomGen = new Random();
            computer = randomGen.nextInt(3);

            // switch statement for computer
            switch (computer) {
                case 0:
                    System.out.println("Ancient being picks Paper");
                    break;
                case 1:
                    System.out.println("Ancient being picks Scissors");
                    break;
                case 2:
                    System.out.println("Ancient being picks Rock");
                    break;
                default:
            }

            // output for each condition
            if (player == 2 && computer == 1)
                System.out.println("Pffft! I gave you that win!");
            else if (player == 1 && computer == 0)
                System.out.println("Pffft! I gave you that win!");
            else if (player == 0 && computer == 2)
                System.out.println("Pffft! I gave you that win!");
            else if (computer == 1 && player == 0)
                System.out.println("I Win nice try mortal");
            else if (player == 0 && computer == 2)
                System.out.println("I Win nice try mortal");
            else if (player == 1 && computer == 2)
                System.out.println("I Win nice try mortal");
            else
                System.out.println("IT'S A DRAW THROW AGAIN");

        } while ((player = board.nextInt()) != -1);
        System.out.println("Thanks for playing but in the end, I always win...");
        System.out.println("(Menacing laughing starts lowering in volume)");








    }
}
