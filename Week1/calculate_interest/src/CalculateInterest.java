import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        int loanAmount, interest, loanMonth;
        double interestAmount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so tien cho vay: ");
        loanAmount = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap lai suat cho vay(% nam): ");
        interest = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap so thang cho vay: ");
        loanMonth = Integer.parseInt(scanner.nextLine());

        interestAmount = loanAmount * interest / 12 / 100 * loanMonth;

        System.out.println("So tien lai la: " + interestAmount);
    }
}
