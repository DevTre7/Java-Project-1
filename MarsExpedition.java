import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Booting Up... ");
        System.out.println("Hello, what is your name? ");

        String name = scanner.nextLine();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hi " + name + " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N" );
        String userInput = scanner.nextLine(); //<<<
        if(userInput.equals("y")|| userInput.equals("yes")){
            System.out.println("I knew you would say that. You are team leader for a reason. ");
        }
        else if (userInput.equals("n")|| userInput.equals("no")){
            System.out.println("Too bad you are team leader. You have to go. ");
        };

        System.out.println("How many people do you want on your team? ");
        int numberOfParticipants = scanner.nextInt();

        if(numberOfParticipants > 2){
            System.out.println(" That’s way to many people. We can only send 2 more members. ");
            numberOfParticipants = 2;
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        scanner.nextLine();
        String snackChoice = scanner.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snackChoice + " with you.” (The " + snackChoice + "part should be whatever the user typed in. ");

        sout




    };
}
