import java.util.Scanner;
import java.util.Random;
public class numegame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int score = 0;
            boolean playAgain;
    
            do {
                playAgain = false;
                int attempts = 0;
                int maxAttempts = 5;  
                int numberToGuess = random.nextInt(100) + 1; 
                boolean guessedCorrectly = false;
    
                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("I'm thinking of a number between 1 and 100.");
                System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");
    
                while (attempts < maxAttempts && !guessedCorrectly) {
                    attempts++;
                    System.out.print("Enter your guess (" + attempts + "/" + maxAttempts + "): ");
                    int userGuess = scanner.nextInt();
    
                    if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        guessedCorrectly = true;
                        System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    }
                }
    
                if (!guessedCorrectly) {
                    System.out.println("Sorry, you didn't guess the number. The correct number was: " + numberToGuess);
                }
    
                if (guessedCorrectly) {
                    score += (maxAttempts - attempts + 1);  
                    System.out.println("Your score for this round: " + (maxAttempts - attempts + 1));
                } else {
                    System.out.println("Your score for this round: 0");
                }
    
             
                System.out.print("Do you want to play again? (yes/no): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("yes")) {
                    playAgain = true;
                }
    
            } while (playAgain);
    
            System.out.println("Game over! Your final score: " + score);
            scanner.close();
        }
     
}
