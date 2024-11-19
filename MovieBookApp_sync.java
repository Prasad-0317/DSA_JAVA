class BookTheaterSeat{
    int total_seats = 10;
    synchronized void bookSeat(int seats){
        if(total_seats >= seats){
            System.out.println(seats + " seats booked successfully..");
            total_seats = total_seats - seats;
            System.out.println("Seats left : " + total_seats);
        }
        else{
            System.out.println("Sorry seats are fulled..");
            System.out.println("Seats left : " + total_seats);
        }
    }
}
public class MovieBookApp_sync extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookTheaterSeat();
        MovieBookApp_sync pc = new MovieBookApp_sync();
        pc.seats = 7;
        pc.start();

        MovieBookApp_sync ac = new MovieBookApp_sync();
        ac.seats = 6;
        ac.start();

    }
}
