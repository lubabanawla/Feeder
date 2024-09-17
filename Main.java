public class Main {
    public static void main(String[] args) {
        Feeder g = new Feeder(500);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());

    }

}