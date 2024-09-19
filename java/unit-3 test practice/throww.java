public class throww {
    static void check(int z){
        if (z<18){
            throw new ArithmeticException("Age must be above 18");

        }
        else{
            System.out.println("welcome");
        }
    }
    public static void main(String[] args) {
        check(19);
        check(12);
    }
}
