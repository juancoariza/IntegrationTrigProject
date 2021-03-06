//Juan Ariza
//COP 2006 Spring 2018
//This class will solve missing sides or angles using the Law of Cosines
//NOTE: this class is not meant to be used individually; it is meant to be 
//called once certai conditions are met in the MissingInfo class

public class CosineLaw {

    public static double cosineLawSide(double valueA, double valueB, 
        double angle) {
      
   /* This method will receive three variables of double data type 
    * (valueA, valueB are the two known sides of the triangle, and angle is 
    * the angle between the sides.) The first method solves the missing side 
    * and the second method solves the missing angle 
    * NOTE: the values given to this class are imported from other parts of 
    * the program, so it assumes the current inputs have been checked */
      
      double valueAMod = Math.pow(valueA, 2);
      double valueBMod = Math.pow(valueB, 2);
      double process = (valueAMod + valueBMod)
          - (2 * valueA * valueB * Math.cos(Math.toRadians(angle)));
      double answer = Math.sqrt(process);
      return answer;
      
      /* The "Mod" variables will hold the value of inputs squared to avoid 
       * problems with reusing the variable names "value A" and "value B"
       * as well as the answer to be returned into the main program */

      } // closes CosineLaw method
    
    //public static double cosineLaw 
   
    } // closes CosineLaw class


