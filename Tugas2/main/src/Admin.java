import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    String adminuser = "admin";
    String adminpw = "admIn";
    private List<String> studentList;

    public Admin(String adminUsername, String adminPassword) {
        this.studentList = new ArrayList<>();
    }

    @SuppressWarnings("resource")
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student NIM:");
        String nim = scanner.nextLine();
        if (nim.length() != 15) {
            System.out.println("Invalid NIM length. NIM must be 15 characters long.");
            return;
        }
        System.out.println("Enter student faculty:");
        String faculty = scanner.nextLine();
        System.out.println("Enter student program study:");
        String programStudi = scanner.nextLine();
        studentList.add("Name: " + name + ", NIM: " + nim + ", Faculty: " + faculty + ", Program Study: " + programStudi);
        System.out.println("Student " + name + " successfully added!");
        Main.menuAdmin();
        scanner.close();
    }

    public void displayStudent() {
        System.out.println("List of Students:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}
