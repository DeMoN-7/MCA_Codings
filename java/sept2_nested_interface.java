interface parent{
    interface child{
        default void info(){
            System.out.println("from child");
        }
    }
    default void info(){
        System.out.println("from parent");
    }
}
class inter implements parent{
    public void info(){
        parent.super.info(); //call info from parent
        parent.child obj=new child() {
           
        };
        obj.info();// call info from child
        System.out.println("from inter ");
    }
}
public class sept2_nested_interface {
    public static void main(String[] args) {
        inter inn=new inter();
        // inn.info();
        parent par=new inter();
        par.info();
    }
}
