//Juan Ariza
//COP 2006 Spring 2018
//This class will compute the missing angles and sides based on user input
//and the trigonometric identities of law of sines, law of cosines, and the
//angle property

public class MissingInfo extends TrigonometryUserInteraction 
  implements CommonTriValues {
   
  String BasicExplain = "This section will find the missing sides "
      + "and angles for any triangle based on your information.\n";

  String sidePrompt = "Enter the sides of the triangle below. If you do not "
      + "know the value of a side, enter 0 and press ENTER to continue.\n";
  
  String anglePrompt = "Enter the angles of the triangle below. If you do not "
      + "know the value of an angle, enter 0 and press ENTER to continue."
      + "\n *Note: since this is a general solver, if you need the values for"
      + " a Right Triangle, please specify one angle of 90 degrees\n";
  
  public static double[] sides = new double[3];
  public static double[] angles = new double[3];
  public static long sum = 0;
  public static double maxAngValue = angles[0];
  public static int location;
  
  public static void checkAngles() {
       
    for (int looperAng = 0; looperAng < angles.length; looperAng++) {
      
      System.out.println("Enter the next angle value: ");
      angles[looperAng] = UniversalScanner.search.nextDouble();
         
      while (Math.abs(angles[looperAng]) > MAXANGLEVALUE) { 
        //angles may be posivite or negative, so the absolute value must be 
        //used for comparison
        
        System.out.println("Error. The angles of a triangle cannot be greater "
            + "than 180 degrees");
        angles[looperAng] = UniversalScanner.search.nextDouble();
        
      } //closes while statement
      
      if (angles[looperAng] > maxAngValue) {
        
        maxAngValue = angles[looperAng];
        location = looperAng;
        
      }
      
   } //closes FOR loop
    
    for (double adder : angles) {
      
      sum += adder;
      
    } //closes FOR loop
   
  } //closes checkAngles method 
  
  public static void checkSides() {
    
    try {
      
      for (int looperSide = 0; looperSide < sides.length; looperSide++) {
      
          System.out.println("Enter the next side value: ");
          sides[looperSide] = UniversalScanner.search.nextDouble();
           
            } //closes FOR loop
      
          } //closes TRY block 
    
    catch (ArrayStoreException MisInfHere) {
      
      System.out.println("Error. Please use direct number values for this "
          + "section. If you have an unknown value to be solved, enter it as"
          + " 0. The program will sort it and replace it later.\n");
      
    } //closes CATCH block
    
    catch (NumberFormatException MisInfHereAgain) {
      
      System.out.println("Error. Please enter numeric values for this section."
          + " Any negative values will be automatically returned as positive"
          + " values.\n");
      
    } //closes CATCH block
    
    catch (Exception MisInfGeneral) {
      
      System.out.println("There seems to be an error to your input. "
          + "Please make sure to provide decimal numbers only.\n");
      
    } //closes CATCH block
    
    finally {
      
      System.out.println("Statement passed to program\n");
      
    } //closes FINALLY block
    
  } //closes checkSides method
  
} // closes MissingInfo class