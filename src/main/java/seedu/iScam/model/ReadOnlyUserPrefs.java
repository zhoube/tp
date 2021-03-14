package seedu.iScam.model;

import java.nio.file.Path;

import seedu.iScam.commons.core.GuiSettings;

/**
 * Unmodifiable view of user prefs.
 */
public interface ReadOnlyUserPrefs {

    GuiSettings getGuiSettings();

    Path getClientBookFilePath();

}
