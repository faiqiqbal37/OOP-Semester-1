/*
 * Circle.java
 *
 * Copyright (c) University of Sheffield 2014
 */

public class Circle {

    // constructor
    public Circle(double r) {
	radius = r;
    }

    // class method
    public static double radToDeg(double angleRad) {
	return angleRad * 180.0 / PI;
    }

    // instance methods
    public double area() {
	// returns area of the circle
	return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "The radius of the circle is: " + this.radius;
    }

    public boolean equals(Circle obj) {
        if (obj == this){
            return true;
        }
        if (obj.radius == this.radius){
            return true;
        }
        else return false;
    }

    public double circumference() {
	// returns circumference of the circle
	return 2.0 * PI * radius;
    }

    // class field
    public static final double PI = 3.1415927;

    // instance field
    private double radius;

}
