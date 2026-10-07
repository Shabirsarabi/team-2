public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Demo ===");

        NotificationFactory emailFactory = new EmailNotificationFactory();
        BookClubNotifier emailNotifier = new BookClubNotifier(emailFactory);
        emailNotifier.notifyUser(
                "aigerim@mail.kz",
                "You have a new book match with Arman."
        );

        NotificationFactory telegramFactory = new TelegramNotificationFactory();
        BookClubNotifier telegramNotifier = new BookClubNotifier(telegramFactory);
        telegramNotifier.notifyUser(
                "@aigerim_reads",
                "The book club meetup starts at 18:00."
        );

        NotificationFactory smsFactory = new SmsNotificationFactory();
        BookClubNotifier smsNotifier = new BookClubNotifier(smsFactory);
        smsNotifier.notifyUser(
                "+7 701 000 00 00",
                "Your new book match is waiting."
        );
    }
}
