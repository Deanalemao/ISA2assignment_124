
package Question10_124;
public class Studentmain {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        
        student1.setInfo("Alice", 20);
        student2.setInfo("Bob", 22, "123 Main St");
        student3.setInfo("Charlie", 25, "456 Elm St");

       
        System.out.println("Student 1:");
        student1.printInfo();
        System.out.println();

        System.out.println("Student 2:");
        student2.printInfo();
        System.out.println();

        System.out.println("Student 3:");
        student3.printInfo();
    }
}

 class Student{
    private String name;
    private int age;
    private String address;

   
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

 
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
