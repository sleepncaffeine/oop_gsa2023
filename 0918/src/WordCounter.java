import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print(">> ");
            String input = scanner.nextLine();
            if (input.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            String[] words = input.split(" ");
            System.out.println("어절 개수는 " + words.length);
        }
        scanner.close();
    }

}
