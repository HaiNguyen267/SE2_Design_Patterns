package prototype;

import builder.PersonBuilder;
import prototype.Person;

public class Main {
    public static void main(String[] args) {

        Person quan = new Person(0, "Quan", "Do", "quando@gmail.com", null, 20); // line 100

        // without prototype pattern
        Person quanCopy= new Person(quan.getId(), quan.getFirstName(), quan.getLastName(), quan.getEmail(),quan.getPhone(), quan.getAge()); // line 500
        Person quanCopy2 = new Person(quan.getId(), quan.getFirstName(), quan.getLastName(), quan.getEmail(),quan.getPhone(), quan.getAge());

        // with prototype pattern
        Person quanCopy3 = quan.clone();
        Person quanCopy4 = quan.clone();
        Person quanCopy5 = quan.clone();
    }
}
