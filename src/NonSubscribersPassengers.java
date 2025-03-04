public class NonSubscribersPassengers extends Passenger{
    private boolean discount_coupon;


    public NonSubscribersPassengers() {
    }


    public NonSubscribersPassengers(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    public NonSubscribersPassengers(String name, String id, Car reserved_car, int trip_cost, boolean discount_coupon) {
        super(name, id, reserved_car, trip_cost);
        this.discount_coupon = discount_coupon;
    }

    public NonSubscribersPassengers(String name, String id, boolean discount_coupon) {
        super(name,id);
        this.discount_coupon=discount_coupon;
    }


    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }


//    @Override
//    public void carObject() {
//        if (isDiscount_coupon()){
//            double v = this.getTrip_cost() - (0.1 * this.getTrip_cost());
//        }else
//            System.out.println("you did not have discount :( ");
//
//
//    }

    @Override
    public double calcTripCost(double trip_price) {
        if(discount_coupon){
            double v = trip_price * 0.1;
        }
        return trip_price;
    }

    @Override
    public void displayInformation() {
//        System.out.println("The car name: "+getName()+"\nThe car code: "+getId()+"\nThe car route: "+getTrip_cost());
        System.out.println("Car Code: " + getReserved_car().getCode());
        System.out.println("Route Price: " + getReserved_car().getFixed_route().getTrip_price());
        System.out.println("Trip Cost: " + getTrip_cost() + "\n");
    }
}
