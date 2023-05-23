package builder;

public class Main {
    public static void main(String[] args) {

        Person quan = new Person(0, "Quan", "Do", "quando@gmail.com", null, 20);
        Person quanCopy = new Person(quan.getId(), quan.getFirstName(), quan.getLastName(), quan.getEmail(), quan.getPhone(), quan.getAge());



        Person lam = new PersonBuilder()
                .age(20)
                .lastName("Tran")
                .firstName("Lam")
                .build();
    }
}
