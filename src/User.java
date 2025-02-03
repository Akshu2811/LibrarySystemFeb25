

public abstract class User {
    private String UserID;
    private String name;
    private String contactInfo;

    public static int usersCount = 0;

    User(){
        this.UserID=generateUniqueID();
    }
    User(String name, String contactInfo){
        this.name=name;
        this.contactInfo=contactInfo;
        this.UserID=generateUniqueID();

    }
    User(User other){
        this.UserID=generateUniqueID();
        this.name=other.name;
        this.contactInfo=other.contactInfo;

    }

    public String getUserID() {
        return UserID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public static int getUsersCount() {
        return usersCount;
    }

    //final method that cannot be overridden
    public final String generateUniqueID(){
        usersCount++;
        return "USER-"+usersCount;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBooks();

}
