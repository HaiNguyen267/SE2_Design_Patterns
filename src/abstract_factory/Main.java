package abstract_factory;

public class Main {
    public static void main(String[] args) {

        // Factory: TechFactory
        // SamsungFactory, XiaomiFactory, AppleFactory

        SamsungFactory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.createPhone();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Phone xiaomiPhone = xiaomiFactory.createPhone();
        Laptop xiaomiLaptop = xiaomiFactory.createLaptop();

        AppleFactory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.createPhone();
        Laptop imac = appleFactory.createLaptop();
    }
}
