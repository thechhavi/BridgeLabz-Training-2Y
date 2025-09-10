package java_class;

class MovieTicket {
    // attributes
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movie, int seat, double ticketPrice) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
      
        MovieTicket ticket1 = new MovieTicket();
        ticket1.bookTicket("Avengers: Endgame", 12, 350.0);
        ticket1.displayTicketDetails();

        System.out.println();

        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket("KGF Chapter 2", 45, 400.0);
        ticket2.displayTicketDetails();
    }
}
