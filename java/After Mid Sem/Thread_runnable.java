class bullet1 implements Runnable{
    public void run(){
        for (int i=0;i<100;i++)
        System.out.println("Bullet 1..............");
    }
}
class bullet2 implements Runnable{
    public void run(){
        for (int i=0;i<100;i++)
        System.out.println("Bullet2**************");
    }
}
public class Thread_runnable {
    public static void main(String[] args) {
        bullet1 bull1=new bullet1();
        Thread t1=new Thread(bull1);
        bullet2 bull2=new bullet2();
        Thread t2=new Thread(bull2);

        t1.start();
        t2.start();
    }
}
