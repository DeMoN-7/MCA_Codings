class thre extends Thread{
    thre(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println("hello"+this.getName());
    }
}
public class threadMeth {
    public static void main(String[] args) {
        thre t1=new thre("Thread 1");
        thre t2=new thre("Thread 2");
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }    
}
