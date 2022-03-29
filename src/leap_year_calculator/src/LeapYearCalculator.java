
import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra:");
        year = scanner.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Nam" + " " + year + " " + "la nam nhuan");
                } else {
                    System.out.println("Nam" + " " + year + " " + "khong phai la nam nhuan");
                }
            } else {
                System.out.println("Nam" + " " + year + " " + "la nam nhuan");
            }
        } else {
            System.out.println("Nam" + " " + year + " " + "khong phai la nam nhuan");
        }

    }
}

