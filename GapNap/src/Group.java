import java.util.ArrayList;

class Group extends Contact {

	ArrayList<Contact> contacts;
	Contact admin;

	Group(String id, Contact admin) {
		super(id);
		this.admin = admin;
		// TODO Auto-generated constructor stub
		contacts = new ArrayList<Contact>();
	}

	void addContactToGroup(Contact c) {
		contacts.add(c);
	}

	void removeContacctFromGroup(Contact c, Contact permission) {
		if (permission.equals(admin)) {
			contacts.remove(c);
		}
	}

	Contact getAdmin() {
		return admin;
	}

	void changeAdmin(Contact c, Contact permission) {
		if (permission.equals(admin)) {
			admin = c;
		}
	}
}