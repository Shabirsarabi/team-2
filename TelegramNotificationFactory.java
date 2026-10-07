/**
 * Concrete Factory for the Telegram family.
 */
public class TelegramNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new TelegramNotification();
    }

    @Override
    public MessageFormatter createFormatter() {
        return new TelegramMessageFormatter();
    }
}
