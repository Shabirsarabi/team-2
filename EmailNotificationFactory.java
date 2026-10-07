/**
 * Concrete Factory for the Email family.
 */
public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public MessageFormatter createFormatter() {
        return new EmailMessageFormatter();
    }
}
