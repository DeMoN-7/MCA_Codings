class thre1 extends Thread {
    thre1(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("hello" + this.getName());
            try {
                Thread.sleep(600);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class threadSleep {
    public static void main(String[] args) {
        thre1 t1=new thre1("Ayush");
        t1.start();
    }
}
