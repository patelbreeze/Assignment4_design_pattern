package design_pattern.MoonRover;

/**
 * State class - the description of this class
 *
 * @author Breeze Patel
 * @version 1.0
 */
public class State {

    protected String name = "NULL";
    protected String subState = "NULL";

    /**
     * Default constructor for State.
     */
    State() {
    }

    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }

    protected void pressRightPedalForTime(int numOfSecondsPressed) {
    }

    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {
    }

}
