public class Student extends User {
    String name;
    String faculty;
    String programStudi;
    
    public Student(String name, String faculty, String programStudi) {
        this.name = name;
        this.faculty = faculty;
        this.programStudi = programStudi;
    }

    public void logout() {
        System.out.println("Logging out...");
    }
    @Override
    public void displayBooks(String[] bookList) {
        super.displayBooks(bookList);
    }
}
