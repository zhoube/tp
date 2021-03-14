package seedu.iScam.testutil;

import seedu.iScam.model.ClientBook;
import seedu.iScam.model.client.Client;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
 *     {@code ClientBook ab = new AddressBookBuilder().withClient("John", "Doe").build();}
 */
public class AddressBookBuilder {

    private ClientBook clientBook;

    public AddressBookBuilder() {
        clientBook = new ClientBook();
    }

    public AddressBookBuilder(ClientBook clientBook) {
        this.clientBook = clientBook;
    }

    /**
     * Adds a new {@code Client} to the {@code ClientBook} that we are building.
     */
    public AddressBookBuilder withClient(Client client) {
        clientBook.addClient(client);
        return this;
    }

    public ClientBook build() {
        return clientBook;
    }
}
