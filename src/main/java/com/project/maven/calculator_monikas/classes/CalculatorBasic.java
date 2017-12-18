
package com.project.maven.calculator_monikas.classes;

import com.project.maven.calculator_monikas.interfaces.CalculatorBasicOperationsInterface;

/**
 * Class CalculatorBasic - it contains methods that perform the basic 4 arithmetical operations,
 * addition, subtraction, multiplication and division
 * it also implements an interface CalculatorBasicOperationsInterface
 * @author Monika - mnk1910
 * @version 1.0
 */

public class CalculatorBasic implements CalculatorBasicOperationsInterface {

	/**
	 * Add method - adds two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 * @return result: the result of the addition, as a double
	 */
	public double add(double firstNumber, double secondNumber){
		double result = firstNumber+secondNumber;
		return result;
	}

	/**
	 * Subtract method - subtracts two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 * @return result: the result of the subtraction, as a double
	 */
	public double subtract(double firstNumber, double secondNumber){
		double result = firstNumber-secondNumber;
		return result;
	}

	/**
	 * Multiply method - multiplies two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 * @return result: the result of the multiplication as a double
	 */
	public double multiply(double firstNumber, double secondNumber){
		double result = firstNumber*secondNumber;
		if (firstNumber == 0 || secondNumber == 0) {
			return 0;
		}
		return result;
	}

	/**
	 * Divide method - divides two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 * @return result: the result of the division as a double
	 */
	public double divide(double firstNumber, double secondNumber){
		double result;
		if (firstNumber == 0) {
			result = 0;
		}
		else if (secondNumber == 0) {
			//System.out.println("Division by zero?");
			return -0.123456789;
		}
		else {
			result = firstNumber / secondNumber;
		}
		return result;
	}
}
