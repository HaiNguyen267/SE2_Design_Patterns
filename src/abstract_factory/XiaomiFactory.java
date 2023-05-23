package abstract_factory;

public class XiaomiFactory implements TechFactory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new XiaomiLaptop();
    }
}
