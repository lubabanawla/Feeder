public class Feeder {

    public Feeder() {}
    public Feeder(int c)
    {
        currentFood = c;
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
    if (numBirds > 0) {
        if (Math.random() < 0.95) {
            int foodPerBird = (int) (Math.random() * 40) + 10;
            currentFood = numBirds * foodPerBird;
        } else { // precondition of simulate food >> than feeder??
            currentFood = 0;
        }
    }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) {
        if (numBirds > 0 && numDays > 0) {
            simulateOneDay(numBirds);
            while getCurrentFood() != 0{
                if (getCurrentFood() = 0) {
                    return 0;
                }
            }
        }
    }

}