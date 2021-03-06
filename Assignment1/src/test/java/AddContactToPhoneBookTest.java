import Methods.NameToNumberConverter;
import org.junit.jupiter.api.Test;
import PhoneBook.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddContactToPhoneBookTest {

    @Test
    void checkingWhetherContactIsSavingInPhoneBookListProperly(){
        Contact contact = new Contact();
        contact.setFirstName("Loki");
        contact.setLastname("R");
        contact.setFirstHalfOfPhoneNumber("12345");
        contact.setSecondHalfOfPhoneNumber("67890");
        contact.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        PhoneBook phoneBook = new PhoneBook();
        AddContactToPhoneBook addContactToPhoneBook = new AddContactToPhoneBook();
        List<Contact> contactList = phoneBook.getPhoneBook();
        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList,contact);

        Contact contact2 = new Contact();
        contact2.setFirstName("cherry");
        contact2.setLastname("lion");
        contact2.setFirstHalfOfPhoneNumber("09876");
        contact2.setSecondHalfOfPhoneNumber("54321");
        contact2.setFirstNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getFirstName()));
        contact2.setLastNameInNumber(NameToNumberConverter.nameToNumberConverter(contact.getLastname()));
        contactList = addContactToPhoneBook.addContactToPhoneBook(contactList,contact2);


        assertEquals("lion",contactList.get(1).getLastname());
    }

}