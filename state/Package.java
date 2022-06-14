package state;

public class Package {
    
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State InTransitState;
    private State deliveredState;

    public Package(String name, int quantity) {

    }

    public String order() {
        return "";
    }

    public String mail() {
        return "";
    }

    public String received() {
        return "";
    }

    public void delay() {

    }

    public void setState(State state) {

    }

    public String getName() {
        return "";
    }
}
