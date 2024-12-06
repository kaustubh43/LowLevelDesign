package Labs2;

public class Member extends User{
    private int borrowedBooksCounts;
    private final int MAX_BORROWED_BOOKS = 5;

    public Member() {
        super();
        this.borrowedBooksCounts = 0;
    }

    public Member(String name, String contactInfo){
        super(name, contactInfo);
        this.borrowedBooksCounts = 0;
    }

    public Member(Member member){
        super(member);
        this.borrowedBooksCounts = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name" + this.getUserName());
        System.out.println(this.getUserName() + " has borrowed : " + this.borrowedBooksCounts);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCounts < MAX_BORROWED_BOOKS;
    }
}
