import java.util.Locale;
import java.util.Scanner;

public class FindElementInArr {
    public static void main(String[] args) {
        String[] students ={"ly","thao","han","ngan","thi","triet","tung","hang"};
        String name;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten hoc sinh muon kiem:");
        name = scanner.nextLine();

        for(int i = 0; i < students.length; i++) {
            if(students[i].equals(name.toLowerCase())) {
                System.out.println("Vi tri cua hoc sinh " + name + " o trong danh sach la: " + i);
                flag = true;
            }
        }

        if(!flag) {
            System.out.println("Khong tim thay hoc sinh " + name + " o trong danh sach");
        }
    }
}
