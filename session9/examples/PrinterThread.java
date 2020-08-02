public class PrinterThread extends Thread {
    @Override
    public void run() {
        System.out.println("Inside run() method");
    }

    public static void main(String[] args) {
        System.out.println("Application start");
        Thread thread = new PrinterThread();
        thread.start();
        System.out.println("Application end");
    }
}
