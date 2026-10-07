/**
 * Abstract Factory:
 * Creates a family of related communication objects.
 */
public interface NotificationFactory {
    Notification createNotification();
    MessageFormatter createFormatter();
}
