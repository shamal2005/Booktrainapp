import java.util.ArrayList;

public class booktrain {

    public static void main(String[] args) {

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Passenger Bogies after removal:");
        System.out.println(passengerBogies);

        System.out.println("Does Sleeper bogie exist? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}