import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int choice;

        do {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");

            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View Reservations");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    hotel.displayRooms();
                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter room number: ");
                    int roomNo = sc.nextInt();

                    hotel.bookRoom(name, roomNo);

                    break;

                case 3:

                    System.out.print("Enter room number to cancel: ");
                    int cancelRoom = sc.nextInt();

                    hotel.cancelReservation(cancelRoom);

                    break;

                case 4:

                    hotel.viewReservations();
                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
        sc.close();
    }
}