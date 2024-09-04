interface temp{
   default void prin(){
        System.out.println("from interface");
    }
}
class tempp implements temp{
    public void info(){
        System.out.println("form temp");
    }
}
public class sep2  {
    public static void main(String[] args) {
        System.out.println("Main Func");
        tempp tt= new tempp();
        tt.info();
        tt.prin();
        
    }   
}
