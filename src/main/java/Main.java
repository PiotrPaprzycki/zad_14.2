import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Vehicle> vehicles = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        int option = 0;
        while (repeat) {
            System.out.println("Choose option(0 - quit 1 - add vehicle 2 - check vehicle");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Bye!");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Adding vehicle");
                    System.out.println("Type?");
                    String type = scanner.next();
                    System.out.println("Brand?");
                    String brand = scanner.next();
                    System.out.println("Model?");
                    String model = scanner.next();
                    System.out.println("Age?");
                    int age = Integer.parseInt(scanner.next());
                    System.out.println("Milage?");
                    int milage = Integer.parseInt(scanner.next());
                    System.out.println("VIN?");
                    String vin = scanner.next();
                    vehicles.offer(new Vehicle(type, brand, model, age, milage, vin));
                    System.out.println(vehicles);
                    break;
                case 2:
                    System.out.println("Checking vehicle");
                    vehicles.poll();
                    System.out.println(vehicles);
                    break;
                default:
                    System.out.println("Choose option(0 - quit 1 - add vehicle 2 - check vehicle");
            }

        }
    }
}

