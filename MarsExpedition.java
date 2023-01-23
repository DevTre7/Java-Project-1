import java.util.Scanner;

//PP4-Mars Expedition Setup
public class MarsExpedition {
    public MarsExpedition(){
//      PP4-Step2- Expedition Bootup:
        Scanner scannerInput = new Scanner(System.in);  //<<--- New Scanner variable created called 'scannerInput'
        System.out.println("Booting Up... "); //<<--- 'Boot-up' prompt
        System.out.println("Hello, what is your name? ");//<<--- Welcome message

        String name = scannerInput.nextLine();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//      PP4-Step3- Team Setup:
        System.out.println("Hi " + name + " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N" );
        String userInput = scannerInput.nextLine(); //<<<---The next line of what the user inputs/ enters is saved to userInput String variable
        if(userInput.equals("y")|| userInput.equals("yes")){
            System.out.println("I knew you would say that. You are team leader for a reason. ");
        }
        else if (userInput.equals("n")|| userInput.equals("no")){
            System.out.println("Too bad you are team leader. You have to go. ");
        };

        System.out.println("How many people do you want on your team? ");
        int numberOfParticipants = scannerInput.nextInt();
        if(numberOfParticipants == 2){
            System.out.println("That's a good choice! Now let's move on to what snacks you want to bring onboard for the expedition.");
        }
        if(numberOfParticipants > 2){
            System.out.println(" That’s way too many people. We can only send 2 more members. ");
            numberOfParticipants = 2;
            System.out.println(" We will set it to " + numberOfParticipants + " passengers on board.");
        }
        else if(numberOfParticipants < 2){
            numberOfParticipants = 2;
            System.out.println(" Hhmm...That's not enough, let us add enough members to bring up our total amount to " + numberOfParticipants + " additional members for the expedition! ");
            System.out.println(" ");

        }


        //      PP4-Step4- Snack Choice:
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        scannerInput.nextLine();
        String snackChoice = scannerInput.nextLine();//<<<---The next line of what the user inputs/ enters is saved to snackChoice String variable
        System.out.println("Nice choice, you will be bringing a " + snackChoice + " with you. ");

        //      PP4-Step5- Choose a vehicle:
        System.out.println("Now let's choose your ride!");
        System.out.println("You have the choice of three different vehicles" + "\n A. Mars Rover" + "\n B. SpaceShip" + "\n C. UFO " + "\n D. The SilverSurfer");

        //Store the 'scannerInput.nextLine()' in string value called 'vehicleChoice'
        String vehicleChoice = scannerInput.nextLine();
        //Create 'If' & 'If Else' Statements for each individual vehicle choice that I created in the earlier line of code
        if(vehicleChoice.equalsIgnoreCase("A")){
            vehicleChoice = " a Mars Rover ";
        }else if(vehicleChoice.equalsIgnoreCase("B")){
            vehicleChoice = " a SpaceShip ";
        }else if(vehicleChoice.equalsIgnoreCase("C")){
            vehicleChoice = " an UFO ";
        }else if(vehicleChoice.equalsIgnoreCase("D")){
            vehicleChoice = " The SilverSurfer ";
        };

       //PP4-Step5- The Final Message:
        System.out.println("Your expedition is now ready!" + "\nLed by " + name + " with "
                        + numberOfParticipants + " teammates." + "\nTo explore the surface of Mars using "
                        + vehicleChoice + "." + "\nExploration team heads out in "
                        + "\n5....."
                        + "\n4...."
                        + "\n3..."
                        + "\n2.."
                        + "\n1."
                        + "\n...ALL READY FOR LIFT OFF, WE HAVE A LIFT OFF!!!");








    };
}
