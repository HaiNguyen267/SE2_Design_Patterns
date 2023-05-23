package factory;

public class Main {

    public static void main(String[] args) {

        HPComputer hpComputer = new HPComputer();
        AppleComputer appleComputer = new AppleComputer();
        AsusComputer asusComputer = new AsusComputer();
        DellComputer dellComputer = new DellComputer();


        //Factory: ComputerFactory
        Computer hComputer2 =  ComputerFactory.createComputer("hp");
        Computer appleComputer2 = ComputerFactory.createComputer("apple");
        Computer asusComputer2 =  ComputerFactory.createComputer("asus");
        Computer dellComputer2 = ComputerFactory.createComputer("dell");
    }
}
