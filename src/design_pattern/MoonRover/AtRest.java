package design_pattern.MoonRover;


/**
 * Represents the At Rest state of the Rover.
 *
 * @author Breeze Patel
 * @version 1.0
 */
public class AtRest extends State {

    /**
     * Default constructor for AtRest state.
     */
    AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }

    /**
     * Handles pressing the right pedal.
     *
     * @param numOfTimesPressed Number of times the right pedal is pressed.
     * @return Boolean indicating success (true) or failure (false).
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    /**
     * Handles pressing the left pedal for a specific time.
     *
     * @param numOfSecondsPressed Duration for which the left pedal is pressed.
     * @return Boolean indicating success (true) or failure (false).
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Right Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }
}
