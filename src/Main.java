import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Passenger> passen= new ArrayList<>();


        Route route1 = new Route("Riyadh", "Macca", 150);
        Route route2 = new Route("Madina", "Jeddah", 100);

        Car car1 = new Car("CAR1", route1, 4);
        Car car2 = new Car("CAR2", route2, 0);

        Passenger p1= new SubscribersPassengers("Sarah","123");
        passen.add(p1);
        Passenger p2 = new NonSubscribersPassengers("Maryam","333", true);
        passen.add(p2);



        for (int i = 0; i < passen.size(); i++) {
            try {
                Car car = (i == 0) ? car1 : car2;
                passen.get(i).reserv(car);
                passen.get(i).displayInformation();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }



    }
}