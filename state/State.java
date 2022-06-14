package state;

public abstract class State {
    private Package pkg;
    private int quantity;

    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public abstract String getStatus();

    public abstract String getETA();

    public abstract String delay();

    protected String getVerb(String singular, String plural) {
        if(quantity == 1) {
            return singular;
        } else {
            return plural;
        }
    }
}
