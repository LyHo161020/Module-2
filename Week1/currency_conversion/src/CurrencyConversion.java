import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien muon doi(USD):");
        String input = scanner.nextLine();

        int VND = Integer.parseInt(input) * 23000;
        System.out.println("VND:" + VND);
    }
}
