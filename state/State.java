package state;

public class State {
    private Package pkg;
    private int quantity;

    public State(Package pkg, int quantity) {
        
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

    protected String getVerb(String singular, String plural) {
        return "";
    }
}
