package builder;

public class PersonBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;

    public PersonBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(id, firstName, lastName, email, phone, age);
    }
}
