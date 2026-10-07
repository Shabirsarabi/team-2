/**
 * Concrete Factory for the SMS family.
 */
public class SmsNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }

    @Override
    public MessageFormatter createFormatter() {
        return new SmsMessageFormatter();
    }
}
