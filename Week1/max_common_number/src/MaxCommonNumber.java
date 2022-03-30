import java.util.Scanner;

public class MaxCommonNumber {
    public static void main(String[] args) {
        int number1, number2, temp = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so thu nhat:");
        number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhap vao so thu hai:");
        number2 = Integer.parseInt(scanner.nextLine());

        if (number1 == 0 || number2 == 0) {
            System.out.println("Khong ton tai uoc chung lon nhat cua 2 so " + number1 + " va " + number2);
        } else {
            for (int i = 1; i < number1 && i < number2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    temp = i;
                }
            }
            System.out.println("Uoc chung lon nhat cua " + number1 + " va " + number2 + " la: " + temp);
        }

    }
}
