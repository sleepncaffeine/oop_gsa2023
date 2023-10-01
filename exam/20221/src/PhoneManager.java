/*
4. 다음은 인원수, 이름과 전화번호를 입력하여 저장한 후, 이름으로 검색하면 전호ㅘ번호를 출력해주는 프로그램이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [18점]
*/

// [실행 결과]
// 인원수>>3
// 이름과 전화번호(번호는 연속적으로 입력)>>aaa 111-1111
// 이름과 전화번호(번호는 연속적으로 입력)>>bbb 222-2222
// 이름과 전화번호(번호는 연속적으로 입력)>>ccc 333-3333
// 저장 완료
// 검색할 이름>>aaa
// aaa의 전화번호는 111-1111입니다.
// 검색할 이름>>bb
// bb 이 없습니다.
// 검색할 이름>>exit
// 프로그램을 종료

/////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class PhoneManager {
    public Scanner sc;
    private Phone[] p;

    public PhoneManager() {
        sc = new Scanner(System.in);
    }

    private void read() {
        System.out.print("인원수>>");
        int n = sc.nextInt();
        p = new Phone[n];
        for (int i = 0; i < p.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = sc.next();
            // ① [2점] ;
            String tel = sc.next();
            // ② [2점] ;
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장 완료");
    }

    private String search(String name) {
        // ③ [2점] {
        for (int i = 0; i < p.length; i++) {
            // ④ [2점]
            if (p[i].getName().equals(name))
                // ⑤ [2점] ;
                return p[i].getTel();
        }
        return null;
    }

    public void run() {
        // ⑥ [2점] ;
        read();
        while (true) {
            System.out.print("검색할 이름>>");
            String name = sc.next();
            // ⑦ [2점]
            if (name.equals("exit"))
                break;
            // ⑧ [2점] ;
            String tel = search(name);
            // ⑨ [2점]
            if (tel == null)
                System.out.println(name + " 이 없습니다.");
            else
                System.out.println(name + "의 전화번호는 " + tel + "입니다.");
        }
        System.out.println("프로그램을 종료");
    }

    public static void main(String[] args) {
        new PhoneManager().run();
    }
}
