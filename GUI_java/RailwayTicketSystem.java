package GUI_java;

interface Bookable {
    void BookTicket(String passangerName, int seatsRequested);

}

abstract class TrainBooking implements Bookable {
    protected int availableSeats = 5;

    public void displaySeats() {
        System.out.println("available Seats : - " + availableSeats);

    }
}


class IRTCEBooking extends TrainBooking {
    public synchronized void BookTicket(String passangerName, int seatsRequested) {
        try {
            System.out.println(passangerName + "trying to book " + seatsRequested + "seats....");
            if (seatsRequested <= 0) {
                throw new IllegalArgumentException("invalid seat requestd: " + seatsRequested);

            }
            if (availableSeats >= seatsRequested) {
                Thread.sleep(1000);
                availableSeats -= seatsRequested;
                System.out.println(passangerName + "booked " + seatsRequested + "seats");
            } else {
                System.out.println("not booking this seats passanger : " + passangerName);
            }
        } catch (InterruptedException e) {
            System.out.println(" booking interupertd for " + passangerName);
        } catch (IllegalArgumentException ex) {
            System.out.println("not found" + ex.getMessage());
        }
    }

}


class user extends Thread {
    private Bookable bookingSystem;
    private String name;
    private int seats;

    public user(Bookable bookingSystem, String name, int seats) {
        this.bookingSystem = bookingSystem;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        bookingSystem.BookTicket(name, seats);
    }
}


public class RailwayTicketSystem {
    public static void main(String[] args) {
        IRTCEBooking bookingSystem = new IRTCEBooking();
       
        bookingSystem.displaySeats();
        user u1 = new user(bookingSystem, "yuvraj", 01);
        user u2 = new user(bookingSystem, "yuvraj kumar", 2);
        user u3 = new user(bookingSystem, "yuvraj singh ", 03);
        user u4 = new user(bookingSystem, "youvi", 4);

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        }
}
