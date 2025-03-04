public class Car {


    private String code;
    private Route fixed_route ;
    private int max_capacity_per_trip;



    public Car(Route fixedRoute) {
        fixed_route = fixedRoute;
    }

    public Car(String code, Route fixed_route, int max_capacity_per_trip) {
        this.code = code;
        this.fixed_route = new Route(fixed_route.getStart_pick_up_address(), fixed_route.getDes_address(), fixed_route.getTrip_price());
        this.max_capacity_per_trip = max_capacity_per_trip;
    }

    public Car(String code, Route fixed_route, int max_capacity_per_trip, Route route) {
        this.code = code;
        this.fixed_route = fixed_route;
        this.max_capacity_per_trip = max_capacity_per_trip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixed_route() {
        return fixed_route;
    }

    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }

    public int getMax_capacity_per_trip() {
        try{
            if (max_capacity_per_trip >0){
                return max_capacity_per_trip;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return max_capacity_per_trip;
    }

    public void setMax_capacity_per_trip(int max_capacity_per_trip) {
        this.max_capacity_per_trip = max_capacity_per_trip;
    }

}
