import java.util.Scanner;

class Outfit extends Color {
    public void clothes(String gender) {
        Scanner cloth = new Scanner(System.in);
        String male_gender = "male";
        String female_gender = "female";
        String color = " ";

        String[] maleclothing = {"Shirt", "Suits/Tuxedo", "Long Sleeve"};
        String[] faleclothing = {"Shirt", "Dress"};

        if (gender.equals(male_gender)) {
            System.out.println("Choose the upper outfit");
            System.out.println("1. Shirt \n2. Suits/Tuxedo \n3. Long Sleeve");
            System.out.println("Outfit: ");
            int outfit = cloth.nextInt();

            switch (outfit) {
                case 1:
                    System.out.println("Outfit: Shirt");
                    break;
                case 2:
                    System.out.println("Outfit: Suits/Tuxedo");
                    break;
                case 3:
                    System.out.println("Long Sleeves");
                    break;
                default:
                    System.out.println("Invalid Input. Try Again.");
                    break;
            }

            System.out.print("\nWhat color?");
            color = cloth.nextLine();
            int c = outfit - 1;

            System.out.println("\nOutfit:" + "\nCloth: " + maleclothing.length(c) + "\nColor: " + color);

        } else if (gender.equals(female_gender)) {
            System.out.println("Choose the upper outfit");
            System.out.println("Shirt or Dress");
            System.out.println("Outfit: ");
            String outfit = cloth.nextLine();
            System.out.println("Color: ");
            color = cloth.nextLine();

            System.out.println("\nOutfit:" + "\nCloth: " + outfit + "\nColor: " + color);
            } else {
            System.out.println("Invalid!");
        }
    }
}
