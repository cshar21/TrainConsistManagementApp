import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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

        // UC4
        System.out.println("\n--- UC4: Ordered Train Consist (LinkedList) ---");

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After adding Pantry at position 2:");
        System.out.println(train);

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        System.out.println("After removing first and last bogie:");
        System.out.println(train);

        System.out.println("Final Train Consist:");
        System.out.println(train);
        System.out.println("Program continues...");    }
}