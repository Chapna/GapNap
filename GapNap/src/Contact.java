import java.util.ArrayList;

class Contact {

	final String id;
	String name;
	ArrayList<Message> messages;

	Contact(String id, String name) {
		this.id = id;
		this.name = name;
		messages = new ArrayList<Message>();
	}

	Contact(String id) {
		this.id = id;
		name = "unknown";
		messages = new ArrayList<Message>();
	}

	String getID() {
		return id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void addMessage(Message m) {
		messages.add(m);
	}

	void deleteMessage(Message m) {
		messages.remove(m);
	}

	void clearMessages() {
		messages.clear();
	}

	ArrayList<Message> getMessages() {
		return messages;
	}
}