package factory;

public class ComputerFactory {

    public static Computer createComputer(String brand) {
        if (brand.equals("hp")) {
            return new HPComputer();
        } else if (brand.equals("dell")) {
            return new DellComputer();
        } else if (brand.equals("asus")) {
            return new AsusComputer();
        } else if (brand.equals("apple")) {
            return new AppleComputer();
        }

        throw new IllegalStateException("No computer of brand " + brand);
    }
}
