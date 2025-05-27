import java.util.Scanner;

public class Interface {
    public static void mainInterface() {
        Scanner type = new Scanner(System.in);
        System.out.print("Welcome!");
        System.out.print("\nCharacter Name: ");
        String name = type.nextLine();

        System.out.println("\nName: " + name);
    }
}
