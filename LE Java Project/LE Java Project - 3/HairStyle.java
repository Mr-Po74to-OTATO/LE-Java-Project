import java.util.Scanner;

class Hair extends Color {
    public static void HairStyle(String gender) {
        Scanner hair = new Scanner(System.in);
        //boolean valid = false;
        String malegender = "male";
        String femalegender = "female";
        int Style, color;

        if (gender.equals(femalegender)) {
                System.out.println("Pick your HairStyle.");
                System.out.println("1. Wavy \n2. Straight \n3. Ponytail \n4. Pig Tail \n5. Curly");
                System.out.println("Style: ");
                Style = hair.nextInt();
                switch (Style) {
                    case 1:
                        System.out.println("Hair: Wavy");
                        break;
                    case 2:
                        System.out.println("Hair: Straight");
                        break;
                    case 3:
                        System.out.println("Hair: Ponytail");
                        break;
                    case 4:
                        System.out.println("Hair: Pig Tail");
                        break;
                    case 5:
                        System.out.println("Hair: Curly Hair");
                        break;
                    default:
                        System.out.println("Invalid Input. Try Again.");
                        break;
                }

                System.out.println("Pick your Hair Color.");
                System.out.println("1. Sporty Red \n2. Mint Green \n3. Blue \n4. Sun Yellow \n5. Ash");
                System.out.println("Color: ");
                color = hair.nextInt();
                switch (color) {
                    case 1:
                        System.out.println("Red");
                        break;
                    case 2:
                        System.out.println("Mint Green");
                        break;
                    case 3:
                        System.out.println("Blue");
                        break;
                    case 4:
                        System.out.println("Sun Yellow");
                        break;
                    case 5:
                        System.out.println("Ash");
                    default:
                        System.out.println("Invalid Input. Try Again.");
                        break;
                }
        } else if (gender.equals(malegender)){
                System.out.println("Pick your HairStyle.");
                System.out.println("1. Slick Back \n2. Standard \n3. Bald \n4. Mohawk \n5. Messy");
                System.out.println("Style: ");
                Style = hair.nextInt();
                switch (Style) {
                    case 1:
                        System.out.println("Hair: Slick Back");
                        break;
                    case 2:
                        System.out.println("Hair: Standard");
                        break;
                    case 3:
                        System.out.println("Hair: Bald");
                        break;
                    case 4:
                        System.out.println("Hair: Mohawk");
                        break;
                    case 5:
                        System.out.println("Hair: Messy");
                        break;
                    default:
                        System.out.println("Invalid Input. Try Again.");
                        break;
                }

                System.out.println("Pick your Hair Color.");
                System.out.println("1. Sporty Red \n2. Mint Green \n3. Blue \n4. Sun Yellow \n5. Ash");
                System.out.println("Color: ");
                color = hair.nextInt();
                switch (color) {
                    case 1:
                        System.out.println("Sporty Red");
                        break;
                    case 2:
                        System.out.println("Mint Green");
                        break;
                    case 3:
                        System.out.println("Blue");
                        break;
                    case 4:
                        System.out.println("Sun Yellow");
                        break;
                    case 5:
                        System.out.println("Ash");
                        break;
                    default:
                        System.out.println("Invalid Input. Try Again.");
                        break;
                }
        } else {
            System.out.println("Invalid!");
        }
    }
}