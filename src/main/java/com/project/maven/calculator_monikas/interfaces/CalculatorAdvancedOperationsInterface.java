package com.project.maven.calculator_monikas.interfaces;

/***
 * This is an interface for 6 advanced mathematical operations
 * that has six methods: raisedToThePowerOf2, raisedToThePowerOf3,
 * squareRoot, cubeRoot, abs and randomNumber
 *
 * @author Monika - mnk1910
 * @version 1.0
 */

public interface CalculatorAdvancedOperationsInterface {

	//public double raisedToThePowerOf(double base, double exponent);

	/**
	 * raisedToThePowerOf2 method - raises a double number to the power of 2
	 * @param base: a double being raised to the power of 2
	 */
	public double raisedToThePowerOf2(double base);

	/**
	 * raisedToThePowerOf3 method - raises a double number to the power of 3
	 * @param base: a double being raised to the power of 3
	 */
	public double raisedToThePowerOf3(double base);

	/**
	 * squareRoot - method that returns the correctly rounded positive square root of a double value
	 * @param number
	 */
	public double squareRoot(double number);

	/**
	 * cubeRoot - method that returns the cube root of a double value
	 * @param number
	 */
	public double cubeRoot(double number);

	/**
	 * abs - method that returns the absolute value of a double value
	 * @param number
	 */
	public double absoluteValue(double number);

	/**
	 * oneDividedByValue - method that method that returns the result of 1 divided by a double value
	 * @param value
	 */
	public double oneDividedBy(double value);

	/**
	 * randomNumber - method that returns a pseudorandom
	 * double greater than or equal to 0.0 and less than 1.0
	 * @param none
	 */
	public double randomNumberBetween0and1();
}
