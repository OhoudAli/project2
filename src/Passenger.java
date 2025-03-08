public abstract class Passenger {

    private String name;
    private String id;
    private Car reserved_car;
    private double trip_cost;

    public Passenger(String name, String id) {
        this.name=name;
        this.id=id;
    }

    public abstract double calcTripCost(double trip_price);
    public abstract void displayInformation();

    public Passenger() {
    }

    public Passenger(String name, String id, Car reserved_car, double trip_cost) {
        this.name = name;
        this.id = id;
        this.reserved_car = reserved_car;
        this.trip_cost = trip_cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(int trip_cost) {
        this.trip_cost = trip_cost;
    }

    public void reserv(Car car) throws Exception {
        if(car.getMax_capacity_per_trip()<=0){
            throw new Exception("Car " + car.getCode() + "does not accept more passengers.");
        }
        this.reserved_car = car;
        this.trip_cost = calcTripCost(car.getFixed_route().getTrip_price());
        car.countCapacity();
    }

}

