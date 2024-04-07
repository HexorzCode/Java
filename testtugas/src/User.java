import java.util.ArrayList;
import java.util.Iterator;
@SuppressWarnings({ "unchecked", "rawtypes" })
class User {
    
    protected static ArrayList<Book> bookList = new ArrayList();

    User() {
    }

    public void displayBooks() {
        System.out.println("List of Books:");
        System.out.println("================================================================");
        System.out.println("|| No. || Id Buku || Nama Buku || Author || Category || Stock ||");
        int i = 1;

        for (Iterator booklist = bookList.iterator(); booklist.hasNext(); ++i) {
            Book book = (Book) booklist.next();
            System.out.println("|| " + i + "  || " + book.getId() + " || " + book.getTitle() + " || "
                    + book.getAuthor() + " || " + book.getCategory() + "  || " + book.getStock() + " ||");
        }

        System.out.println("================================================================");
    }
}