import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int number;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra:");
        number = Integer.parseInt(scanner.nextLine());

      if(number < 2) {
          System.out.println(number + " khong phai la so nguyen to");
      } else {
          for(int i = 2; i<Math.sqrt(number); i++) {
              if(number % i == 0) {
                  flag = false;
                  break;
              }
          }
          if(flag == true) {
              System.out.println(number + " la so nguyen to!");
          } else {
              System.out.println(number + " khong la so nguyen to!");
          }
      }


    }
}
