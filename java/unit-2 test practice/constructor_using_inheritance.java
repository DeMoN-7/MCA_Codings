class parent {
    parent() {
        System.out.println("parent");
    }

}

class child extends parent {
    child() {
        System.out.println("child");
    }
}

public class constructor_using_inheritance {
    public static void main(String[] args) {
        // child ch=(child)new parent(); // converting parent to child not allowed
        parent p=new child(); //  converting child to parent not allowed
        // child ch =new child();
    }
}
