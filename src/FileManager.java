import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveBooking(Reservation reservation) {

        try {
            FileWriter writer = new FileWriter("bookings.txt", true);

            writer.write(reservation.toString() + "\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving booking.");
        }
    }
}