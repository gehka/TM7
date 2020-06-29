package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commands;

    public Invoker() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void invoke() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
