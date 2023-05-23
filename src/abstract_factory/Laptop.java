package abstract_factory;

public class Laptop {
    private String name;
    private Double price;
}

class SamsungLaptop extends Laptop {}

class Imac extends Laptop {}

class XiaomiLaptop extends Laptop {}
