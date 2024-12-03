class thre extends Thread{
    thre(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<50;i++)
        System.out.println("hello"+this.getName());
    }
}
public class threadMeth {
    public static void main(String[] args) {
        thre t1=new thre("Thread 1");
        thre t2=new thre("Thread 2");
        
    }    
}
