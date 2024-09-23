import java.util.Random;

public class Feeder {

    public Feeder(int initialFood) {
        currentFood = initialFood;
    }

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */

    private int currentFood;

    public int getCurrentFood()
    {
        return currentFood;
    }

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */

    public void simulateOneDay(int numBirds)
    {
        // reference https://www.geeksforgeeks.org/java-util-random-nextint-java/
        // inspo from that one slide during class too
     Random rand = new Random();

     if (Math.random() < 0.95) {
         int foodPerBird = rand.nextInt(41) + 10; // random food between 10 and 50
         int totalFoodEaten = numBirds * foodPerBird;

         if (totalFoodEaten > currentFood) { // precondition of simulate food >> than feeder??
             currentFood = 0;
         } else {
             currentFood -= totalFoodEaten;
         }

     } else {
         currentFood = 0;
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */

    public int simulateManyDays(int numBirds, int numDays) {
        int dayswithfood = 0;

        // reference https://www.w3schools.com/java/java_for_loop.asp
        for (int i = 0; i < numDays; i++) {
            if (currentFood > 0) {
                simulateOneDay(numBirds);
                dayswithfood++;
            } else {
                break;
            }
        }

        return dayswithfood;
    }

}