public class NovelBook extends Book {
    private String genre;

    //Add a parameterized constructor to initialize all attributes, including those
    //inherited from Book.
    NovelBook(String title, String author, String genre,String isbn) {
        super(title, author, isbn);
        this.genre = genre;
    }

    //Override displayBookDetails() to display the novel's details.
    @Override
    public void displayBookDetails(){
        System.out.println("Novel Details");
        System.out.println("genre:"+genre);
        System.out.println("title: "+super.getTitle());
        System.out.println("author: "+super.getAuthor());
        System.out.println("isbn: "+super.getIsbn());
    }

}
