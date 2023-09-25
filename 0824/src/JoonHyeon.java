import java.util.Random;
import java.util.Scanner;

public class JoonHyeon {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100);
        int lower = 0, upper = 99;
        int ans;

        while (true) {
            System.out.println("수를 결정했습니다. 맞추어 보세요");
            lower = 0;
            upper = 99;
            num = r.nextInt(100);
            System.out.println(lower + "-" + upper);
            for (int i = 0;; i++) {
                System.out.print(i + 1 + ">>");
                ans = scaner.nextInt();
                if (num == ans)
                    break;
                else if (num > ans) {
                    System.out.println("더 높게");
                    lower = ans;
                    System.out.println(lower + "-" + upper);
                } else {
                    System.out.println("더 낮게");
                    upper = ans;
                    System.out.println(lower + "-" + upper);
                }
            }
            System.out.println("맞았습니다.");
            System.out.print("다시하시겠습니까?(y/n)>>");
            String y_n = scaner.next();
            System.out.println(y_n);
            if (y_n == "n")
                break;
        }
        scaner.close();
    }
}
