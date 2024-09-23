public class Main {
    public static void main(String[] args) {
        Feeder feeder = new Feeder(2400);
        feeder.simulateOneDay(10);

        System.out.println("One day Simulation:");
        System.out.println("Food left after a day: " + feeder.getCurrentFood() + " grams.");

        System.out.println();

        int numBirds = 10;
        int numDays = 4;

        System.out.println("Many days Simulation:");
        int dayswithfood = feeder.simulateManyDays(numBirds, numDays);
        System.out.println("Number of days with food: " + dayswithfood + " day(s).");

        //
        System.out.println("Food left after many days: " + feeder.getCurrentFood() + " grams");
        // note to self
        // nvm it does work it was js bcuz my numbirds and numdays were values where the food left was 0

        }
    }