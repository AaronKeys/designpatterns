package state;

public class DeliveredState extends State {
    private Package pkg;
    private int quantity;
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public String getStatus() {
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " here for you.";
    }

    public String getETA() {
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " here";
    }

    public String delay() {
        String verb = getVerb("has", "have");
        return "The " + pkg.getName() + " " + verb + " already been delivered";
    }
}
