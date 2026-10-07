public class EmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[EMAIL -> " + recipient + "] " + message);
    }
}
