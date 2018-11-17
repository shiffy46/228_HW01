# 228_HW01
The first homework assigned in 228
Design a class named Triangle that extends GeometricObject. The class needs to contain only:

Three private double data fields named side1, side2, and side3.
A no-arg constructor that creates a default triangle with sides' values 1.0 to denote the three sides of a triangle.
A constructor that creates a triangle with the specified side1, side2, and side3. (You can assume that sides' values provided will be positive, and that triangle inequality would hold for these three values of sides.)
The public accessor methods for all three data fields, named getSide1, getSide2, and getSide3, respectively.
A public method named getArea() that returns the area of this triangle as a double value.
A public method named getPerimeter() that returns the perimeter of this triangle as a double value.
A public method named toString() that returns a String description for the triangle. This method is already implemented for you.
For the formula to compute the area of a triangle, use Heron's Formula https://www.mathsisfun.com/geometry/herons-formula.html (Links to an external site.)Links to an external site.

 

Part 2. [40 pts] The String class is provided in the Java library. Provide your own implementation for the methods described in MyString class. All methods and a constructor containing a comment "//TODO" needs to be implemented.

Note: You are not allowed to use the following classes: System, String, StringBuilder, StringBuffer, or any of the wrapper classes. Except for Character's toLowerCase method. You are not allowed to add any other data or class fields to MyString class, other than the one already provided.

 

Part 3. [40 pts] Redesign and implement the provided Rational class using BigInteger (java.math) for the numerator and denominator. Call the new class Rational2. Check https://en.wikipedia.org/wiki/Rational_number (Links to an external site.)Links to an external site. 

The only import statement that is allowed in your Rational2 class is "import java.math.BigInteger;". No new data fields can be added into this class except the ones that existed in Rational class.
