/*Juan Ariza
 * COP 2006 SP 2018
 * This class will sort and process the values borrowed from the MissingInfo
 * superclass into six different possibilities, and fill in the missing values
 * according to the Law of Sines and Law of Cosines, each defined in their 
 * respective classes
 */

public class MissingInfoCases {

  /*
   * Based on the user's input from the main program - how many side and angle
   * values are known, the class is able to fill in the gaps using angle-side
   * relationships. Note: it is implied in this portion of the program that the
   * user has entered the side and angle values in order - that is, a side is
   * matched with its angle. If that is not the case, the results may be change
   * from the expected values. Sides are represented by S, angles by A. If the
   * user has inputs that follow the list below, the program can solve in
   * different ways:
   * 
   * AAA - no solution 
   * AAS - find missing angle by subtracting from 180, then
   * use law of sines to find missing side 
   * ASA - find missing angle by
   * subtracting from 180, then use law of sines to find missing side 
   * SAS - use law of cosines to find side, law of sines to find angle, then 
   * find missing angle by subtracting from 180 
   * SSA - use law of sines to find angle, find the other angle by subtracting 
   * from 180, then use law of sines to find the missing side 
   * SSS - use law of cosines to find angle, once more for another
   * angle, then find missing angle by subtracting from 180
   */
  
  private static double valueA;
  private static double valueB;
  private static double valueC;
  private static double angleA;
  private static double angleB;
  private static double angleC;
  
  public static double getValueA() {
    return valueA;
  }

  public static void setValueA(double valueA) {
    MissingInfoCases.valueA = valueA;
  }
  
  public static double getValueB() {
    return valueB;
  }

  public static void setValueB(double valueB) {
    MissingInfoCases.valueB = valueB;
  }
  
  public static double getValueC() {
    return valueC;
  }

  public static void setValueC(double valueC) {
    MissingInfoCases.valueC = valueC;
  }
  
  public static double getAngleA() {
    return angleA;
  }

  public static void setAngleA(double angleA) {
    MissingInfoCases.angleA = angleA;
  }
  
  public static double getAngleB() {
    return angleB;
  }

  public static void setAngleB(double angleB) {
    MissingInfoCases.angleB = angleB;
  }
  
  public static double getAngleC() {
    return angleC;
  }

  public static void setAngleC(double angleC) {
    MissingInfoCases.angleC = angleC;
  }
  
} // closes MissingInfoCases class
