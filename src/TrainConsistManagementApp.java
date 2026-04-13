import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TrainConsistManagementApp{

    public static void main(String[] args) {

        // UC1
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("\n--- UC2: Passenger Bogie Operations ---");

        // UC2: Create passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("Passenger Bogies after adding:");
        System.out.println(passengerBogies);

        // REMOVE a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Does Sleeper exist? " + exists);

        // Final state
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("Program continues...");

        // UC3
        System.out.println("\n--- UC3: Unique Bogie ID Tracking (HashSet) ---");

        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Bogie IDs after insertion (duplicates removed automatically):");
        System.out.println(bogieIds);

        System.out.println("Total unique bogies: " + bogieIds.size());
    }
}