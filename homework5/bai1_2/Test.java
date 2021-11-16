package bai1_2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("quang", "bg", "hhhhhhh", 2001, 8.0);
        System.out.println(student);

        Staff staff = new Staff("quan", "bg", "yd1", 1821.0);
        System.out.println(staff);

        Person person = new Student("trung", "ss", " sa", 123, 0.1);
        System.out.println(person);

        Person person1 = new Staff("quang", "bg", "yd1", 120.0);
        System.out.println(person1);
    }
}
