package state;

public class Package {
    
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.inTransitState = new InTransitState(this, quantity);
        this.deliveredState = new DeliveredState(this, quantity);
        this.orderedState = new OrderedState(this, quantity);
    }

    public String order() {
        this.state = orderedState;
        return state.getStatus() + " \n" + state.getETA();
    }

    public String mail() {
        this.state = inTransitState;
        return state.getStatus() + " \n" + state.getETA();
    }

    public String received() {
        this.state = deliveredState;
        return state.getStatus();
    }

    public String delay() {
        return state.delay();
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }
}
