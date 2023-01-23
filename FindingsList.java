import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//PP5- Findings List
public class FindingsList {
    public void findingList() throws InterruptedException{
        //PP5-Step2- Storing samples------------------------------------------------
        //Make 'Thread.sleep() method to stop the terminal for half a second
        Thread.sleep(500);
        System.out.println("Welcome Back!");
        //Create an ArrayList of String's called 'rockList'
        ArrayList<String> rockList = new ArrayList<String>();
        System.out.println("Rock data downloaded.");

        //Add 4 diff. rocks to the ArrayList
        rockList.add("rock");
        rockList.add("wierd rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("rockList");
        //Print a message to remove the non-rock item from the rockList
        System.out.println("Wait a second that last one is not a rock. We need to delete that one from the database list.");

        //Remove the non-rock item from the 'rockList'
        rockList.remove("not rock");
        //Then reprint the rockList
        System.out.println(rockList);
        //Print a message stating all rock items confirmed in the rockList
        System.out.println("Now that looks Perfect! All rocks accounted for in database list.");

        //PP5-Step3 - Fossils-----
        Thread.sleep(1000);
        //Create a HashMap called 'fossilDirectory' that has 2 String attributes
        HashMap<String, String> fossilDirectory = new HashMap<>();
        System.out.println(" Fossil data downloaded ");

        //Add 3 diff fossils and their respective descriptions to the HashMap 'fossilDirectory'
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight" );
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water" );
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil" );

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        //Create a Scanner object to accept the user's input from the selections referenced  in the previous lines of code
        Scanner input = new Scanner(System.in);
        //Save the user's input to a String variable called 'fossilChoice'
        String fossilChoice = input.nextLine();

        //Create 'If' & 'If Else' Statements for each individual fossil choice (and it's description) that will be printed dependent on the user's input
        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        //PP5-Step4 - Special supply lists-----
        Thread.sleep(700);

        //Create a HashSet











    }
}
