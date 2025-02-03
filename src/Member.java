public class Member extends User {
    private int borrowedBookCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
    }
    public Member(String name,String contactInfo){
        super(name,contactInfo);
        this.borrowedBookCount = 0;
    }

    @Override
    public void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Name: "+getName());
        System.out.println("Borrowed books: " + borrowedBookCount);
    }
    @Override
    public boolean canBorrowBooks(){
        return borrowedBookCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBooks() {
        borrowedBookCount--;
    }
}
