import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0 ) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the rectangle");
            System.out.println("3. Draw the square");
            System.out.println("0. Exit");
            System.out.printf("Enter the choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.printf("%s%n%s%n%s%n%s%n%s\n","*****","****","***","**","*");
                    break;
                case 2:
                    System.out.printf("%s%n%s%n%s%n%s\n","* * * * * * * *","* * * * * * * *","* * * * * * * *","* * * * * * * *");
                    break;
                case 3:
                    System.out.printf("%s%n%s%n%s%n%s\n","*  *  *  *","*  *  *  *","*  *  *  *","*  *  *  *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }

    }
}
