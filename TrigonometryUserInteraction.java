
//Juan Ariza
//COP 2006 CRN 10422
//Main Creation Integration Project - Trigonometry Question Solver
//This program is a comprehensive solver for general trigonometric problems, 
//from basic trigonometric identities (sine, cosine, tangent) to applying 
//special laws based on user input, such as the Law of Sines and 
//the Law of Cosines  

//import java.util.InputMismatchException;

import java.time.LocalDate;
import java.time.LocalTime;

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

  public static void main(String[] args) {
    
    LocalDate currentDate = LocalDate.now(); //creates date in (YYYY-MM-DD) 
    LocalTime currentTime = LocalTime.now(); //creates time in military format
    
    System.out.println("Current time: " + currentTime); //prints date
    System.out.println("Current date: " + currentDate); //prints time
    
    System.out.println("\nWelcome to the Trigonometry Question Solver!\n");
    
    System.out.println("This program will solve for the needed values of trig"
        + " problems based on the information you provide to the Solver.\n"
        + "Please choose from the following options to start solving.\n");
    
    String userOption = "1) Basic Trigonometric Identities\n2) Converting "
        + "Angle Measurements\n3) Finding Missing Information "
        + "about a Triangle\n4) Addition and Subtraction Formulas\n";
    System.out.println(userOption);
    
    // allows the program to take user input
    
    int userSelectMain = UniversalScanner.search.nextInt();
    
    while (userSelectMain < 1 || userSelectMain > 4) {

        System.out.println("Sorry! This is out of range. Please "
            + "enter a whole number from 1 to 4:\n");
        userSelectMain = UniversalScanner.search.nextInt();
        
        } //closes while loop
    
    
    switch (userSelectMain) {
      
      /* The fundamental use of the SWITCH statement. Based on the numbered 
       * input from the user, the SWITCH statement executes a line of code 
       * and stops once it sees the BREAK keyword. Without the BREAK operator, 
       * the SWITCH will run until it finds a BREAK operator  */
      
      case 1:

        System.out.println("Your choice: " + userOption.substring(0 , 33));
        break;
        
        /* An example of one String method, SUBSTRING, finds the characters in 
         * a string within the given indices and isolates them (but does not 
         * erase them from the original String) */
        
      case 2:

        System.out.println("Your choice: " + userOption.substring(34 , 66));
        break;

      case 3:

        System.out.println("Your choice: " + userOption.substring(67 , 114));
        break;
        
      case 4:
        
        System.out.println("Your choice: " + userOption.substring(115));
        break;
        
      default:

        System.out.println("You chose a value out of range for the menu\n");
        
    } // closes switch statement
   
    
    if (userSelectMain == 1) { //Missing information computation
        
      MissingInfo currentUserRun = new MissingInfo();
      System.out.println(currentUserRun.BasicExplain);
      
      System.out.println(currentUserRun.anglePrompt);
      MissingInfo.checkAngles();
      
      System.out.println("The sum of the given angles is " + MissingInfo.sum + 
          ", the largest angle value is " + MissingInfo.maxAngValue + " and "
          + "it's found at index " + MissingInfo.location);
      
      System.out.println(currentUserRun.sidePrompt);
      MissingInfo.checkSides();
     
      
    } else if (userSelectMain == 2) { //Angle-Radian computation
      
      AngleRadianConverter currentUserRun = new AngleRadianConverter();
      System.out.println(currentUserRun.AngRadExplain);
      int test = UniversalScanner.search.nextInt();
      double userInput = UniversalScanner.search.nextDouble();
      
      AngleRadianConverter.setAngRadInputCheck(userInput);
      
      
        if (test == 1) { //converts radians to degrees
        
          System.out.println("Enter your radian value: ");
          AngleRadianConverter.setAngRadInputCheck
          (UniversalScanner.search.nextDouble());
          
          System.out.println(AngleRadianConverter.RadiansToDegrees
              (currentUserRun.getAngRadInputCheck()));
          
        
        }
      
        else if (test == 2) { //converts degrees to radians
        
          System.out.println(AngleRadianConverter.DegreesToRadians
              (currentUserRun.getAngRadInputCheck()));
        
        }
      
        else {
          
          System.out.println("Out of range for further operation.\n");
          
        }
      
      
    } else if (userSelectMain == 3) { //right triangle computation
      
        MissingInfo currentUserRun = new MissingInfo();
      
        /* This creates an object of the Class BasicIdentities, allowing access
         * to access all functionality of the class. In this case, the user may 
         * enter the values of triangle sides and corresponding angles to find 
         * the sine, cosine, tangent, and any other missing information */
      
        System.out.println(currentUserRun.BasicExplain);
        System.out.println(currentUserRun.sidePrompt);
      
      
    } else if (userSelectMain == 4) { //Addition-Subtraction computation
      
      
    } else {
      
      System.out.println("The value is out range for any"
          + " further operations.\n"); 
      
    } //closes if/else statement
        
  } // closes Main

} //closes TrigonometryUserInteraction class
