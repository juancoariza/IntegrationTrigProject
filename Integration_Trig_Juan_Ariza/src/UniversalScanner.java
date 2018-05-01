import java.util.Scanner;

//Juan Ariza
//COP 2006 SP 2018
//This class will become the universal scannner, to be propagated across the 
//entire program. Since the program will be accepting inputs for different 
//subclasses at different times, it is the best practice to create an 
//universal Scanner class to create Scanner objects, rather than importing 
//and creating new Scanner methods for every instance.
//Formatting and ideas based on recommendations found at:
// https://stackoverflow.com/questions/21887928/using-a-scanner-across-multiple
// -classes-in-java

public class UniversalScanner {
  
  public static Scanner search = new Scanner(System.in); 
  
}
