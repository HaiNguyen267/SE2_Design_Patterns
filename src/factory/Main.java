package factory;

public class Main {

    public static void main(String[] args) {

        HPComputer hpComputer = new HPComputer();
        AppleComputer appleComputer = new AppleComputer();
        AsusComputer asusComputer = new AsusComputer();
        DellComputer dellComputer = new DellComputer();


        //Factory: ComputerFactory
        // only need to pass in the brand name for the factory class to create the computer
        Computer hComputer2 =  ComputerFactory.createComputer("hp");
        Computer appleComputer2 = ComputerFactory.createComputer("apple");
        Computer asusComputer2 =  ComputerFactory.createComputer("asus");
        Computer dellComputer2 = ComputerFactory.createComputer("dell");
    }
}
