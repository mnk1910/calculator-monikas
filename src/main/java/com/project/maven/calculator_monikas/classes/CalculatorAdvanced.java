package com.project.maven.calculator_monikas.classes;

import com.project.maven.calculator_monikas.interfaces.CalculatorAdvancedOperationsInterface;

/**
 * Class CalculatorAdvanced - it is a subclass of class CalculatorBasics,
 * it implements an interface CalculatorAdvancedOperationsInterface and
 * contains six methods that perform advanced mathematical operations
 * @author Monika - mnk1910
 * @version 1.0
 */

public class CalculatorAdvanced extends CalculatorBasic implements CalculatorAdvancedOperationsInterface {

	/**
	 * raisedToThePowerOf2 method - raises a double number to the power of 2
	 * @param base: the number to be raised to the power of 2 as a double
	 *
	 * @return: a double as the result of raising to the power of 2
	 */
	public double raisedToThePowerOf2(double base) {
		return Math.pow(base, 2.0);
	}

	/**
	 * raisedToThePowerOf3 method - raises a double number to the power of 3
	 * @param base: the number to be raised to the power of 3 as a double
	 *
	 * @return: a double as the result of raising to the power of 3
	 */
	public double raisedToThePowerOf3(double base) {
		return Math.pow(base, 3.0);
	}

	/**
	 * squareRoot - method that returns the correctly rounded positive square root of a double value
	 * @param number: a double
	 * @return result: a double
	 */
	public double squareRoot(double number) {
		if (number < 0) {
			//System.out.println("Negative number? Operation can not be performed.");
			return -0.123456789;
		}
		else {
			double result = Math.sqrt(number);
			return result;
		}
	}

	/**
	 * cubeRoot - method that returns the cube root of a double value
	 * @param number: a double
	 * @return: a double
	 */
	public double cubeRoot(double number) {
		return Math.cbrt(number);
	}

	/**
	 * abs - method that returns the absolute value of a double value
	 * @param number: the argument whose absolute value is to be determined
	 * @return: the absolute value of the argument as a double
	 */
	public double absoluteValue(double number) {
		return Math.abs(number);
	}

	/**
	 * oneDividedByValue - method that returns the result of 1 divided by a double value
	 * @param value: a double that is the dividend to 1
	 * @return result: the division between 1 and a value, as a double
	 */
	public double oneDividedBy(double value) {
		double result = 1/value;
		if (value == 0) {
			//System.out.println("Division by zero?");
			return -0.123456789;
		}
		return result;
	}

	/**
	 * randomNumber - method that returns a pseudorandom double
	 * @param none
	 * @return: a double greater than or equal to 0.0 and less than 1.0
	 */

	public double randomNumberBetween0and1() {
		return Math.random();
	}

}
