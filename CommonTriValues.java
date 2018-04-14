//Juan Ariza
//COP 2006 SP 2018
//This interface is a contract - a guarantee that any object that implemements 
//this interface WILL USE the fields and methods described below

public interface CommonTriValues {
  
  public static double[] sides = new double[3];
  public static double[] angles = new double[3];
  final double MAXANGLEVALUE = 180.0;
  
} //closes interface

/* Implementing this interface into any classes forces said class to use ALL 
 * fields listen within. 
 * in this case, every class that implements this Interface must have an array 
 * to accept side values, an array to accept angle values, and the defined 
 * constant MAXANGLEVALUE */