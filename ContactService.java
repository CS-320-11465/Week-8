package main;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

	private Map<String, Contact> contacts;

	public ContactService() {
		contacts = new HashMap<>();
	}

	public void addContact(Contact contact) {
		
		// throws error if contact is already in hash map
		if (contacts.containsKey(contact.getId())) {
			throw new IllegalArgumentException("Contact already exists");
		}
		
		contacts.put(contact.getId(), contact);
	}
	
	public void deleteContact(String contactId) {
		
		// throws error if contact is not in hash map
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact does not exist");
		}
		
		contacts.remove(contactId);
	}
	
	public void updateInfo(Contact searchId, String newFirstName, String newLastName, String newPhone, String newAddress) {

		
		if (!contacts.containsKey(searchId.getId())) {
			throw new IllegalArgumentException("Contact does not exist");
		}

	}
}

