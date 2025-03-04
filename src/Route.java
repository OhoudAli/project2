public class Route {


    private String start_pick_up_address;
    private String des_address;
    private double trip_price;


    public Route() {
    }

    public Route(String start_pick_up_address, String des_address,double trip_price ) {
        this.trip_price = trip_price;
        this.des_address = des_address;
        this.start_pick_up_address = start_pick_up_address;
    }

    public String getStart_pick_up_address() {
        return start_pick_up_address;
    }

    public void setStart_pick_up_address(String start_pick_up_address) {
        this.start_pick_up_address = start_pick_up_address;
    }

    public String getDes_address() {
        return des_address;
    }

    public void setDes_address(String des_address) {
        this.des_address = des_address;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }

}
