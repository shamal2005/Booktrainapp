import java.util.LinkedHashSet;

public class boktrain {

    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate - will be ignored

        // Step 4: Display final train formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}