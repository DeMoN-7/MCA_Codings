class Agee extends Exception{
    Agee(String message){
        super(message);
    }
}
public class CustomException1_1 {
public static void main(String[] args) {
    int a=10;
    try{

        if (a<11){
            throw new Agee("Too Small");
        }
        else{
            System.out.println("good");
        }
    }catch(Agee e){
        System.out.println(e);
    }

}    
}
