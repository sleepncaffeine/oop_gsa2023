import java.util.Scanner;

public class StringRotation {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            input = input.substring(1) + input.charAt(0);
            System.out.println(input);
        }

        scanner.close();
    }
}
