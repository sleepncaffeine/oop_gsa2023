import java.util.Scanner;
import java.util.Random;

public class p159_open {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int ans = random.nextInt(100);
            int low = 0;
            int high = 99;
            int count = 1;
            int guess = -1;

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println(low + "-" + high);

            while (guess != ans) {
                System.out.print(count++ + ">>");
                guess = scanner.nextInt();
                if (guess < ans) {
                    System.out.println("더 높게");
                    low = guess;
                } else if (guess > ans) {
                    System.out.println("더 낮게");
                    high = guess;
                } else {
                    System.out.println("맞았습니다.");
                    break;
                }
                System.out.println(low + "-" + high);
            }

            System.out.print("다시 하시겠습니까(y/n)>>");
            String again = scanner.next();
            if (again.equals("n")) {
                break;
            }
        }
        scanner.close();
    }
}