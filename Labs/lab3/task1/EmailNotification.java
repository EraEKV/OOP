package task1;

public class EmailNotification extends Notification implements Trackable {
	private String email;
	
	
	public EmailNotification() {

	}
	
	public EmailNotification(String recipient, String email) {
		super(recipient);
		this.email = email;
	}
	
	
	@Override
	public String trackStatus() {
        return "Email delivery status for " + email + ": Delivered";
    }
	@Override
	String send(String message) {
		return "Message sent to " + recipient + " with email: " + email + "\n" + message;
	}
	
	
	@Override
	public String toString() {
		return "Email " + super.toString();
	}
	
}
