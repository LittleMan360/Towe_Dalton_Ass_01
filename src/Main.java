import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //variables
        String playerA = "";
        String playerB = "";
        boolean inputPA;
        boolean inputPB;
        boolean playAgain = true;
        boolean playAgainInput;
        //learned about char online seemed appropriate and worked correctly
        char winner;

        Scanner in = new Scanner(System.in);
        //loops entire code for game until ended
        while (playAgain) {
            //resets playerA input again for correct variable
            inputPA = true;
            //loops for input to be rps
            while (inputPA) {
                //prompt for input
                System.out.print("Enter choice (R/P/S) for player A : ");
                playerA = in.nextLine();
                // determines if input is valid
                if (playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("p") || playerA.equalsIgnoreCase("s")) {
                    inputPA = false;
                } else {
                    System.out.println("Please enter valid input.");
                }
            }
            //resets playerB input again for correct variable
            inputPB = true;
            //loops for input to be rps
            while (inputPB) {
                //prompt for input
                System.out.print("Enter choice (R/P/S) for player B : ");
                playerB = in.nextLine();
                // determines if input is valid
                if (playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("p") || playerB.equalsIgnoreCase("s")) {
                    inputPB = false;
                } else {
                    System.out.println("Please enter valid input.");
                }
            }

            //determines who the winner is by if else statements
            if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks Scissor");
                winner = 'A';
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Paper covers Rock");
                winner = 'A';
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Scissor cuts Paper");
                winner = 'A';
            } else if (playerB.equalsIgnoreCase("r") && playerA.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks Scissor");
                winner = 'B';
            } else if (playerB.equalsIgnoreCase("p") && playerA.equalsIgnoreCase("r")) {
                System.out.println("Paper covers Rock");
                winner = 'B';
            } else if (playerB.equalsIgnoreCase("s") && playerA.equalsIgnoreCase("p")) {
                System.out.println("Scissor cuts Paper");
                winner = 'B';
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Rock vs Rock");
                winner = 'T';
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Paper vs Paper");
                winner = 'T';
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Scissor vs Scissor");
                winner = 'T';
            } else {
                winner = 'T';
            }

            //winner results printed
            if (winner == 'T') {
                System.out.println("It's a Tie!!");
            } else {
                System.out.println("Player " + winner + " wins");
            }

            //reset while back to true so doesn't get stuck
            playAgainInput = true;
            //while true loop for correct input or end game
            while (playAgainInput) {
                //prompt input
                System.out.println("Would you like to play again ? (Y/N) : ");
                String choice = in.nextLine();
                //determines if input is valid
                if (choice.equalsIgnoreCase("Y")) {
                    //lets the system play again
                    playAgainInput = false;
                } else if (choice.equalsIgnoreCase("n")) {
                    //stops game and gets out of loop
                    playAgain = false;
                    playAgainInput = false;
                } else {
                    //tells user to enter valid input for play again
                    System.out.println("Enter valid input Y/N for play again (Yes or no))");
                }
            }
        }
    }
}

