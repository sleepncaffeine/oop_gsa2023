class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class UpDowncastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");
        p = s; // 업캐스팅

        System.out.println(p.name);

        // System.out.println(p.grade); // 컴파일 에러
        // System.out.println(p.department); // 컴파일 에러

        Person d = new Student("홍길동"); // 업캐스팅
        Student a;

        a = (Student) d; // 다운캐스팅
        System.out.println(a.name);
        a.grade = "A";
    }
}
