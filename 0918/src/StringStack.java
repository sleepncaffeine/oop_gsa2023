import java.util.Scanner;

public class StringStack implements Stack {
    private int top;
    private int size;
    private String[] stack;

    public StringStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new String[size];
    }

    @Override
    public int length() {
        return this.top + 1;
    }

    @Override
    public int capacity() {
        return this.size;
    }

    @Override
    public String pop() {
        if (this.top == -1) {
            return null;
        }
        return this.stack[this.top--];
    }

    @Override
    public boolean push(String val) {
        if (this.top == this.size - 1) {
            return false;
        }
        this.stack[++this.top] = val;
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = scanner.nextInt();
        StringStack stringStack = new StringStack(size);

        while (true) {
            System.out.print("문자열 입력 >> ");
            String input = scanner.next();

            if (input.equals("그만")) {
                break;
            }

            if (!stringStack.push(input)) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int len = stringStack.length();
        for (int i = 0; i < len; i++) {
            System.out.print(stringStack.pop() + " ");
        }

        scanner.close();
    }
}
