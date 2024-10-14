class animal{
    void eat(){
        System.out.println("animal");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("dog");
    }
}
public class method_overRiding {
    public static void main(String[] args) {
        animal a1=new dog();
        a1.eat();
        int arr[]={1,2};
        int arr[]={1,2};
    }
}
