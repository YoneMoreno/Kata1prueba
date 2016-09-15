package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person1 = new Person("Jorge", new Date(96,11,14));
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años.");
    }
}
