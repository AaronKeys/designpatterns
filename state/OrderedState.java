package state;

public class OrderedState extends State {
    private int days;
    private Package pkg;
    private int quantity;
    
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 2;
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public String getStatus() {
        String verb = getVerb("was", "were");
        return "The " + pkg.getName() + " " + verb + " ordered";
    }

    public String getETA() {
        return "The " + pkg.getName() + " will be shipped within " + 
        days + " business days.";
    }

    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing."
               + "\n" + getETA();
    }
}
