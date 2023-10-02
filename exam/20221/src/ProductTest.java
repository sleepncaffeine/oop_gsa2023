/*
16. 다음은 Product 클래스와 이를 상속받는 Audio, Computer 클래스, 제품을 구입하는 Buyer 클래스에 대해 작성한 프로그램이다.
실행 결과를 보고 빈 칸에 들어갈 내용을 완성하시오. [12점]
*/

// [결과]
// Audio을/를 구입하셨습니다.
// Computer을/를 구입하셨습니다.
// 현재 남은 동는 6500만원입니다.
// 현재 보너스 점수는 350점입니다.

/////////////////////////////////////////////////////////////////////////////////////////

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Audio extends Product {
    Audio() {
        super(1500);
    }

    public String toString() {
        return "Audio";
    }
}

class Computer extends Product {
    Computer() {
        super(2000);
    }

    public String toString() {
        return "Computer";
    }
}

// 가진 돈에서 구입 제품의 가격을 차감하고 보너스 점수는 추가함.
class Buyer {
    int money = 10000;
    int bonusPoint = 0;

    // ① [2점] {
    void buy(Product p) {
        // ② [2점] {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        // ③ [2점] ;
        money -= p.price;
        // ④ [2점] ;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        // ⑤ [2점] ;
        b.buy(new Audio());
        // ⑥ [2점] ;
        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}
