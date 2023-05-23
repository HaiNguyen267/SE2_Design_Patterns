package abstract_factory;

public class SamsungFactory implements TechFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
