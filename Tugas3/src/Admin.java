import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Admin extends User{
    private static List<String> studentList = new ArrayList<>();
    private String adminUsername;
    private String adminPassword;

    
    public Admin(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }
    
    public List<String> getStudentList() {
        return studentList;
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
        scanner.close();
        Main.menuAdmin();
    }

    @Override
    public void displayBooks(String[] bookList) {
        super.displayBooks(bookList);
    }

    
    public void inputbook() {
        super.addBook();
    }

    public void displayStudent() {
        System.out.println("List of Registered Students:");
        Iterator var1 = studentList.iterator();

        while(var1.hasNext()) {
            Student var2 = (Student)var1.next();
            System.out.println("Nama: " + var2.getName());
            System.out.println("Fakultas: " + var2.getFaculty());
            System.out.println("NIM: " + var2.getNim());
            System.out.println("Prodi: " + var2.getProgram());
            System.out.println();
        }
    }
}
