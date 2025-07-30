package MultiThread;
class BookingSystem {
    int totalSeats = 1;

    synchronized void bookTicket(String user) {
        if (totalSeats > 0) {
            System.out.println(user + " booked the seat ");
            totalSeats--;
        } else {
            System.out.println(user + " failed to book.  Seat not available.");
        }
    }
}

class BookingThread extends Thread {
    BookingSystem booking;
    String user;

    BookingThread(BookingSystem booking, String user) {
        this.booking = booking;
        this.user = user;
    }

    public void run() {
        booking.bookTicket(user);
    }
}

public class RailwayBooking {
    public static void main(String[] args) {
        BookingSystem bs = new BookingSystem();

        BookingThread user1 = new BookingThread(bs, "Yuvraj");
        BookingThread user2 = new BookingThread(bs, "Ravi");

        user1.start();
        user2.start();
    }
}
