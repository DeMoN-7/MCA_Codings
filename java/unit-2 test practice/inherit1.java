class parent {
    int a=10;
    parent(){
        System.out.println("Hi from parents");
    }
}
class child extends parent {
    int b=10;
    child(){
        System.out.println("Hi from child");
    }
}
public class inherit1 {
    public static void main(String[] args) {
        child ch=new child();
        System.out.println("ok "+ch.a+ch.b);
        System.out.println(ch.a+ch.b+" ok");
    }    
}
