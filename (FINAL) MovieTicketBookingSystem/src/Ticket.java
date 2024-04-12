interface Tax {
    double Tax_Rate = 0.10;
    double calculateTicketPrice();
}

abstract class Ticket {
    public double Price;
    public String Name;
    public int SeatNum;
    String Category;
    public int PhoneNum;
    private String ticketID;

    public Ticket() {}
    public Ticket(double Price, String Name, int SeatNum,
                  String Category, int PhoneNum, String ticketID) {
        this.Price = Price;
        this.Name = Name;
        this.SeatNum = SeatNum;
        this.Category = Category;
        this.PhoneNum = PhoneNum;
        this.ticketID = ticketID;
    }
    public double getPrice() {
        return Price;
    }
    public abstract void displayMovieInfo();
}

class Adult extends Ticket implements Tax {
    private double totalPrice;
    private double discount;

    public Adult() {}
    public Adult(double discount, double price, String Name,
                 int SeatNum, String Category, int PhoneNum, String ticketID) {
        super(price, Name, SeatNum, Category, PhoneNum, ticketID);
        this.discount = discount;
    }
    public double calcTotalPrice() {
        double calc1, calc2;
        calc1 = super.Price * discount;
        calc2 = super.Price * Tax_Rate;
        totalPrice = super.Price - calc1 + calc2;
        return totalPrice;
    }
    public void displayAdultTicket() {
        System.out.println("\n" + super.Name + "\t" + super.PhoneNum + "\t" + super.Category + "\t\t"
                + super.SeatNum + "\t\t\t" + super.Price + "\t" + calcTotalPrice());
    }
    public void displayMovieInfo() {
        System.out.println("\n" + super.Name + "\t" + super.PhoneNum + "\t" + super.Category + "\t\t"
        + super.SeatNum + "\t\t\t" + super.Price + "\t" + calcTotalPrice());
    }

    @Override
    public double calculateTicketPrice() {
        return 0;
    }
}

class Student extends Ticket implements Tax {
    private double totalPrice;
    private double discount2;

    public Student() {}
    public Student(double discount_, double price_, String Name_,
                   int SeatNum_, String Category_, int PhoneNum_, String ticketID_) {
        super(price_, Name_, SeatNum_, Category_, PhoneNum_, ticketID_);
        this.discount2 = discount_;
    }
    public double calcTotalPrice() {
        double calc1, calc2;
        calc1 = super.Price * discount2;
        calc2 = super.Price * Tax_Rate;
        totalPrice = super.Price - calc1 + calc2;
        return totalPrice;
    }
    public void displayStudentTicket() {
        System.out.println("\n" + super.Name + "\t" + super.PhoneNum + "\t" + super.Category + "\t\t"
                + super.SeatNum + "\t\t\t" + super.Price + "\t" + calcTotalPrice());
    }
    public void displayMovieInfo() {
        System.out.println("\n" + super.Name + "\t" + super.PhoneNum + "\t" + super.Category + "\t\t"
                + super.SeatNum + "\t\t\t" + super.Price + "\t" + calcTotalPrice());
    }

    @Override
    public double calculateTicketPrice() {
        return 0;
    }
}