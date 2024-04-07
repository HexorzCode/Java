
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
@SuppressWarnings("rawtypes")
class Student extends User {
    private String name;
    private String nim;
    private String faculty;
    private String program;
    private ArrayList<Book> borrowedBooks;
    private int loanDuration;

    @SuppressWarnings("unchecked")
    public Student(String name, String nim, String fakultas, String prodi) {
        this.name = name;
        this.nim = nim;
        this.faculty = fakultas;
        this.program = prodi;
        this.borrowedBooks = new ArrayList();
    }

    public void menuStudent(Scanner name) {
        while (true) {
            System.out.println("=== Student Menu ===");
            System.out.println("1. Buku terpinjam");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Pinjam Buku atau Logout");
            System.out.print("Choose option (1-3): ");
            switch (name.nextLine()) {
                case "1":
                    System.out.println("Buku terpinjam:");
                    this.displayBorrowedBooks();
                    break;
                case "2":
                    this.displayBooks();
                    this.borrowBook(name);
                    break;
                case "3":
                    System.out.println("System logout...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public Student(String name) {
        Iterator nim = Main.userStudent.iterator();

        while (nim.hasNext()) {
            Student fakultas = (Student) nim.next();
            if (fakultas.getNim().equals(name)) {
                this.name = fakultas.getName();
                this.nim = fakultas.getNim();
                this.faculty = fakultas.getFaculty();
                this.program = fakultas.getProgram();
                this.borrowedBooks = fakultas.getBorrowedBooks();
                break;
            }
        }

    }

    public String getNim() {
        return this.nim;
    }


    public void borrowBook(Book name) {
        this.borrowedBooks.add(name);
    }

    public void returnBook(Book name) {
        this.borrowedBooks.remove(name);
    }

    public void displayBorrowedBooks() {
        if (this.borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            System.out.println("=================================================================================");
            System.out.println("|| No. || Id Buku        || Nama Buku    || Author       || Category   || Durasi ||");
            System.out.println("=================================================================================");
            int name = 1;

            for (Iterator nim = this.borrowedBooks.iterator(); nim.hasNext(); ++name) {
                Book fakultas = (Book) nim.next();
                System.out.println("|| " + name + "  || " + fakultas.getId() + " || " + fakultas.getTitle() + " || "
                        + fakultas.getAuthor() + " || " + fakultas.getCategory() + " || " + fakultas.getLoanDuration() + " ||");
            }

            System.out.println("=================================================================================");
        }

    }

    
    @Override
    public void displayBooks() {
        super.displayBooks();
    }
    public void borrowBook(Scanner name) {
        System.out.print("Enter the number of the book you want to borrow: ");
        int nim = Integer.parseInt(name.nextLine()) - 1;
        if (nim >= 0 && nim < Main.bookList.size()) {
            Book fakultas = (Book) Main.bookList.get(nim);
            System.out.print("Enter the duration of loan (in days): ");
            int prodi = Integer.parseInt(name.nextLine());
            if (fakultas.getStock() > 0) {
                fakultas.setStock(fakultas.getStock() - 1);
                fakultas.setLoanDuration(prodi);
                this.borrowBook(fakultas);
                PrintStream name0000 = System.out;
                String name0001 = fakultas.getTitle();
                name0000.println("Book '" + name0001 + "' borrowed successfully for " + prodi + " days.");
            } else {
                System.out.println("Sorry, the selected book is out of stock.");
            }

        } else {
            System.out.println("Invalid book selection.");
        }
    }

    public void setLoanDuration(int name) {
        this.loanDuration = name;
    }

    public int getLoanDuration() {
        return this.loanDuration;
    }

    public String getName() {
        return this.name;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public String getProgram() {
        return this.program;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }
}
