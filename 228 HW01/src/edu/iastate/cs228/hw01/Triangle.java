package edu.iastate.cs228.hw01;


/**
 * @author Sam Shifflett
 * 
 *         
 */
 
 
public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		side4 = (side1 + side2 + side3 )/ 2.0;
	}
	
	public Triangle(double a, double b, double c)
	{
		side1 = a;
		side2 = b;
		side3 = c;
		side4 = (side1 + side2 + side3 )/ 2.0;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public double getArea()
	{
		
       return Math.sqrt(side4 * (side4 - side1) * (side4 - side2) * (side4 - side3));
	}
	
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
