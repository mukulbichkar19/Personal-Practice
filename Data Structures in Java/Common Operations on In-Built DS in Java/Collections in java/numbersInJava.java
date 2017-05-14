public class numbersInJava{


  public static void main(String args[]) {
    int i = 500;
    float gpa = 3.65f;

    /* Autoboxing and Unboxing
       Autoboxing is the automatic conversion that the Java compiler makes
       between the primitive types and their corresponding object wrapper classes.
       For example, converting an int to an Integer, a double to a Double, and so on.
       If the conversion goes the other way, this is called unboxing. */

    /*
    There are three reasons that you might use a Number object rather than a primitive:
    As an argument of a method that expects an object (often used when manipulating collections of numbers).
    To use constants defined by the class, such as MIN_VALUE and MAX_VALUE, that provide the upper and lower bounds of the data type.
    To use class methods for converting values to and from other primitive types, for converting to and from strings,
    and for converting between number systems (decimal, octal, hexadecimal, binary).
    */
    System.out.println("Min value in integer is: " + Integer.MIN_VALUE);
    System.out.println("Max value in integer is: " + Integer.MAX_VALUE);
    System.out.println("Min value in float is: " + Float.MIN_VALUE);
    System.out.println("Max value in float is: " + Float.MAX_VALUE);
    System.out.println("Min value in double is: " + Double.MIN_VALUE);
    System.out.println("Max value in double is: " + Double.MAX_VALUE);

    // Returns an integer (decimal only).
    // The string should be a number
    int a = Integer.parseInt("980");
    System.out.println(a);



    // The methods in the Math class are all static, so you call them directly from the class, like this:
    // Math.cos(angle);

    System.out.println("The absolute value is: "+Math.abs(-2));
    System.out.println("The ceil value is: "+Math.ceil(18902.2));
    System.out.println("The floor value is: "+Math.floor(18902.2));
    System.out.println("The rint value is: "+Math.rint(18902.2));
    System.out.println("The rounded value is: "+Math.round(18902.2));
    System.out.println("The max and min value are: "+Math.max(7, 90) + " : " + Math.min(2, -9));
    // Returns the value of the first argument raised to the power of the second argument.
    System.out.println("The value is: "+Math.pow(2, 3));
    // Returns the square root of the argument.
    System.out.println("The square root value is: "+Math.sqrt(164));

    // For more functions refer to https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html











  }

}
