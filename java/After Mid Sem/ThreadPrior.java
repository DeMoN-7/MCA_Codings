class thr extends Thread {
    thr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread name " + this.getName());
    }
}

public class ThreadPrior {
    public static void main(String[] args) {
        thr t1 = new thr("Thread 1");
        thr t2 = new thr("Thread 2");
        thr t3 = new thr("Thread 3");
        thr t4 = new thr("Thread 4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
