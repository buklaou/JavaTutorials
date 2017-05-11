package Section12.Collections.Section01.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Raffi
 */
public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat is taken.");
        }

        if (theatre.reserveSeat("B12")) {
            System.out.println("Pay for A02");
        } else {
            System.out.println("Seat already reserved.");
        }

        List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("-------------------------");
    }

}
