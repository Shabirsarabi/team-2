public class SmsMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return message.length() > 80 ? message.substring(0, 80) : message;
    }
}
