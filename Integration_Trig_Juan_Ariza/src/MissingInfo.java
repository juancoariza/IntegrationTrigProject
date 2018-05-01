import java.util.InputMismatchException;

/* Juan Ariza
 * COP 2006 SP 2018
 * This class will check all side and angle inputs from the user to guarantee 
 * the data follows the correct procedure:
 * Sides must be values of the type double - negative values are allowed
 * 
 * Angles must be positive radian values of the type double - the user will be 
 * offered the opportunity to convert their degree angles to radians here if 
 * necessary, instead of forcing them to restart the program to access 
 * the Angle-Radian converter.
 * 
 * The sum of the angle values must not surpass 180
 * 
 * Once these criteria are met, the data will be stored in arrays and passed 
 * onto the MissingInfoCases class for calculations
 */

public class MissingInfo extends TrigonometryUserInteraction
    implements CommonTriValues {

  static final String basicExplain = "This section will find the missing sides"
      + " and angles for any triangle based on your information.\n";

  static final String sidePrompt = "Enter the sides of the triangle below. "
      + "If you do not know the value of a side, enter 0 and press ENTER to "
      + "continue.\n";

  String anglePrompt = "Enter the angles of the triangle below. If you do not "
      + "know the value of an angle, enter 0 and press ENTER to continue."
      + "\n *Note: since this is a general solver, if you need the values for"
      + " a Right Triangle, please specify one angle of 90 degrees\n";

  public static double[] sides = new double[3];
  public static double[] angles = new double[3];
  public static long sum = 0;
  public static double maxAngValue = 0;
  public static int location;
  static boolean goodAngInput = false;
  static boolean goodSideInput = false;

  
  /**
   * Checks if angle inputs are correct.
   */
  public static void checkAngles() {

    while (goodAngInput == false) {

      try {

        for (int looperAng = 0; looperAng < angles.length; looperAng++) {

          System.out.println("Enter the next angle value in degrees: ");
          angles[looperAng] = UniversalScanner.search.nextDouble();

          while (Math.abs(angles[looperAng]) > MAXANGLEVALUE) {
            // angles may be posivite or negative, so the absolute value must be
            // used for comparison

            System.out.println("Error. The angles of a triangle cannot be"
                + " greater than 180 degrees\n "
                + "Please enter the value again:\n");
            angles[looperAng] = UniversalScanner.search.nextDouble();

          } // closes While loop

          if (angles[looperAng] > maxAngValue) {

            maxAngValue = angles[looperAng];
            location = looperAng;

          } // closes If loop

        } // closes Try loop

        for (double adder : angles) {

          sum += adder;

        } // closes FOR loop

        goodAngInput = true;

      } catch (InputMismatchException hereMisInf) {
        // closes Try block

        System.out.println("Sorry! Your input was not accepted. Please enter "
            + "an integer or decimal value");
        UniversalScanner.search.nextLine();

      } // closes Catch block
      
    } // closes While loop

  } // closes checkAngles method

  /** Checks if the inputs of the side values are correct.
   *  The method traps all user inout under a try-catch block
   */
  public static void checkSides() {

    while (goodSideInput == false) {

      try {

        for (int looperSide = 0; looperSide < sides.length; looperSide++) {

          System.out.println("Enter the next side value: ");
          angles[looperSide] = UniversalScanner.search.nextDouble();

        } // closes Try loop

        goodSideInput = true;

      } catch (InputMismatchException hereMisInf) {
        // closes Try block

        System.out.println("Sorry! Your input was not accepted. Please enter "
            + "an integer or decimal value");
        UniversalScanner.search.nextLine();

      } // closes Catch block
      
    } //closes While loop

  } // closes checkAngles method

} // closes MissingInfo class