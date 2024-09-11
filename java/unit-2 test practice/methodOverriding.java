class p{
    int x=10;
    void dd(){
        System.out.println("pp");
    }
}
class c extends p{
    int x=21;
    void dd(){
        System.out.println("cc");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        p p= new p();
        c c= new c();
        p a= new c();
        System.out.println(a.x);
        System.out.println(p.x);
        System.out.println(c.x);
        c.dd();
        p.dd();
        a.dd();
    }
}