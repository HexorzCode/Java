import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opt;
        long nim;
        String admin_user, admin_pass;
        int input = 0;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("==== Library System ===");
            System.out.println("1. Login as student");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            opt = scanner.nextInt();

            switch (opt){
                case 1:
                    System.out.print("Enter your NIM : ");
                    nim = scanner.nextLong();
                    scanner.nextLine();
                    if (String.valueOf(nim).length() == 15){
                        System.out.println("Successfull Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin) : ");
                    admin_user = scanner.next();

                    System.out.print("Enter your password (admin) : ");
                    admin_pass = scanner.next();
                    if (admin_user.equals("admin") && admin_pass.equals("admIn")) {
                        System.out.println("Successfull Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    input = 1;
                    break;
                default:
                    System.out.println("Input anda salah");
                    break;
            }
        } while (input != 1);

    }
}