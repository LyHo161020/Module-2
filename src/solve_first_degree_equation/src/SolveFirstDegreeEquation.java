
import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Giai phuong trinh bac 1!");
        System.out.println("Nhap cac he so tuong ung trong pt: a * x + b = c ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a:");
        a = scanner.nextDouble();

        System.out.println("nhap b:");
        b = scanner.nextDouble();

        System.out.println("nhap c:");
        c = scanner.nextDouble();

        if(a == 0) {
            if(b == c) {
                System.out.println("Phuong trinh co vo so nghiem!");
            }else {
                System.out.println("Phuong trinh vo ngiem!");
            }
        } else {
            double result = (c - b) / a;
            System.out.printf("Phuong trinh co nghiem: x=%f!",result);
        }
    }
}
