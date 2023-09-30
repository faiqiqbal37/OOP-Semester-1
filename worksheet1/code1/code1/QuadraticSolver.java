/*
 * QuadraticSolver.java  	1.1 26/08/2011
 *
 * Copyright (c) University of Sheffield 2011
 */

import java.math.*;

/**
* QuadraticSolver.java
* solves quadratic equations for x given a*x*x + b*x + c = 0
* the code should be modified so that a, b, and c are input by the user
*
* @version 1.1 26 August 2011
*
* @author Mark Stevenson (mark.stevenson@sheffield.ac.uk)
* @author (based on code written by Richard Clayton)
*/
public class QuadraticSolver {
    public static void main( String[] arg) {

	// default values for coefficients a, b, and c
	// initially, these are stored as both integers and float
	int aInt = 1, bInt = 2000000, cInt = 1;
	double aFloat = 1, bFloat = 2000000, cFloat = 1;

	// declare variables to store the two values of x that satisfy the equation
	double x1, x2, temp1, temp2;

	// work out the solution with int types
	//aInt -= 1/2;
	x1 = (-1 * bInt + Math.sqrt(bInt*bInt - 4 * aInt * cInt)) / (2 * aInt);
	x2 = (-1 * bInt - Math.sqrt(bInt*bInt - 4 * aInt * cInt)) / (2 * aInt);
	System.out.println("Solution with integer types is x1 = " + x1 + ", and x2 = " + x2);

	// work out the solution with double types
	//aFloat -= 0.5;
	x1 = (-1 * bFloat + Math.sqrt(bFloat*bFloat - 4 * aFloat * cFloat)) / (2 * aFloat);
	x2 = (-1 * bFloat - Math.sqrt(bFloat*bFloat - 4 * aFloat * cFloat)) / (2 * aFloat);
	System.out.println("Solution with double types is  x1 = " + x1 + ", and x2 = " + x2);

	temp1 = (aInt * (x1*x1) + (bFloat * x1) + cInt);
	temp2 = (aInt * (x2*x2) + (bFloat * x2) + cInt);

	System.out.println("a(x1)^2 + b(x1) + c = " + temp1);
	System.out.println("a(x2)^2 + b(x2) + c = " + temp2);


    }
}
