// This is a simple Java program that demonstrates the usage of common keywords

public class KeywordExample {

    // 'public' is an access modifier, 'class' defines a class
    public static void main(String args) {
        
        // 'String' is a reference data type and 'args' is the parameter for command-line arguments
        // 'static' means the method can be called without creating an instance of the class
        // 'void' means this method does not return any value
        
        // Variable declarations and initialization
        int num1 = 10;  // 'int' is a primitive data type for integer numbers
        double num2 = 20.5;  // 'double' is a primitive data type for floating-point numbers
        
        // 'if' is a conditional statement
        if (num1 < num2) {
            // 'System.out.println' is used to print text to the console
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is greater than or equal to num2");
        }
      int

        // 'for' loop for iteration
        for (int i = 0; i < 5; i++) {
            // 'i' is a loop variable, 'for' repeats the block of code
            System.out.println("Loop index: " + i);
        }
        
        // 'try' and 'catch' are used for exception handling
        try {
            int result = num1 / 0;  // This will cause an exception (division by zero)
        } catch (ArithmeticException e) {
            // 'catch' block catches the exception, and 'e' is the exception object
            System.out.println("Exception caught: " + e);
        }
      strin

        // 'return' is used to return a value from a method (in a non-void method)
        // In this case, the program ends here as the 'main' method is 'void'

    }
}
