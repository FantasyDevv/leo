import java.awt.Robot;

public class AutoClicker {

    private Robot robot;
    private int delay;

    public AutoClicker()  {
        try{
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
        delay = 1;
    }

    public void clickMouse(int button) {
        try {
            robot.mousePress(button);
            robot.delay(5);
            robot.mouseRelease(button);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setDelay(int ms) {
        this.delay = ms;
    }

}