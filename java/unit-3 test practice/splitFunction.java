public class splitFunction {
public static void main(String[] args) {
    String str="hello@ayush.,singh.in,@okmail@@";
    String []res=str.split("@",-3);
    for (String string : res) {
        System.out.println(string);
    }
    System.out.println(".....");
    String []res1=str.split(",");
    for (String string : res1) {
        System.out.println(string);
    }
}    
}
