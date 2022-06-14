package state;

public class InTransitState extends State {
    private int days;
    
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
    }

    public String getStatus() {
        return "";
    }

    public String getETA() {
        return "";
    }

    public String delay() {
        return "";
    }
}
