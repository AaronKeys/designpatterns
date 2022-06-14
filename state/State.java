package state;

public abstract class State {
    private Package pkg;
    private int quantity;

    public State(Package pkg, int quantity) {
        
    }

    public abstract String getStatus();

    public abstract String getETA();

    public abstract String delay();

    protected String getVerb(String singular, String plural) {
        if(quantity == 1) {
            return singular;
        } else if (quantity > 1) {
            return plural;
        } else {
            return "Wrong input";
        }
    }
}
