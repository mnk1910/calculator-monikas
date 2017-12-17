package com.project.maven.calculator_monikas.interfaces;

/***
 * This is an interface for the 4 basic mathematical operations
 * that has four methods: add, subtract, multiply and divide
 *
 * @author Monika - mnk1910
 * @version 1.0
 */

public interface CalculatorBasicOperationsInterface {

	/**
	 * Add method - adds two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 **/
	public abstract double add(double firstNumber, double secondNumber);

	/**
	 * Subtract method - subtracts two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 */
	public abstract double subtract(double firstNumber, double secondNumber);

	/**
	 * Multiply method - multiplies two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 */
	public abstract double multiply(double firstNumber, double secondNumber);

	/**
	 * Divide method - divides two doubles
	 * @param firstNumber: the first number as a double
	 * @param secondNumber: the second number as a double
	 */
	public abstract double divide(double firstNumber, double secondNumber);

}
