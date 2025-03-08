import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Passenger> passen= new ArrayList<>();


        Route route1 = new Route("Riyadh", "Macca", 150);
        Route route2 = new Route("Madina", "Jeddah", 100);

        Car car1 = new Car("CAR1", route1, 4);
        Car car2 = new Car("CAR2", route2, 0);

        passen.add(new SubscribersPassengers("Sarah", "123"));
        passen.add(new NonSubscribersPassengers("Maryam", "333", true));
        passen.add(new SubscribersPassengers("Ali", "444"));
        passen.add(new NonSubscribersPassengers("Ahmed", "555", false));
        passen.add(new SubscribersPassengers("Norah", "666"));

        for (Passenger p : passen) {
            try {
                p.reserv(car1);
                p.displayInformation();
                System.out.println("Available Seats: " + car1.getMax_capacity_per_trip());
            } catch (Exception e) {
                System.out.println("Reservation failed: " + e.getMessage());
            }
        }

    }
}