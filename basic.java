public class basic{
    public static void main(String[] args) {
        System.out.println("jello");

        Person p1 = new Person();
        p1.name = "Juhi";
        p1.age = 21;

        System.out.println(p1.age + " " + p1.name);
    }
}

class Person{
    String name;
    int age;
}