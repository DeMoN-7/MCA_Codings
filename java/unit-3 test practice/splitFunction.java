public class splitFunction {
public static void main(String[] args) {
    String str="hello@ayush.singh.in,@okmail";
    String []res=str.split("@");
    for (String string : res) {
        System.out.println(string);
    }
}    
}
