package duke.parse.command;

import duke.Duke;

public class EmptyCommand implements Command {
    public EmptyCommand() {}

    @Override
    public boolean execute(Duke bot) {
        return true;
    }
}
