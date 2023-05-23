package abstract_factory;

public class AppleFactory implements TechFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }

    @Override
    public Laptop createLaptop() {
        return new Imac();
    }
}
