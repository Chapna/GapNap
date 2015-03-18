import java.util.*;

class User {

	final String id;
	ArrayList<Contact> contacts;
	ArrayList<Server> servers;
	
	User(String id) {
		this.id = id;
		contacts = new ArrayList<Contact>();
		updateServer();
	}
	
	void addContact(Contact c) {
		contacts.add(c);
	}
	
	void deleteContact(Contact c) {
		contacts.remove(c);
	}
	
	void updateServer() {
		servers = new ArrayList<Server>();
		//TODO
	}
	
	
}