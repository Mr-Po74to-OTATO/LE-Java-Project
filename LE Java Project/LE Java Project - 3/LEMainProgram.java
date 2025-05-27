import java.util.Scanner;

@SuppressWarnings("ALL")
public class LEMainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gender = "";

        Interface.mainInterface();
        System.out.print("\nGender: ");
        gender = scan.nextLine();
        Hair.HairStyle(gender);

        Outfit trycloth = new Outfit();
        trycloth.clothes(gender);

    }
}