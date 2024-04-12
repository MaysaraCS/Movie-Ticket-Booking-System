public class Movie {
    private Ticket[] userList; // Association
    private int listNum;
    private String Title;
    private String Genre;
    private double duration;
    private double rating;

    public Movie(String title_, String genre_, double duration_, double rating_) {
        this.Title = title_;
        this.Genre = genre_;
        this.duration = duration_;
        this.rating = rating_;
        userList = new Ticket[50];
    }

    public void assign(Ticket tk) {
        userList[listNum] = tk;
        listNum++;
    }

    public int getAvailableSeat() {
        return (50 - listNum);
    }

    public int getSeatNum() {
        return listNum;
    }

    public void DisplayMovieInfo() {
        System.out.println("Movie Title: " + Title);
        System.out.println("Movie Genre: " + Genre);
        System.out.println("Movie Duration: " + duration);
        System.out.println("Movie Rating: " + rating + " / 10");
    }

    public void displayUserListInfo() { // Association
        System.out.println("\nName" + "\tPhone No." + "\tCategory" + "\tSeat No." + "\tPrice" + "\tTotal");
        for (int i = 0; i < listNum; i++) {
            Ticket t = (Ticket) userList[i];
            t.displayMovieInfo();
        }
    }
}