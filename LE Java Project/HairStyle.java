class Hair extends class Color {
    public void HairStyle(int  Style, int color, int shade) {
        boolean valid = false;

        do {
            System.out.println("Pick your HairStle.");

            switch(Style) {
                case 1:
                    System.out.println("Hair: Wavy");
                    valid = true;
                    break;
                case 2:
                    System.out.println("Hair: Straight");
                    valid = true;
                    break;
                case 3:
                    System.out.println("Hair: Ponytail");
                    valid = true;
                    break;
                case 4:
                    System.out.println("Hair: Pig Tail");
                    valid = true;
                    break;
                case 5:
                    System.out.println("Hair: Curly Hair");
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid Input. Try Again.");
                    valid = false;
                    break;
            }
        } while (valid);
    }
}