package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.ContactService;
import main.Contact;

public class ContactServiceTest {

	@Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("0123456788", "John", "Doe", "1234567890", "123 Main St");
        Contact contact1 = new Contact("0123456788", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        assertTrue(contact.getId().equals("0123456788"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	contactService.addContact(contact1);
        });
    }
	
	@Test
	public void testDeleteContact () {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("0123456788", "John", "Doe", "1234567890", "123 Main St");
        //contactService.addContact(contact);

        assertTrue(contact.getId().equals("0123456788"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	contactService.deleteContact("0123456788");
        });
	}
	
	@Test
	public void testUpdateInfo () {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("0123456788", "John", "Doe", "1234567890", "123 Main St");

        contact.setFirstName("Jane");
        contact.setLastName("Low");
        contact.setPhone("5554567890");
        contact.setAddress("321 North Main St");

        assertEquals("Jane", contact.getFirstName());
        assertEquals("Low", contact.getLastName());
        assertEquals("5554567890", contact.getPhone());
        assertEquals("321 North Main St", contact.getAddress());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	contactService.updateInfo(contact, "John", "Doe", "1234567890", "123 Main St");
        });
    }
	}

