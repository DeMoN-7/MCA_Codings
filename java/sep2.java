interface temp{
   default void prin(){
        System.out.println("from interface 1 ");
    }
}
interface temp1 extends temp{

   default void prin(){
        temp.super.prin();
        System.out.println("from interface 2 ");
    }
}
class tempp implements temp1{
    public void info(){
        System.out.println("form temp");
    }
    public void prin(){
        temp1.super.prin();
        System.out.println("form temp prin method");
    }
}
public class sep2  {
    public static void main(String[] args) {
        System.out.println("Main Func");
        tempp tt= new tempp();
        tt.info();
        tt.prin();
        // tt.prin1();
        
    }   
}
