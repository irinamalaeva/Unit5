import java.util.Random;
import java.util.Scanner;

public class CompM1 {

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
   static class Comp {
        private boolean fire = false;
        public String processor;
        public int memory;
        public int hardDisk;
        public int recourse;
        public int counter = 0;

        public String describe() {
            return "memory = " + memory + "; + hardDisk = " + hardDisk + "; recourse = " + recourse + ", processor = " + processor;
        }

        public void turnOn() {

            if (fire) {
                System.out.println("it does not work");
                return;
            }
            counter++;
            if (counter > recourse) {
                return;
            }
            System.out.println("input number 0 or 1: ");
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            System.out.println("You action is  = " + action);
            Random r = new Random();
            int random0_1 = r.nextInt(2);
            System.out.println(" random number = " + random0_1);
            if (random0_1 == action) {
                System.out.println("Congratulation! Your comp is lucky!!You turn it on!!!");
            } else {
                fire = true;
                System.out.println(" Sorry. You failed. You ruined your comp but you did not exceed the recourse");
            }
        }

        public void turnOff() {
            if (fire) {
                return;
            }
            counter++;
            if (counter > recourse) {
                return;
            }
            System.out.println("input number 0 or 1: ");
            Random r = new Random();
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            System.out.println("You action is  = " + action);
            int random0_1 = r.nextInt(2);
            System.out.println(" random number = " + random0_1);

            if (random0_1 == action) {
                System.out.println("Congratulation! Your comp is lucky!!You turn it off!!!");
            } else {
                fire = true;
                System.out.print(" Sorry. You failed. You ruined your comp!!!");
            }
        }

    }}










