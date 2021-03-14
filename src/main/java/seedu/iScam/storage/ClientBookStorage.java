package seedu.iScam.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.iScam.commons.exceptions.DataConversionException;
import seedu.iScam.model.ClientBook;
import seedu.iScam.model.ReadOnlyClientBook;

/**
 * Represents a storage for {@link ClientBook}.
 */
public interface ClientBookStorage {

    /**
     * Returns the file path of the data file.
     */
    Path getAddressBookFilePath();

    /**
     * Returns ClientBook data as a {@link ReadOnlyClientBook}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyClientBook> readAddressBook() throws DataConversionException, IOException;

    /**
     * @see #getAddressBookFilePath()
     */
    Optional<ReadOnlyClientBook> readAddressBook(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyClientBook} to the storage.
     * @param addressBook cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveAddressBook(ReadOnlyClientBook addressBook) throws IOException;

    /**
     * @see #saveAddressBook(ReadOnlyClientBook)
     */
    void saveAddressBook(ReadOnlyClientBook addressBook, Path filePath) throws IOException;

}
