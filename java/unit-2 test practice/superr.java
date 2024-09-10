class parent{
int a=20;
public int a1=30;
private int a2=40;
protected int a3=50;
}
class child extends parent{
    child(){
        System.out.println(super.a);
        System.out.println(super.a1);
        // System.out.println(super.a2);
        System.out.println(super.a3);
    }
}
public class superr {
    public static void main(String[] args) {
        child cj=new child();

    }
}
