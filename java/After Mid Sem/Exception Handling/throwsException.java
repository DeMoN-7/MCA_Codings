public class throwsException {
    public static int divide(int a,int b)throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println(divide(22,0));
    }
}
