/*
2. 다음 프로그램의 출력결과를 적으시오. [단답형 6점]
*/

/////////////////////////////////////////////////////////////////////////////////////////

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Hello, ");
        String s2 = new String("Java!");

        System.out.println(s1.length());
        System.out.println(s1.charAt(2));

        System.out.println(s1.concat(s2));

        s1 = s1.concat(s2);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(3, 8));

        System.out.println(s1.trim().indexOf("o"));
    }
}

/////////////////////////////////////////////////////////////////////////////////////////

// 7
// l
// Hello, Java!
// HELLO, JAVA!
// lo, J
// 4