/*
10. 다음 프로그램의 실행 결과를 적으시오. [단답형 6점]
*/

// false
// false
// false
// false
// true
// false

/////////////////////////////////////////////////////////////////////////////////////////

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("JAVA");
        String str2 = new String("Java");
        String str3 = new String("JAVA");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
