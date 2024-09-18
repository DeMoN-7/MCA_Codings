public class stringCharArray {
    public static void main(String[] args) {
        char []arr={'a','y','u','s','h'};
        String s1= new String();
        String s2= new String(arr);
        String s3= new String(arr,1,3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }    
}
