/** This class will convert between radian and Cartesian angles.
 * @author Juan Ariza COP 2006 Spring 2018 
 *         This class will convert a given angle
 *         measurement from radians to degrees, and vice-versa. The class will
 *         be used as an individual converter, or as part other subclasses if
 *         the user wishes to have angle results in radians or degrees.
 */

public class AngleRadianConverter extends TrigonometryUserInteraction {

  /*
   * adding the EXTENDS keyword in the header creates an Inheritance Inheritance
   * can be explained using an IS-A relationship, meaning that if the derived
   * class IS An instance of the greater class, then it can display inheritance.
   * When an inheritance is declared, the child class is able to access all
   * fields and methods from the parent class and use them within Subclass
   * calculations. Likewise, a parent class is able to create objects from the
   * child class, process the inputs as needed in the child class, then extract
   * the results back to the parent. Doing this creates an application that only
   * uses ONE CLASS with ONE MAIN, and several subclasses to process the program
   */

  private int sample = (int) (22.8 / 15);

  
  public int getSample() {

    return sample;
  }
  

  public void setSample(int sample) {
    this.sample = sample;
  }

  public static boolean goodInputAngRadHere = false;
  public static boolean goodInputAngRadAgain = false;
  /*
   * When a value is cast from one datatype to another, there is a loss of
   * precision to be accounted. In this sample case, casting the double datatype
   * answer as an int will truncate all values after the decimal
   */

  private static double angRad;

  /*
   * In Java, static means that the declared field or method belongs
   * specifically to the class where it is declared. To access static fields and
   * methods, the program must use the method call style
   * ClassName.fieldOrVariable . Having static fields/methods allows the program
   * to reuse the class operations with ease
   */

  public double getAngRad() {
    return angRad;
  }

  public static void setAngRad(double angRadInputCheck) {
    angRad = angRadInputCheck;
  }

  protected String angRadExplain = "1) Radians to Degrees\n2) "
      + "Degrees to Radians\n"; // will print user options
  protected String angRadOption1 = angRadExplain.substring(3, 22);
  protected String angRadOption2 = angRadExplain.substring(25);

  protected static double radiansToDegrees(double radianMeasure) {

    // This method accepts the radian value to be converted into degrees.
    // Angles may be negative, so no need to check for positive/negative value.

    double resultRadToDeg = radianMeasure * (180.0 / Math.PI);
    return resultRadToDeg;

  } // closes RadiansToDegrees method

  protected static double degreesToRadians(double degreeMeasure) {

    // This method accepts the degree value to be converted into radians.
    // Angles may be negative, so no need to check for positive/negative value.

    double resultDegToRad = degreeMeasure * (Math.PI / 180.0);
    return resultDegToRad;

  } // closes DegreesToRadians method

} // closes AngleRadianConverter class
