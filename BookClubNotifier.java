/**
 * Client of the Abstract Factory.
 * It does not know which concrete notification family is being used.
 */
public class BookClubNotifier {
    private final Notification notification;
    private final MessageFormatter formatter;

    public BookClubNotifier(NotificationFactory factory) {
        this.notification = factory.createNotification();
        this.formatter = factory.createFormatter();
    }

    public void notifyUser(String recipient, String message) {
        notification.send(recipient, formatter.format(message));
    }
}
