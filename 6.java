class Buffer {
    private int[] items;
    private int count = 0, putIndex = 0, takeIndex = 0;
    public Buffer(int size) {
        items = new int[size];
    }
    public synchronized void put(int item) throws InterruptedException {
        while (count == items.length) wait();
        items[putIndex] = item;
        putIndex = (putIndex + 1) % items.length;
        count++;
        System.out.println("Produced: " + item);
        notifyAll();
    }
    public synchronized int take() throws InterruptedException {
        while (count == 0) wait();
        int item = items[takeIndex];
        takeIndex = (takeIndex + 1) % items.length;
        count--;
        System.out.println("Consumed: " + item);
        notifyAll();
        return item;
    }
}
public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(5);
        int maxItems = 10;
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= maxItems; i++) {
                    buffer.put(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) { }
        });
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.take();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) { }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.interrupt();
        System.out.println("Process completed.");
    }
}
