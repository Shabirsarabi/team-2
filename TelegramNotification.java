public class TelegramNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("[TELEGRAM -> " + recipient + "] " + message);
    }
}
