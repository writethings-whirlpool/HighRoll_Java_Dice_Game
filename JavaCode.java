import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
//Introductions and instructions:
        System.out.println("٩(◕‿◕)۶ Are YOU the HIGHEST ROLLER?");
        System.out.println("INSTRUCTIONS: You vs the Computer;
        System.out.println("Each player will roll the dice five times, and the one with the highest total sum wins.");
        System.out.println("\n(ง'̀-'́)ง Shall we begin?");

 //While condition for new round:      
        while (playAgain) {
            int userTotal = 0;
            int computerTotal = 0;
            int round = 1;

            while (round <= 5) {
                System.out.println("\nHere it goes... \n(づ ◕‿◕ )づ Round " + round);
                System.out.println("\nPress 'Enter' to roll the dice~");
                scanner.nextLine();

                int userRoll = rollDice(random);
                int computerRoll = rollDice(random);

                userTotal += userRoll;
                computerTotal += computerRoll;

                System.out.println("> Your roll: " + userRoll);
                System.out.println(">> Your Conscience's roll: " + computerRoll);
                System.out.println("--> Your total: " + userTotal);
                System.out.println("---> Your Conscience's total: " + computerTotal);

                round++;
            }

            // Result Options:
            System.out.println("\nGame Over! Checking accumulated results on the fifth/final round...\n");
            if (userTotal > computerTotal) {
                System.out.println("( ˘▽˘)っ♨ Congratulations! \nYou win!");
            } else if (userTotal < computerTotal) {
                System.out.println("(。ˇ ⊖ˇ）♡ Your Conscience wins.\nBetter luck next time!");
            } else {
                System.out.println("It's a tie! Ⴚტ◕‿◕ტჂ ");
            }

            // Option to repeat or terminate game:
            System.out.print("\n(ΦωΦ) Play another round? (yes/no): ");
            String playAgainChoice = scanner.nextLine().toLowerCase();

            // Checking the player's choice:
            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n\nThank you for playing! \n ( ͡° ͜ʖ ͡° ) Have a nice life!\n");

        // Closing/ending the game
        scanner.close();
    }

    // Rolling the dice to return the result here:
    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}
//END OF CODE_ A.M. SIMON
