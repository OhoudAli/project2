public class SubscribersPassengers extends Passenger{


    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    public SubscribersPassengers(String name, String id, Car reserved_car, int trip_cost) {
        super(name, id, reserved_car, trip_cost);
    }


    @Override
    public double calcTripCost(double trip_price) {
        return trip_price*50;
    }

    @Override
    public void displayInformation() {

        System.out.println("Passenger: " + this.getName() + " (ID: " + this.getId() + ")");
        if (getReserved_car() != null) {
            System.out.println("Car Code: " + getReserved_car().getCode());
            System.out.println("Route Price: " + getReserved_car().getFixed_route().getTrip_price());
            System.out.println("Trip Cost: " + getTrip_cost() + "\n");
        }
    }

    public SubscribersPassengers() {
    }

}
