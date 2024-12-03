class thr extends Thread {
    thr(String name) {
        super(name);
    }

    public void run() {
        while (true)
            System.out.println("Thread name " + this.getName());
    }
}

public class ThreadPrior {
    public static void main(String[] args) {
        thr t1 = new thr("Thread 1 important");
        thr t2 = new thr("Thread 2 normal");
        thr t3 = new thr("Thread 3 low");
        thr t4 = new thr("Thread 4");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
