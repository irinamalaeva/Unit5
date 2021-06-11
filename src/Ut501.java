import computer.Computer;

public class Ut501 {
    public static void main(String[] args) {
        Computer comp = new Computer("asd", 10, 2, 2);
        // comp.hardDisk = 2;
        //comp.recourse = 10000;
        //comp.processor = "asd";
        //comp.describe();
       // Computer comp1 = new Computer(" asdf", 20, 36, 44);
        System.out.println(comp.describe());
       // System.out.println(comp1.describe());
        comp.turnOn();
        comp.turnOn();
        comp.turnOn();
        comp.turnOn();
        comp.turnOn();
        comp.turnOn();
        comp.turnOn();
        comp.turnOn();


    }
}
