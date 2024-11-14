class Innerbasic {
    
    int x=30;
    class inner{
        int z=33;
        public void info(){
            System.out.println(z);
            System.out.println(x);
        }
    } 
    public void outerInfo(){
        inner in=new inner();
        in.info();
    }   
}
public class basic {   
    public static void main(String[] args) {
        Innerbasic in=new Innerbasic();
        in.outerInfo();
        
    }
}