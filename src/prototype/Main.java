package prototype;

import builder.PersonBuilder;
import prototype.Person;

public class Main {
    public static void main(String[] args) {

        // original object
        Person quan = new Person(0, "Quan", "Do", "quando@gmail.com", null, 20);

        // without prototype pattern
        // creating the copies is very tedious
        Person quanCopy= new Person(quan.getId(), quan.getFirstName(), quan.getLastName(), quan.getEmail(),quan.getPhone(), quan.getAge());
        Person quanCopy2 = new Person(quan.getId(), quan.getFirstName(), quan.getLastName(), quan.getEmail(),quan.getPhone(), quan.getAge());

        // with prototype pattern
        // creating the copies is much easier
        Person quanCopy3 = quan.clone();
        Person quanCopy4 = quan.clone();
        Person quanCopy5 = quan.clone();
    }
}
