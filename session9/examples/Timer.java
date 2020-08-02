public class Timer extends Thread {

    private int interval;

    public Timer (String name, int interval) {
        super(name);
        this.interval = interval;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + ": starting");
        while (interval-- > 0) {
            System.out.println(this.getName() + ": tick");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + ": time's up");
    }

    public static void main(String[] args) {
        Thread timer1 = new Timer("timer 1", 5);
        timer1.start();
        Thread timer2 = new Timer("timer 2", 8);
        timer2.start();
    }
}
