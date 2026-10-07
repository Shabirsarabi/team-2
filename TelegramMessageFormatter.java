public class TelegramMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "📚 " + message;
    }
}
