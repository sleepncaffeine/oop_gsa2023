import java.util.Scanner;

public class p110_4 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int mid = 0;
        if (a > b) {
            if (b > c) {
                mid = b;
            } else if (a > c) {
                mid = c;
            } else {
                mid = a;
            }
        } else {
            if (a > c) {
                mid = a;
            } else if (b > c) {
                mid = c;
            } else {
                mid = b;
            }
        }

        System.out.println("중간값은 " + mid);

        s.close();
    }
}
