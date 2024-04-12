public class User {
    private Ticket[] buy; //Association
    private String ID;
    private String Name;
    private int phoneNum;
    private int TicketNum;
    private String CategoryId;

    User(String ID, String n, int phone, String catid) { //Constructor
        this.ID = ID;
        Name = n;
        phoneNum = phone;
        CategoryId = catid;
        buy = new Ticket[10];
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void book(Ticket tk) { //Association
        buy[TicketNum] = tk;
        TicketNum++;
    }

    public void displayInfoTicket() {
        System.out.println("\nName" + "\tPhone No." + "\tCategory" + "\tSeat No."
                + "\tPrice" + "\tTotal Price");
        for (int i = 0; i < TicketNum; i++) {
            Ticket t = (Ticket) buy[i];
            t.displayMovieInfo();
        }
    }
}