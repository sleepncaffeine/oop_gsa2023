/*
5. 다음은 문자를 출력하는 프로그램이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [서술형 10점]
*/

// [실행 결과]
// &&&&&&&&&&
// ###############
// ###############
// ###############
// ###############

/////////////////////////////////////////////////////////////////////////////////////////

public class PrintChar {
    private int w, h;
    private char ch;

    public PrintChar() {
        // ① [2점] ;
        this.w = 10;
        this.h = 1;
    }

    public PrintChar(int w, int h) {
        // ② [2점] ;
        this.w = w;
        // ③ [2점] ;
        this.h = h;
    }

    public void draw() {
        // ④ [2점] {
        for (int i = 0; i < h; i++) {
            // ⑤ [2점] {
            for (int j = 0; j < w; j++) {
                // ⑥ [2점] ;
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public void fill(char ch) {
        // ⑦ [2점] ;
        this.ch = ch;
    }

    public static void main(String[] args) {
        PrintChar a = new PrintChar();
        PrintChar b = new PrintChar(15, 4);
        a.fill('&');
        b.fill('#');
        a.draw();
        b.draw();
    }
}
