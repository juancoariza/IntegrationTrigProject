
/**
 * @author Juan Ariza
 * COP 2006 CRN 10422
 * Main Creation Integration Project - Trigonometry Question Solver
 * This program is a comprehensive solver for general trigonometric problems, 
 * from basic trigonometric identities (sine, cosine, tangent) to applying 
 * special laws based on user input, such as the Law of Sines and 
 * the Law of Cosines 
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;

/* Data types most commonly used in this program: Double, Integer, Boolean
  The data types available in Java are as follows:
  Byte: 8-bit, two's compliment integer, range of -128 to 127
  Short: 16-bit, two's compliment integer. Can be used for integers of 
    range [-32,768 , 32,767]
  Integer: 32-bit, two's compliment integer. Mostly used for arithmetic and 
    other math operations
  Long: 64-bit, two's compliment integer. Rarely used, it can store larger 
    numbers than the int data type, albeit with some restrictions on operations
  Float: 32-bit values with one decimal point. 
  Double: 64-bit values with two decimal points.
  Boolean: handles true and false statements, used to verify conditions
  Char: accepts a single character value using the ASCII notation. 
  String: a class used in conjunction with PDTs to accept user input 
    and modify as needed */

public class TrigonometryUserInteraction {

  /** This class handles main menu user input.
   * @param args general main argument declaration
   */

  public static void main(String[] args) {

    LocalDate currentDate = LocalDate.now(); // creates date in (YYYY-MM-DD)
    LocalTime currentTime = LocalTime.now(); // creates time in military format

    System.out.println("Current time: " + currentTime); // prints date
    System.out.println("Current date: " + currentDate); // prints time

    System.out.println("\nWelcome to the Trigonometry Question Solver!\n");

    System.out.println("This program will solve for the needed values of trig"
        + " problems based on the information you provide to the Solver.\n"
        + "Please choose from the following options to start solving.\n");

    String userOption = "1) Finding Missing Information about a triangle"
        + "\n2) Converting Angle Measurements\n";
    System.out.println(userOption);

    // allows the program to take user input

    int userSelectMain = 0;
    boolean goodInput = false;

    while (goodInput == false || userSelectMain < 1 || userSelectMain > 2) {

      System.out.println("Enter your choice: ");

      try {

        userSelectMain = UniversalScanner.search.nextInt();
        goodInput = true;

        if (userSelectMain < 1 || userSelectMain > 2) {

          System.out.println("Sorry! The value is out of range. Please choose "
              + "a number from 1 to 2");

        } // closes If statement

        // closes Try

      } catch (InputMismatchException hereMain) {

        System.out.println("Sorry! The input must be an integer value.\n");
        UniversalScanner.search.nextLine();

      } // closes Catch

    } // closes while loop

    switch (userSelectMain) {

      /*
       * The fundamental use of the SWITCH statement. Based on the numbered
       * input from the user, the SWITCH statement executes a line of code and
       * stops once it sees the BREAK keyword. Without the BREAK operator, the
       * SWITCH will run until it finds a BREAK operator
       */

      case 1:

        System.out.println("Your choice: " + userOption.substring(0, 47));
        break;

      /*
       * An example of one String method, SUBSTRING, finds the characters in a
       * string within the given indices and isolates them (but does not erase
       * them from the original String)
       */

      case 2:

        System.out.println("Your choice: " + userOption.substring(48));
        break;

      default:

        System.out.println("You chose a value out of range for the menu\n");

    } // closes switch statement

    if (userSelectMain == 1) { // Missing information computation

      MissingInfo currentUserRun = new MissingInfo();
      System.out.println(MissingInfo.basicExplain);

      System.out.println(currentUserRun.anglePrompt);
      MissingInfo.checkAngles();

      System.out.println("The sum of the given angles is " + MissingInfo.sum
          + ", the largest angle value is " + MissingInfo.maxAngValue + " and "
          + "it's found at index " + MissingInfo.location);

      System.out.println(MissingInfo.sidePrompt);
      MissingInfo.checkSides();
      
    } else if (userSelectMain == 2) { // Angle-Radian computation
      
      int angRadChoice = 0; // controls choice between angle/radian
      
      AngleRadianConverter currentUserRun = new AngleRadianConverter();
      System.out.println(currentUserRun.angRadExplain);
      
      while (AngleRadianConverter.goodInputAngRadHere == false 
          || angRadChoice < 1 || angRadChoice > 2) {

        System.out.println("Enter your conversion choice here: ");

        try {

          angRadChoice = UniversalScanner.search.nextInt();
          AngleRadianConverter.goodInputAngRadHere = true;

        } catch (InputMismatchException hereAngRad) { // closes TRY

          System.out.println("Sorry! The input must be an integer value.\n");
          UniversalScanner.search.nextLine();
  
        } finally {
          //closes previous Catch block

          if (angRadChoice == 1) { // prints radian to degree string

            System.out.println(currentUserRun.angRadOption1);

          } else if (angRadChoice == 2) { // prints degree to radian string
            System.out.println(currentUserRun.angRadOption2);

          } else {

            System.out.println("Out of range for further operation.\n");

          } // closes IF statements
          
        } //closes Finally block
        
      } //closes While
      
      double angRadHere = 0; // provides value to be converted

      while (AngleRadianConverter.goodInputAngRadAgain == false) { 
        
        System.out.println("Enter your angle value: "); 
        
        try {

          angRadHere = UniversalScanner.search.nextDouble();
          AngleRadianConverter.goodInputAngRadAgain = true;
          AngleRadianConverter.setAngRad(angRadHere);
          
        } catch (InputMismatchException hereAngRadAgain) {
          
          System.out.println("Sorry! The input must be an integer value.\n");
          UniversalScanner.search.nextLine();
           
        } finally { 
          
          if (angRadChoice == 1) { // converts radian to degree 

            System.out.println(AngleRadianConverter
                .radiansToDegrees((currentUserRun.getAngRad())));

          } else if (angRadChoice == 2) { // converts degree to radian
            System.out.println(AngleRadianConverter
                .degreesToRadians((currentUserRun.getAngRad())));

          } else {

            System.out.println("Cannot convert the values at this time.\n");

          } // closes IF loop
          
        } //closes Finally block
        
      } //closes While loop
     
    } else {

      System.out
          .println("The value is out range for" + " further operations.\n");

    } // closes if/else statement

  } // closes Main

} // closes TrigonometryUserInteraction class
