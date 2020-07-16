public class MessagePrinter {

    public void printMessageNTimes (String message, int n) {
        for (int i=0; i<=n; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        new MessagePrinter().printMessageNTimes("Hello World", 2);
    }
}