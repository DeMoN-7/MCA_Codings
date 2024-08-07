public class aug7 {
    aug7(){
        System.out.println("Constructor called\n\n");
    }
    public void fun(int n){
        System.out.println("printed from function: "+n);
    }
    public static void main(String[] args) {
        aug7 ag=new aug7();
        ag.fun(225);
    }
}