class parent{
    parent(){
        System.out.println("In parent");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("in child");
    }
}
public class superfunc {
    public static void main(String[] args) {
        child ch=new child();
    }
}
