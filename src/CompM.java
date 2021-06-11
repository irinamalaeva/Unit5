

public class CompM {

    public static void main(String[] args) {
        Comp comp = new Comp();
        comp.hardDisk = 5;
        comp.recourse = 4;
        comp.processor = "asd";
        comp.memory = 10;

        System.out.println(comp.describe());
        comp.turnOn();
        comp.turnOff();
        comp.turnOn();
        comp.turnOff();

    }
}



