package builder;

public class Main {
    public static void main(String[] args) {


        // without builder pattern, we have to pass in all the arguments
        Person quan = new Person(0, "Quan", "Do", "quando@gmail.com", null, 20);

        // with builder pattern,
        // we can pass in only the arguments we want, and in any order
        Person lam = new PersonBuilder()
                .age(20)
                .lastName("Tran")
                .firstName("Lam")
                .build();
    }
}
