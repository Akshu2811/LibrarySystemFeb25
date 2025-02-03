public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    //A default constructor that initializes isAvailable to true
    Book(){
        this.isAvailable = true;
    }

    //A parameterized constructor to initialize isbn, title, and author
    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    //A copy constructor to create a new Book object from an existing one.
    Book(Book other){
        this.isAvailable = other.isAvailable;
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // If the book is available and the user can borrow, mark the
    //book as unavailable and return true.
    @Override
    public boolean lend(User user) {
        if(isAvailable() && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }


    //Mark the book as available
    @Override
    public void returnBook(User user) {
        isAvailable = true;
        user.returnBooks();
    }


    //Return the availability status
    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    //As each book details differ implementing abstract method to execute it in inherited class
    public abstract void displayBookDetails();

    // This class is abstract as it is much generalized view of book as there can be different types of book

}
