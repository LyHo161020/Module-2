import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Nhap so phan tu cua mang(2-20)(nhap -1 de thoat):");
            number = Integer.parseInt(scanner.nextLine());

            if(1 < number && number < 21) {
                double[] arr = new double[number];
                double element;
                double temp = 0;
                for( int i = 0; i < number;i++) {
                    System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
                    element = Double.parseDouble(scanner.nextLine());
                    arr[i] = element;
                }
                System.out.println(Arrays.toString(arr));

                for (int i = 0; i < Math.floor(number/2); i++) {
                    temp = arr[i];
                    arr[i] = arr[arr.length -1 -i];
                    arr[arr.length -1 -i] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }while (number != -1);

    }
}
