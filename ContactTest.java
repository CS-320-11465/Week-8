package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.Contact;

class ContactTest {
		
	@Test
	void testContact() {
		Contact contact = new Contact("0123456789", "John", "Doe", "5552134789", "123 Main St.");
		assertTrue(contact.getId().equals("0123456789"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getPhone().equals("5552134789"));
		assertTrue(contact.getAddress().equals("123 Main St."));
		
	}
	
// ID	
	@Test
	void testContactTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("123456789112313", "John", "Doe", "5552134789", "123 Main St.");
			});
	}
	@Test 
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Doe", "5552134789", "123 Main St.");
		});
	}
	
//firstName;
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("0123456789", "Johnahyayao", "Doe", "5552134789", "123 Main St.");
			});
	}
	@Test 
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", null, "Doe", "5552134789", "123 Main St.");
		});
	}

//lastName;
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("0123456789", "John", "Doejuatrark", "5552134789", "123 Main St.");
			});
	}
	@Test 
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", null, "5552134789", "123 Main St.");
		});
	}
	
//phone;
	@Test
	void testContactPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("0123456789", "John", "Doe", "555", "123 Main St.");
			});
	}
	@Test 
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doe", null, "123 Main St.");
		});
	}
	
//address
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("0123456789", "John", "Doe", "5552134789", "12345678945612 Main West Street");
			});
	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "John", "Doe", "5552134789", null);
		});
	}
}






