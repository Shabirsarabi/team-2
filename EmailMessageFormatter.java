public class EmailMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "Email message: " + message;
    }
}
