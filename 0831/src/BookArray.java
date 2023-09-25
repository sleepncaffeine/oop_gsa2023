import java.util.Scanner;

class Books {
    String title, author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Books[] books = new Books[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            books[i] = new Books(title, author); // 배열 원소 객체 생성
        }

        for (int i = 0; i < books.length; i++)
            System.out.print("(" + books[i].title + ", " + books[i].author + ") ");

        scanner.close();
    }
}
