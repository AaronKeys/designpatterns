package command;

import java.util.HashMap;

public class InputHandler  {
    
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    public InputHandler(StopWatch watch) {

    }

    public boolean inputEntered(String data) {
        return false;
    }
}
