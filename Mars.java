//step1:
public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Mars' First Colony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        System.out.println("----------------------");

//Step2:
        int daysForLandingProcess = 2;
        double eaten = 0.75 * shipPopulation;
        //System.out.println(eaten); <<---The amount of food eaten over the 2 days by shipPopulation
        meals -= (eaten * daysForLandingProcess);
        System.out.println(meals); //<<---Meals left after the Landing Process
        double extraFoodCrate = ( meals * .50); //<<--- The amount of extraFoodCrate is equal to 50% of meals
//        System.out.println(extraFoodCrate);
        meals += extraFoodCrate;
        System.out.println(meals);//<<---The amount Meals after the inclusion of extraFoodCrate
        int births = 2;
        shipPopulation += births;
        System.out.println(shipPopulation);

        //AnswerKey:
//        meals = meals - (shipPopulation * 0.75);
//        meals = meals - (shipPopulation * 0.75);
//        System.out.println(meals);
//        meals = meals + (meals * .5);
//        shipPopulation = shipPopulation + 5;
//        System.out.println(shipPopulation);

//Step3:
        String  landingLocation = "The Hill";
        if(landingLocation.equalsIgnoreCase("The Plain")){
        };
        landing = landingCheck(2);
//        Thread.sleep(250);

    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute <= minutesLeft; minute++ ){
            if( (minute % 2) == 0 && (minute % 3) == 0){
                System.out.println("Keep Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            }else{
                System.out.println("Calculating");
            } Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}

