public class CustomException extends Exception {
    public static void check(int n){
        if(n>5){
            throw new IllegalArgumentException("Age error");
        }
        else
        System.out.println("ok");
    }
public static void main(String[] args) {
    int i=10-6;
    
    check(i);
}    
}
