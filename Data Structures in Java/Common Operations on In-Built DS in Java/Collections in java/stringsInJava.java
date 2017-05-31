public class stringsInJava{

  public static void main(String args[]){
    // The String class is immutable, so that once it is created a String object cannot be changed.
    // Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation.
    String helloGreet = "Hello World, Good Morning";
    System.out.println(helloGreet);
    /*
    Methods used to obtain information about an object are known as accessor methods.
    One accessor method that you can use with strings is the length() method, which returns the number of characters contained in the string object.
    */
    System.out.println("The length of String is: " + helloGreet.length());

    // string1.concat(string2);
   // This returns a new string that is string1 with string2 added to it at the end.
   String welcomeMsg = " Nice to meet you...";
   helloGreet = helloGreet.concat(welcomeMsg);
   System.out.println("String after concatenation is: " + helloGreet);

   // Converting String to Numbers
   String one = "1.2";
   // Float can be replaced with Integer, Double, Long, Short, Byte
   float a = Float.valueOf(one).floatValue();
   System.out.println("After converting string to number: "+a);
   // Converting numbers to String
   int i = 23;
   String s = Integer.toString(i);
   System.out.println("After converting number to String: "+s);
   // Manipulating Characters in a string
   String anotherPalindrome = "Niagara. O roar again!     ";
   String otherPalindrome = "Niagara. O roar";
   char aChar = anotherPalindrome.charAt(9);
   System.out.println("Character at specific pos: "+aChar);
   // Returns true if the string contains the specified character sequence.
   System.out.println(anotherPalindrome.contains(". O"));
   // Returns a copy of this string with leading and trailing white space removed.
   System.out.println(anotherPalindrome.trim());
   // Convert everything to lowercase or uppercase
   System.out.println(anotherPalindrome.toLowerCase() + " upper: "
        + anotherPalindrome.toUpperCase());
   // Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
   System.out.println(anotherPalindrome.replace("a", "t"));
   // Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
   System.out.println(anotherPalindrome.substring(1, 7));

   // String comparisons
   System.out.println(anotherPalindrome.startsWith("N"));
   // Compares two strings lexicographically. Returns an integer indicating whether this string is greater than (result is > 0), equal to (result is = 0), or less than (result is < 0) the argument.
   System.out.println(anotherPalindrome.compareTo(otherPalindrome));
   // Compares two strings lexicographically, ignoring differences in case.
   // Returns an integer indicating whether this string is greater than (result is > 0), equal to (result is = 0), or less than (result is < 0) the argument.
   // compareToIgnoreCase()

   // Returns true if and only if the argument is a String object that represents the same sequence of characters as this object.
   System.out.println(anotherPalindrome.equals(otherPalindrome));

   // Returns true if and only if the argument is a String object that represents the same sequence of characters as this object, ignoring differences in case.
   System.out.println(anotherPalindrome.equalsIgnoreCase(anotherPalindrome.toLowerCase()));
   // reversing a string
   // There is no built-in method to reverse a string however you can create a stringbuilder instance to reverse it


   /*
   StringBuilder objects are like String objects, except that they can be modified.
   Internally, these objects are treated like variable-length arrays that contain a sequence of characters.
   At any point, the length and content of the sequence can be changed through method invocations.
   Strings should always be used unless string builders offer an advantage in terms of simpler code (see the sample program at the end of this section) or better performance.
   For example, if you need to concatenate a large number of strings, appending to a StringBuilder object is more efficient.
   */

   StringBuilder sb = new StringBuilder();
   sb.append("Hi");
   sb.append(" I");
   sb.append(" am in the process ");
   sb.append(" of being built.");
   System.out.println(sb);
   // delete char at a specific position
   System.out.println(sb.deleteCharAt(5));
   // delete(int start, int end) deletes a part of stringbuilder

   // Insert element at specified position
   System.out.println(sb.insert(5, "a"));

   // Replaces the specified character(s) in this string builder.
   // replace(int start, int end, String s)

   // set character at a particular position
   sb.setCharAt(5,'l');
   System.out.println(sb);

   // reverse the characters of a string
   System.out.println("The reversed string looks like: " + sb.reverse());

   //Returns a string that contains the character sequence in the builder.
   System.out.println(sb.toString());

   System.out.println("====== Program Creek ======");
   // String part from ProgramCreek
   String s1 = "abc";
   String s2 = "abc";
   System.out.println("Intern " + (s1==s2) + " and " + s1.equals(s2));

   String s3 = new String("abc").intern(); // Added to point to same String
   String s4 = new String("abc").intern();
   System.out.println("Intern not in place " +(s3==s4) + " and " + s3.equals(s4));

   // good practice to initialize a String with quotes

   StringBuilder x = new StringBuilder("ab");
	 change(x);
	System.out.println("x : " + x);













  }

    public static void change(StringBuilder x) {
       System.out.println("x inside change: "+x);
       x.delete(0, 2).append("cd");
    }

}
