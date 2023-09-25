import java.util.Scanner;

public class p111_6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        String num = s.nextLine();

        if (num.contains("3") || num.contains("6") || num.contains("9")) {
            if (num.contains("3") && num.contains("6") || num.contains("3") && num.contains("9")
                    || num.contains("6") && num.contains("9")) {
                System.out.println("박수짝짝");
            } else {
                System.out.println("박수짝");
            }
        }

        s.close();
    }
}