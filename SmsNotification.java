public class SmsNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[SMS -> " + recipient + "] " + message);
    }
}
