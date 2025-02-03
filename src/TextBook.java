public class TextBook extends Book{
    private String subject;
    private int edition;

    //Add a parameterized constructor to initialize all attributes, including those
    //inherited from Book
    TextBook(String title, String author, int edition, String subject,String isbn) {
        super(isbn,title,author);
        this.edition = edition;
        this.subject = subject;
    }
    // Override displayBookDetails() to display the textbook's details
    @Override
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title:"+getTitle());
        System.out.println("Author:"+getAuthor());
        System.out.println("isbn:"+getIsbn());
    }

}
