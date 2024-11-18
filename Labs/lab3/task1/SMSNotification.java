package task1;

public class SMSNotification extends Notification {
	private String phone;
	
	
	public SMSNotification() {

	}
	
	public SMSNotification(String recipient, String phone) {
		super(recipient);
		this.phone = phone;
	}
	
	@Override
	String send(String message) {
		return "Message sent to " + recipient + " with phone: " + phone + "\n" + message;
	}
	
	
	@Override
	public String toString() {
		return "SMS " + super.toString();
	}
	
}
