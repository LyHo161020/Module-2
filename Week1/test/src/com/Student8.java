public class Student8 {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    Student8(int r, String n) {
        rollno = r;
        name = n;
    }

    public void show(){
        shkdsh();
        System.out.println("adssasd");
    }

    public static void shkdsh(){
//        show();
        System.out.println("hello");
    }

    static void display() {
        this.name = "Quynh Anh";
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Student8 s1 = new Student8(111, "Thông");
        Student8 s2 = new Student8(222, "Minh");

        s1.display();
        s2.display();
    }
}
