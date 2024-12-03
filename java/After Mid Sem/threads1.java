class thread1 extends Thread{
    public void run(){
        while(true)
        System.out.println("Hello From thread 1");
    }
}
class thread2 extends Thread{
    public void run(){
        while(true)
        System.out.println("Hello From thread 2");
    }
}

public class threads1 {
public static void main(String[] args) {
    thread1 t1=new thread1();
    thread2 t2=new thread2();
    t1.start();
    t2.start();
}    
}
