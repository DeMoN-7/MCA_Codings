public class excep {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.exit(0);
            int []a1={1,2,3};
            System.out.println(a1[4]);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally");
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array");
        // }
        
    }
}
