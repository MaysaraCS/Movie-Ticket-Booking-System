/* OOP - SECTION 08 - GROUP 12
* MAYSARA MOHAMED SHOKRY - A21EC4002
* TIFFA RAHMA DEARNA JULIAS - A21EC4060
* HANEEN MO'MEN MOHAMED - A21EC0260*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner menu1 = new Scanner(System.in);
        Scanner menu2 = new Scanner(System.in);
        ArrayList<User> uList = new ArrayList<User>();

        Movie m1 = new Movie("Spider-man", "Animation", 2.15, 6);
        Movie m2 = new Movie("Batman", "Action", 1.40, 9);


        int choose;
        do {
            System.out.println("\n\n********** MOVIE BOOKING SYSTEM *********");

            System.out.println("||    ||  ||||  \\\\    //  ======  ======");
            System.out.println("||\\\\//|| ||  ||  \\\\  //     ||    ||====");
            System.out.println("||    || ||  ||   \\\\//      ||    ||====");
            System.out.println("||    ||  ||||     \\/     ======  ======");
            System.out.println("\n");
            System.out.println("======  ======  ||    ||  ======  |");
            System.out.println("  ||      ||    ||\\\\//||  ||====  |");
            System.out.println("  ||      ||    ||    ||  ||====  |");
            System.out.println("  ||    ======  ||    ||  ======  o");

            System.out.println("********** Welcome! :-D *****************");
            System.out.println("\n");

            System.out.println("1. Book Ticket");
            System.out.println("2. Display Available Tickets");
            System.out.println("3. Display Movie Info");
            System.out.println("4. View Receipt");
            System.out.println("5. Exit\n");

            System.out.print("Please enter your choice (1-5): ");
            choose = menu1.nextInt();

            switch (choose) {
                case 1: // Menu 1 - Book Ticket
                    User u1;
                    Scanner menu = new Scanner(System.in);
                    String d;
                    String n, cid;
                    int p;
                    int c;

                    System.out.print("\nEnter User ID: ");
                    d = menu.next();

                    System.out.print("Enter your name: ");
                    n = menu.next();

                    System.out.print("Enter telephone No.: ");
                    p = menu.nextInt();

                    System.out.print("Enter your category(Student - 1 / Adult - 2): "); // Shares inheritance
                                                                                       // with class Ticket
                    c = menu.nextInt(); // choose between Student or Adult

                    if (c == 2) {
                        cid = "Adult";
                    } else {
                        cid = "Student";
                    }

                    u1 = new User(d, n, p, cid);
                    int choice;
                    int seat1 = m1.getAvailableSeat();
                    int seat2 = m2.getAvailableSeat();

                    do {
                        System.out.println("\nMovies in display:- ");
                        System.out.println("1. Spider-man - RM20.00 (Available seats " + seat1 + ")");
                        System.out.println("2. Batman - RM15.00 (Available seats " + seat2 + ")");
                        System.out.print("Your choice: ");
                        choice = menu2.nextInt();
                    } while ((choice == 1 && seat1 == 0) || (choice == 2 && seat2 == 0));
                    boolean status = true;

                    switch (choice) {

                        case 1: // Still in Menu 1, choose between movies

                            double insurance_Rate = 0.05, disRate = 0.4;
                            double price = 0.0;
                            String MovieName = "Spider-man";

                            if (cid == "Adult") {
                                String cate = "Adult";
                                Adult a1 = new Adult(disRate, 20.0, u1.getName(), m1.getSeatNum(),
                                        "Adult", u1.getPhoneNum(), u1.getID());

                                System.out.println("\nYour original ticket price is: RM" + a1.getPrice());
                                System.out.println("Your total ticket price is: RM" + a1.calcTotalPrice());
                                m1.assign(a1);
                                for (int i = 0; i < uList.size(); i++) {

                                    if (d.equals(uList.get(i).getID())) {

                                        u1.book(a1);
                                        status = false;
                                        break;
                                    }
                                }

                                if (uList.size() == 0 || status) {

                                    u1.book(a1);
                                    uList.add(u1);
                                }

                            } else {
                                String cate = "Student";
                                Student a1 = new Student(insurance_Rate, 20.0, u1.getName(), m1.getSeatNum(),
                                        "Student", u1.getPhoneNum(), u1.getID());

                                System.out.println("\nYour original ticket price is: RM" + a1.getPrice());
                                System.out.println("Your total ticket price is: RM" + a1.calcTotalPrice());
                                m1.assign(a1);
                                for (int i = 0; i < uList.size(); i++) {

                                    if (d.equals(uList.get(i).getID())) {

                                        u1.book(a1);
                                        status = false;
                                        break;
                                    }
                                }

                                if (uList.size() == 0 || status) {

                                    u1.book(a1);
                                    uList.add(u1);

                                }
                            }
                            break;
                        case 2:

                            double insurance_Rate2 = 0.08, disRate2 = 0.3;
                            double price2 = 0.0;
                            String MovieName2 = "Batman";

                            if (cid == "Adult") {
                                String cate = "Adult";
                                Adult n1 = new Adult(disRate2, 15.0, u1.getName(), m2.getSeatNum(),
                                        "Adult", u1.getPhoneNum(), u1.getID());

                                System.out.println("\nYour original ticket price is: RM" + n1.getPrice());
                                System.out.println("Your total ticket price is: RM" + n1.calcTotalPrice());
                                m2.assign(n1);
                                for (int i = 0; i < uList.size(); i++) {

                                    if (d.equals(uList.get(i).getID())) {

                                        u1.book(n1);
                                        status = false;
                                        break;
                                    }
                                }

                                if (uList.size() == 0 || status) {

                                    u1.book(n1);
                                    uList.add(u1);
                                }
                            } else {
                                String cate = "Student";
                                Student n1 = new Student(insurance_Rate2, 15.0, u1.getName(), m2.getSeatNum(),
                                        "Student", u1.getPhoneNum(), u1.getID());

                                System.out.println("\nYour original ticket price is: RM" + n1.getPrice());
                                System.out.println("Your total ticket price is: RM" + n1.calcTotalPrice());
                                m2.assign(n1);
                                for (int i = 0; i < uList.size(); i++) {

                                    if (d.equals(uList.get(i).getID())) {

                                        uList.get(i).book(n1);
                                        status = false;
                                        break;
                                    }
                                }

                                if (uList.size() == 0 || status) {

                                    u1.book(n1);
                                    uList.add(u1);
                                }
                            }
                            break;
                    }
                    break;

                case 2: // Menu 2 - Display Available Tickets

                    System.out.println("\nAvailable tickets for: ");
                    System.out.println("\nSpider-man: " + m1.getAvailableSeat() + " tickets still available!");
                    System.out.println("\nBatman: " + m2.getAvailableSeat() + " tickets still available!");
                    break;

                case 3: // Menu 3 - Display Movie Info

                    m1.DisplayMovieInfo();
                    m1.displayUserListInfo();
                    System.out.println("\n");
                    m2.DisplayMovieInfo();
                    m2.displayUserListInfo();
                    break;

                case 4: // Menu 4 - View Receipt
                    if (uList.size() == 0) {
                        System.out.println("Sorry, no tickets been bought yet :(");
                    } else {
                        for (int i = 0; i < uList.size(); i++) {

                            System.out.println("\nID: " + uList.get(i).getID());
                            System.out.println("Name: " + uList.get(i).getName());
                            System.out.println("Phone number: " + uList.get(i).getPhoneNum());
                            System.out.println("Category: " + uList.get(i).getCategoryId());

                            uList.get(i).displayInfoTicket();
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nThank you for using our system!");
                    System.out.println("Enjoy your movie!!! :-D");
                    break;
            }
			System.out.println("\nLoading...");
			try {
				Thread.sleep(2500);
			} catch (Exception e) {
			}
        }while(choose!=5);
}
}