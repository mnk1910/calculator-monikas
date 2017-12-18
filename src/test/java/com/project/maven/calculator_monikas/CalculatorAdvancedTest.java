package com.project.maven.calculator_monikas;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.project.maven.calculator_monikas.classes.CalculatorAdvanced;
import com.project.maven.calculator_monikas.classes.CalculatorBasic;

public class CalculatorAdvancedTest {

	private static final Logger LOG = Logger.getLogger(CalculatorBasic.class.getName());
	CalculatorAdvanced ca = new CalculatorAdvanced();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR RAISED TO THE POWER OF 2
	 */

	@Test
	public void testRaisedToPowerOf2PositiveNumbers() {

		double numberDouble = 0.0;
		double result = 0.0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.pow(numberDouble, 2);

			LOG.info("Iteration "+i+" of testing the method raised to the power of 2 with: "+ numberDouble);
			assertEquals(Math.round(ca.raisedToThePowerOf2(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testRaisedToPowerOf2NegativeNumbers() {

		double numberDouble = 0.0;
		double result = 0.0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = Math.pow(numberDouble, 2);

			LOG.info("Iteration "+i+" of testing the method raised to the power of 2 with: "+ numberDouble);
			assertEquals(Math.round(ca.raisedToThePowerOf2(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testRaisedToPowerOf2WithZero() {

		double numberDouble = 0.0;
		double result = 0.0;

		for(int i = 0;i<50;i++) {
			//numberDouble = Double.valueOf(df.format(random.nextDouble()*0));
			result = Math.pow(numberDouble, 2);

			LOG.info("Iteration "+i+" of testing the method raised to the power of 2 with zero.");
			assertEquals(Math.round(ca.raisedToThePowerOf2(numberDouble)), Math.round(result),1);

		}
	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR RAISED TO THE POWER OF 3
	 */

	@Test
	public void testRaisedToPowerOf3PositiveNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.pow(numberDouble, 3);

			LOG.info("Iteration "+i+" of testing the method raised to the power of 3 with: "+ numberDouble);
			assertEquals(Math.round(ca.raisedToThePowerOf3(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testRaisedToPowerOf3NegativeNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = Math.pow(numberDouble, 3);

			LOG.info("Iteration "+i+" of testing the method raised to the power of 3 with: "+ numberDouble);
			assertEquals(Math.round(ca.raisedToThePowerOf3(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testRaisedToPowerOf3WithZero() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*0));
			result = Math.pow(numberDouble, 3);

			LOG.info("Iteration "+i+" of testing the method raised to the power of 3 with zero.");
			assertEquals(Math.round(ca.raisedToThePowerOf3(numberDouble)), Math.round(result),1);

		}
	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR SQUARE ROOT
	 */

	@Test
	public void testSquareRootPositiveNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.sqrt(numberDouble);

			LOG.info("Iteration "+i+" of testing the method square root of a double number with: "+ numberDouble);
			assertEquals(Math.round(ca.squareRoot(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testSquareRootNegativeNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = Math.sqrt(numberDouble);

			LOG.info("Iteration "+i+" of testing the method square root of a double number with: "+ numberDouble);
			assertEquals(Math.round(ca.squareRoot(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testSquareRooWithZero() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*0));
			result = Math.sqrt(numberDouble);

			LOG.info("Iteration "+i+" of testing the method square root with zero.");
			assertEquals(Math.round(ca.squareRoot(numberDouble)), Math.round(result),1);

		}
	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR CUBE ROOT
	 */

	@Test
	public void testCubeRootPositiveNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.cbrt(numberDouble);

			LOG.info("Iteration "+i+" of testing the method cube root of a double number with: "+ numberDouble);
			assertEquals(Math.round(ca.cubeRoot(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testCubeRootNegativeNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = Math.cbrt(numberDouble);

			LOG.info("Iteration "+i+" of testing the method cube root of a double number with: "+ numberDouble);
			assertEquals(Math.round(ca.cubeRoot(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testCubeRooWithZero() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*0));
			result = Math.cbrt(numberDouble);

			LOG.info("Iteration "+i+" of testing the method cube root with zero.");
			assertEquals(Math.round(ca.cubeRoot(numberDouble)), Math.round(result),1);

		}
	}


	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR ABSOLUTE VALUE
	 */

	@Test
	public void testAbsoluteValuePositiveNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.abs(numberDouble);

			LOG.info("Iteration "+i+" of testing the method absolute value with: "+ numberDouble);
			assertEquals(Math.round(ca.absoluteValue(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testAbsoluteValueNegativeNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = Math.abs(numberDouble);

			LOG.info("Iteration "+i+" of testing the method absolute value with: "+ numberDouble);
			assertEquals(Math.round(ca.absoluteValue(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testAbsoluteValueWithZero() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*0));
			result = Math.abs(numberDouble);

			LOG.info("Iteration "+i+" of testing the method cube root with zero.");
			assertEquals(Math.round(ca.absoluteValue(numberDouble)), Math.round(result),1);

		}
	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR 1 DIVIDED BY VALUE
	 */

	@Test
	public void test1DividedByPositiveNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*100));
			result = 1/numberDouble;

			LOG.info("Iteration "+i+" of testing the method division of 1 by value with: "+ numberDouble);
			assertEquals(Math.round(ca.oneDividedBy(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void test1DividedByNegativeNumbers() {

		double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			numberDouble = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = 1/numberDouble;

			LOG.info("Iteration "+i+" of testing the method division of 1 by value with: "+ numberDouble);
			assertEquals(Math.round(ca.oneDividedBy(numberDouble)), Math.round(result),1);

		}
	}

	@Test
	public void testDivideZeros() {
		// Iteration "+i+" of testing the case 1 / 0
		double doubleNumber = 0.0;
		double result = -0.1234506789;

		LOG.info("Testing the method 1 diveded by zero");
		assertEquals(Math.round(ca.oneDividedBy(doubleNumber)), Math.round(result),1);

	}

	/*
	 * IMPLEMENTATION OF THE TEST METHODS FOR RANDOM VALUE BETWEEN 0 AND 1
	 */
	
	@Test
	public void testRandomValuePositiveNumbers() {

		//double numberDouble = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			//numberDouble = Double.valueOf(df.format(random.nextDouble()));
			result = Math.random();

			LOG.info("Iteration "+i+" of testing the method random value between 0 and 1");
			assertEquals(Math.round(ca.randomNumberBetween0and1()), Math.round(result),1);

		}
	}
	
}
