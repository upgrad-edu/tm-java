public class Timer implements Runnable {

    private int interval;
    private String name;

    public Timer (String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        System.out.println(this.name + ": starting");
        while (interval-- > 0) {
            System.out.println(this.name + ": tick");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + ": time's up");
    }

    public static void main(String[] args) {
        Thread timer1 = new Thread(new Timer("timer 1", 5));
        timer1.start();

        Thread timer2 = new Thread(new Timer("timer 2", 8));
        timer2.start();
    }
}
