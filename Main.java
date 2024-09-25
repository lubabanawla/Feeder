import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(1000);
        list.add(100);

        List<Integer> list_num_birds = new ArrayList<>();
        list_num_birds.add(12);
        list_num_birds.add(22);
        list_num_birds.add(5);

        ArrayList<Feeder> feeders = new ArrayList<>();

        // one day simulation 3 TEST CASES
        for (int i = 0; i < list.size(); i++) {

            feeders.add(new Feeder(list.get(i)));

            feeders.get(i).simulateOneDay(list_num_birds.get(i));
            System.out.println("One day Simulation " + (i + 1) + ":");
            System.out.println("Food left after a day: " + feeders.get(i).getCurrentFood() + " grams.");

            System.out.println();
        }

        // many days simulation 3 TEST CASES
        //Feeder feeder = new Feeder(2400);

        ArrayList<Integer> many_initial_food = new ArrayList<Integer>();
        many_initial_food.add(2400);
        many_initial_food.add(250);
        many_initial_food.add(0);

        List<Integer> many_num_birds = new ArrayList<Integer>();
        many_num_birds.add(10);
        many_num_birds.add(10);
        many_num_birds.add(5);

        List<Integer> many_num_days = new ArrayList<Integer>();
        many_num_birds.add(4);
        many_num_birds.add(5);
        many_num_birds.add(10);

        ArrayList<Feeder> many_feeders = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            many_feeders.add(new Feeder(list.get(i)));

            int dayswithfood = many_feeders.get(i).simulateManyDays(many_num_birds.get(i), many_num_days.get(i));
            System.out.println("Many day Simulation " + (i + 1) + ":");
            System.out.println("Number of days with food: " + dayswithfood + " day(s).");
            System.out.println("Food left after many days: " + many_feeders.get(i).getCurrentFood() + " grams");
            System.out.println();
        }
       // int numBirds = 10;
      //  int numDays = 4;

        //System.out.println("Many days Simulation:");
       // int dayswithfood = feeder.simulateManyDays(numBirds, numDays);
       // System.out.println("Number of days with food: " + dayswithfood + " day(s).");

        //
       // System.out.println("Food left after many days: " + feeder.getCurrentFood() + " grams");
        // note to self
        // nvm it does work it was js bcuz my numbirds and numdays were values where the food left was 0

        }
    }