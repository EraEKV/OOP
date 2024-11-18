package task1;

public class TestNotification {
	
    public static void main(String[] args) {
        Notification email = new EmailNotification("Kokenov", "email@example.com");
        Notification sms = new SMSNotification("Erasyl", "+123456789");

        String emailResult = email.send("Hello via Email!");
        String smsResult = sms.send("Hello via SMS!");

        System.out.println(email.log(emailResult));
        System.out.println(sms.log(smsResult));
        
        if (email instanceof Trackable) {
            System.out.println(((Trackable) email).trackStatus());
        }
    }
}