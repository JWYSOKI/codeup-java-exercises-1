package oop;

public class OopLecture {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.firstName = "Chris";
        p1.lastName = "Allen";
        p1.age = 29;
        System.out.println(p1.sayHello());
        System.out.println(p1.age);

    }
}
