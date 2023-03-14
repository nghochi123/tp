package seedu.duke.commands;

import seedu.duke.entrylog.EntryLog;
import seedu.duke.storage.Storage;
import seedu.duke.ui.UI;

public class Command {
    private final boolean isExit;

    public Command() {
        this(false);
    }

    public Command(boolean isExit) {
        this.isExit = isExit;
    }

    public void execute(EntryLog entries, UI ui, Storage storage) throws Exception {
        executor(entries, ui);
        storage.writeToDatabase(entries.getEntriesList());
    }

    public void executor(EntryLog entries, UI ui) throws Exception {
    }

    public boolean getIsExit() {
        return isExit;
    }
}
