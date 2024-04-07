import java.util.Scanner;

public class Main {
    private static String[] bookList = {
            "001\tBook 1\tAuthor 1\tCategory 1\t10",
            "002\tBook 2\tAuthor 2\tCategory 2\t15",
            "003\tBook 3\tAuthor 3\tCategory 3\t20"
    };
    private static String[] userStudent = {"12345678912345", "98765432112345"};
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admIn";

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int pilihanUser;
        String username;
        String password;
        Scanner keyboard = new Scanner(System.in);
        Admin admin = new Admin(ADMIN_USERNAME, ADMIN_PASSWORD);
        System.out.println("==== Library System ====");
        System.out.println("1. Login sebagai mahasiswa");
        System.out.println("2. Login sebagai admin");
        System.out.println("3. EXIT");
        System.out.print("Choose option (1/3): ");
        pilihanUser = keyboard.nextInt();

        switch (pilihanUser) {
            case 1:
                inputNim();
                break;
            case 2:
                System.out.print("Masukkan username: ");
                username = keyboard.next();
                System.out.print("Masukkan password: ");
                password = keyboard.next();
                if (username.equals(admin.getAdminUsername()) && password.equals(admin.getAdminPassword())){
                    menuAdmin();
                } else {
                    System.out.print("Tidak berhasil login sebagai Admin!");
                }
                break;
            case 3:
                System.out.println("adios");
                keyboard.close();
                break;
            default:
                System.out.print("Pilihan tidak ada. Harap pilih angka 1-3");
        }
    }

    public static void inputNim(){
        int s = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan NIM: ");
            String NIM = scanner.nextLine();
            
            if (String.valueOf(NIM).length() == 15) {
                checkNim(NIM);
                s = 0;
            } else {
                System.out.println("Nim Harus 15 Digit");
            }
            scanner.close();
        } while (s == 1);
    }

    public static Student checkNim(String NIM) {
        for (String usernim : userStudent) {
            if (usernim.equals(NIM)) {
                Student student = new Student("John Doe", "Engineering", "Computer Science");
                menuStudent(student);
                return student;
            }
        }
        return null;
    }

    public static void menuAdmin() {
        int loop = 1;
        do {
            
            Admin admin = new Admin("admin", "admIn");
            Scanner scanner = new Scanner(System.in);
            System.out.println("==== Admin Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. Display registered students");
            System.out.println("3. Logout");
            System.out.println("Choose option (1-3): ");
            int pilihanUser = scanner.nextInt();
            switch (pilihanUser) {
                case 1:
                    admin.addStudent();
                    break;
                case 2:
                    admin.displayStudent();
                    break;
                case 3:
                    System.out.println("Logging out from admin account");
                    Menu();
                    break;
                default:
                    System.out.println("Mohon untuk memasukkan angka 1-3");
                    loop = 0;
                    break;
            }
            scanner.close();
        } while (loop == 1);
    }

    public static void menuStudent(Student student) {
        //boolean logout = false;
        System.out.println("Berhasil login sebagai Mahasiswa!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Student Menu ====");
        System.out.println("1. Buku terpinjam");
        System.out.println("2. Pinjam buku");
        System.out.println("3. Logout");
        System.out.println("Choose option (1-3): ");
        int pilihanUser = scanner.nextInt();
        switch (pilihanUser) {
            case 1:
                System.out.println("List buku yang dipinjam:");
                System.out.println("Tidak ada list buku yang dimpinjam");
                break;
            case 2:
                student.displayBooks(bookList);
                System.out.print("Masukkan id buku yang ingin dipinjam (input 99 untuk kembali): ");
                String idBuku = scanner.nextLine();
                if (idBuku.equals("001") || idBuku.equals("002") || idBuku.equals("003")) {
                    System.out.println("Buku berhasil dipinjam.");
                } else if (idBuku.equals("99")) {
                    System.out.println("Logout.....");
                } else {
                    System.out.println("ID buku tidak valid.");
                }
                break;
            case 3:
                System.out.println("Berhasil logout");
                Menu();
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
        scanner.close();
    }
}

