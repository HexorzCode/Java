class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private int loanDuration;
    private int stock;

    public Book(String id, String title, String author, String category, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCategory() {
        return this.category;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int id) {
        this.stock = id;
    }

    public int getLoanDuration() {
        return this.loanDuration;
    }

    public void setLoanDuration(int id) {
        this.loanDuration = id;
    }

    
}
