package task1;

public abstract class Notification {
	protected String recipient;
	
	public Notification() {
		
	}
	
	public Notification(String recipient) {
		this.recipient = recipient;
	}
	
	abstract String send(String message);
	
	String log(String message) {
		return "Log: " + message;
	}
	
	
	
	@Override
	public String toString() {
		return "Notification of " + this.recipient; 
	}
}
