
package Question11_124;
import java.util.Scanner;

//Subclass
class TeacherTeaches extends Teachers {
 private String name;

 // Constructor
 public TeacherTeaches(String type) {
     this.type = type;
 }

 // Method to print the subject
 public void Subjects() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the subject: ");
     name = scanner.nextLine();
     scanner.close();
     System.out.println("The teacher is teaching " + name);
 }
}

public class Teachermain {
 public static void main(String[] args) {
     // Create an object of TeacherTeaches class
     TeacherTeaches teacher = new TeacherTeaches("JAVA");

     // Call the Teaches method from the parent class
     teacher.Teaches();

     // Call the Subjects method from the subclass
     teacher.Subjects();
 }
}

 class Teachers {
    protected String type;

    // Method to print what the teacher teaches
    public void Teaches() {
        System.out.println("The teacher is teaching " + type);
    }
}
