import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;

public class AutoClickerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("00");
        System.out.println("00");
        System.out.println("00");
        System.out.println("00                      00 00 00         00 00 00 00");
        System.out.println("00                   00          00   00             00");
        System.out.println("00                   00          00   00             00");
        System.out.println("00                   00 00 00 00 00   00             00");
        System.out.println("00                   00               00             00");
        System.out.println("00                   00               00             00");
        System.out.println("00 00 00 00 00 00       00 00 00         00 00 00 00");
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Enter # Of Clicks:");
        int clicks =scanner.nextInt();

        System.out.print("Min:");
        int min = 1000 / scanner.nextInt();

        System.out.print("Max:");
        int max = 1000 / scanner.nextInt();

        System.out.print("Min:" + min);
        System.out.print("Max:" + max);

        System.out.println();

        int delayOne = new Random().nextInt(max - min);
        int delayTwo = new Random().nextInt(max - min);
        delayOne += max;
        delayTwo += max;
        int delayAvg = (delayOne + delayTwo) / 2;

        System.out.println("Program Will Start In 5 Seconds.");

        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delayAvg);

        for (int i = 0; i < clicks; i++) {
            clicker.clickMouse(InputEvent.BUTTON1_MASK);
            System.out.println(delayAvg);
        }

        System.out.println("AutoClick Complete.");
    }

}