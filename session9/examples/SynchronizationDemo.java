class Counter {
    private long count = 0;

    public long getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }
}

class Incrementer implements Runnable {
    private Counter counter;
    private int repetition;

    public Incrementer (Counter counter, int repetition) {
        this.counter = counter;
        this.repetition = repetition;
    }

    @Override
    public void run() {
        for (int i = 0; i< repetition; i++) {
            counter.incrementCount();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread incrementer1 = new Thread (new Incrementer(counter, 10000));
        Thread incrementer2 = new Thread (new Incrementer(counter, 10000));
        incrementer1.start();
        incrementer2.start();
        Thread.sleep(5000);
        System.out.println(counter.getCount());
    }
}
