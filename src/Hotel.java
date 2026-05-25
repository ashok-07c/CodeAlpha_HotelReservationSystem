import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101, "Standard", 2000));
        rooms.add(new Room(102, "Standard", 2000));

        rooms.add(new Room(201, "Deluxe", 4000));
        rooms.add(new Room(202, "Deluxe", 4000));

        rooms.add(new Room(301, "Suite", 7000));
    }

    public void displayRooms() {

        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms) {

            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }

    public void bookRoom(String customerName, int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {

                boolean paymentDone = Payment.makePayment(room.getPrice());

                if (paymentDone) {

                    room.bookRoom();

                    Reservation reservation = new Reservation(customerName, room);

                    reservations.add(reservation);

                    FileManager.saveBooking(reservation);

                    System.out.println("Room booked successfully!");
                }

                return;
            }
        }

        System.out.println("Room not available.");
    }

    public void cancelReservation(int roomNumber) {

        for (Reservation reservation : reservations) {

            if (reservation.getRoom().getRoomNumber() == roomNumber) {

                reservation.getRoom().cancelRoom();

                reservations.remove(reservation);

                System.out.println("Reservation cancelled.");

                return;
            }
        }

        System.out.println("Reservation not found.");
    }

    public void viewReservations() {

        if (reservations.isEmpty()) {

            System.out.println("No reservations found.");
            return;
        }

        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}