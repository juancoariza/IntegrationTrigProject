//Juan Ariza
//COP 2006 SP 2018
//The following class is an example taken from Tutorials Point 
// https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm
//This code will not be used by any other part of the program; it exists as a 
//concept to understand how Lambda expressions are formed, as well as their use
//in Java programming


public class Java8Tester {
  
    public static void main(String args[]) {
       Java8Tester tester = new Java8Tester();
       //creates new object of type Java8Tester named tester
     
       //with type declaration
       MathOperation addition = (int a, int b) -> a + b;
       
       /* the -> operation omits having the datatype declaration for the 
        * following operation type 
        * " a + b " is equivalent to "int answer = a + b */
       
       //with out type declaration
       MathOperation subtraction = (a, b) -> a - b;
     
       //with return statement along with curly braces
       MathOperation multiplication = (int a, int b) -> { return a * b; };
     
       //without return statement and without curly braces
       MathOperation division = (int a, int b) -> a / b;
     
       System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
       System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
       System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
       System.out.println("10 / 5 = " + tester.operate(10, 5, division));
     
       //without parenthesis
       GreetingService greetService1 = message ->
       System.out.println("Hello " + message);
     
       //with parenthesis
       GreetingService greetService2 = (message) ->
       System.out.println("Hello " + message);
     
       greetService1.sayMessage("Mahesh");
       greetService2.sayMessage("Suresh");
    }
   
    interface MathOperation {
       int operation(int a, int b);
       
       /* Having the MathOperation as an interface allows the program to 
        * implement this method every time*/
    }
   
    interface GreetingService {
       void sayMessage(String message);
       
       /* replacing every method with an interface creates the most "generic"
        * way possible - cutting out all assignments to datatypes. This is the
        * most optimized style of code possible in Java */
    }
   
    private int operate(int a, int b, MathOperation mathOperation) {
       return mathOperation.operation(a, b);
    } 
    /* The paramenter to this method is an instance of the MathOperation class,
     *  which is on itself based on an Interface */
 }

