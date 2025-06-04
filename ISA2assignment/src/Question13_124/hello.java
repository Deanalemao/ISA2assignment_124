package Question13_124;

public class hello {

    int a = 10;  // Instance variable

    public static void main(String[] args){
        System.out.println("hello");

        helloo obj = new helloo();
        obj.printA();
    }
}

class helloo extends hello {

    void printA(){
        System.out.println(a);  // Accessing inherited variable 'a'
    }
}
