import java.util.LinkedList;
import java.util.List;

class MessageList {
    private List<String> messageList;

    public MessageList () {
        messageList = new LinkedList<>();
    }

    public String insert (String data) {
        messageList.add(data);
        return data;
    }

    public String retrieve () {
        return messageList.remove(0);
    }

    public int messageCount () {
        return messageList.size();
    }
}

class Producer implements Runnable {
    private final MessageList messageList;

    public Producer (MessageList messageList) {
        this.messageList = messageList;
    }

    public void run () {
        synchronized (messageList) {
            for (int i=0; i<10; i++) {
                while (messageList.messageCount() >= 3) {
                    try {
                        messageList.notify();
                        messageList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Producer: " + messageList.insert("message " + i));
            }
            messageList.notify();
        }
    }
}

class Consumer implements Runnable {
    private final MessageList messageList;

    public Consumer (MessageList messageList) {
        this.messageList = messageList;
    }

    public void run () {
        synchronized (messageList) {
            for (int i=0; i<10; i++) {
                while (messageList.messageCount() == 0) {
                    try {
                        messageList.notify();
                        messageList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer: " + messageList.retrieve());
            }
            messageList.notify();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        MessageList messageList = new MessageList();
        Thread producer = new Thread (new Producer(messageList));
        Thread consumer = new Thread (new Consumer(messageList));
        producer.start();
        consumer.start();
    }
}
