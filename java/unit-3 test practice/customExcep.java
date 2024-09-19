import java.util.*;

class excepCustom extends Exception {
    public excepCustom(String mess) {
        super(mess);
    }
}

public class customExcep {
    public static void checkAge(int age) throws excepCustom {
        if (age < 18) {
            throw new excepCustom("Grow up kid");
        } else {
            System.out.println("good");
        }

    }

    public static void main(String[] args) {
       try{
        checkAge(19);
        checkAge(21);
        checkAge(2);
       }
       catch(excepCustom e){
        System.out.println(e);
       }
        
        
    }
}
