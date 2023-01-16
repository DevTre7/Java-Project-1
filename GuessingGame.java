import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){
        System.out.println("Hello Player 1!");
        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " Let's play a game!");

        Random numberGenerator = new Random();
        int number = numberGenerator.nextInt(100);
        System.out.println(number);

        System.out.println("Guess a number between 1 and 100");
        int userInput = 0;
        int keepCounter = 0;

        while (userInput != number){
            userInput = scanner.nextInt();
            if(userInput > number){
                System.out.println(" Your guess is too HIGH, try again. ");
            }
            if(userInput < number){
                System.out.println(" Your guess is too low, try again. ");
            }
            keepCounter++;
            if (userInput == number){
                System.out.println(" Congrats! " + name + " the correct answer is " + userInput + " You guessed: " + keepCounter);
            }
        }


    }
}
