import java.util.List;
import java.util.Scanner;

public class User {
    private List<String> Book;

    public void displayBooks(String[] bookList) {
        System.out.println("==== Book List ====");
        System.out.println("ID\tNama Buku\tAuthor\tCategory\tStock");
        for (String book : bookList) {
            System.out.println(book);
        }
    }

    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        String author, title, stock;

        System.out.println("Select Book Category");
        System.out.println("1.Story Book");
        System.out.println("2.History Book");
        System.out.println("3.Text Book");

        int pil = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Book Title : ");
        title = scanner.nextLine();

        System.out.print("Enter Book author : ");
        author = scanner.nextLine();

        System.out.print("Enter Book stock : ");
        stock = scanner.nextLine();

        switch (pil) {
            case 1:
                System.out.println("You selected Story Book.");
                
                break;
            case 2:
                System.out.println("You selected History Book." + title);
                
                break;
            case 3:
                System.out.println("You selected Text Book." + author);
                
                break;
            default:
                System.out.println("Invalid selection." + stock);
                break;
        }

        scanner.close();
    }
}
