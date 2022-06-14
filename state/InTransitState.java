package state;

public class InTransitState extends State {
    private int days;
    private Package pkg;
    private int quantity;

    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public String getStatus() {
        String verb = getVerb("is", "are");
        return "The " + pkg.getName() + " " + verb + " out for delivery";
    }

    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + 
               days + " days";
    }

    public String delay() {
        String verb = getVerb("has", "have");
        days += 3;
        return "The " + pkg.getName() + " " + verb + " experienced a delay in shipping" +
               "\n" + getETA();
    }
}
