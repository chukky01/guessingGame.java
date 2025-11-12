public class GuessGame {  // Main game class that manages a number-guessing game with 3 players
    Player p1;  // Declaration for Player 1 object (requires separate Player class)
    Player p2;  // Declaration for Player 2 object
    Player p3;  // Declaration for Player 3 object

    public void startGame(){  // Main game method that runs the guessing game logic
        // Initialize three new Player objects
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Variables to store each player's current guess (initialized to 0)
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Boolean flags to track whether each player guessed correctly
        // WARNING: These are never reset inside the loop, so once true, always true
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Generate random target number between 0 and 9
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'am thinking of a number between 0 and 9...");

        // Infinite game loop - continues until at least one player guesses correctly
        while (true){
            // Display the target number for debugging (should be hidden in real game)
            System.out.println("Number to guess is " + targetNumber);

            // Each player makes a guess (calls guess() method from Player class)
            p1.guess();
            p2.guess();
            p3.guess();

            // Retrieve each player's guessed number and store in local variables
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // Compare each player's guess to target and set their flag to true if correct
            if (guessp1 == targetNumber){
                p1isRight = true;
            }

            if (guessp2 == targetNumber){
                p2isRight = true;
            }

            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            // Check if at least one player guessed correctly
            if(p1isRight || p2isRight ||p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game Over");
                break;  // Exit the loop and end the game
            } else{
                // No one guessed correctly, continue to next round
                System.out.println("Players will have to try again");
            }
        }

    }  // End of startGame method
}  // End of GuessGame class
