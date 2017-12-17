package com.project.maven.calculator_monikas;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.project.maven.calculator_monikas.classes.CalculatorBasic;

public class CalculatorBasicTest {

	private static final Logger LOG = Logger.getLogger(CalculatorBasic.class.getName());
	CalculatorBasic cb = new CalculatorBasic();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR ADDITION
	 */

	@Test
	public void testAddPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber + secondNumber;

			LOG.info("Iteration "+i+" of testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.add(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testAddNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = firstNumber + secondNumber;

			LOG.info("Iteration "+i+" of testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.add(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testAddZeros() {
		// Testing the case 0 + 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method add with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(cb.add(firstNumber, secondNumber)), Math.round(result),1);


		for (int i = 0; i < 50; i++) {
			// Testing the case of 0 + (something random)
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(100)));
			result = firstNumber + secondNumber;

			LOG.info("Iteration "+i+" of testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.add(firstNumber, secondNumber)), Math.round(result),1);

			// Testing the case of (something random) + 0
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(100)));
			secondNumber = 0;
			result = firstNumber + secondNumber;

			LOG.info("Iteration "+i+" of testing the method add with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.add(firstNumber, secondNumber)), Math.round(result),1);
		}

	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR SUBTRACTION
	 */

	@Test
	public void testSubtractPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber - secondNumber;

			LOG.info("Iteration "+i+" of testing the method subtract with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.subtract(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testSubtractNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = firstNumber - secondNumber;

			LOG.info("Iteration "+i+" of testing the method subtract with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.subtract(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testSubtractZeros() {
		// Testing the case 0 - 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtract with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(cb.subtract(firstNumber, secondNumber)), Math.round(result),1);

		for (int i = 0; i < 50; i++) {
			// Testing the case of 0 - (something random)
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(100)));
			result = firstNumber - secondNumber;

			LOG.info("Iteration "+i+" of testing the method subtract with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.subtract(firstNumber, secondNumber)), Math.round(result),1);

			// Testing the case of (something random) - 0
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(100)));
			secondNumber = 0;
			result = firstNumber - secondNumber;

			LOG.info("Iteration "+i+" of testing the method subtract with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.subtract(firstNumber, secondNumber)), Math.round(result),1);

		}

	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR MULTIPLICATION
	 */

	@Test
	public void testMultiplyPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber * secondNumber;

			LOG.info("Iteration "+i+" of testing the method multiply with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.multiply(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testMultiplyNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = firstNumber * secondNumber;

			LOG.info("Iteration "+i+" of testing the method multiply with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.multiply(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testMultiplyZeros() {
		// Testing the case 0 * 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method multiply with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(cb.multiply(firstNumber, secondNumber)), Math.round(result),1);

		for (int i = 0; i < 50; i++) {
			// Testing the case of 0 * (something random)
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(100)));
			result = firstNumber * secondNumber;

			LOG.info("Iteration "+i+" of testing the method multiply with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.multiply(firstNumber, secondNumber)), Math.round(result),1);

			// Testing the case of (something random) - 0
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(100)));
			secondNumber = 0;
			result = firstNumber * secondNumber;

			LOG.info("Iteration "+i+" of testing the method multiply with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.multiply(firstNumber, secondNumber)), Math.round(result),1);

		}

	}

	/**
	 * IMPLEMENTATION OF THE TEST METHODS FOR DIVISION
	 */

	@Test
	public void testDividePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber / secondNumber;

			LOG.info("Iteration "+i+" of testing the method divide with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.divide(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testDivisionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = firstNumber / secondNumber;

			LOG.info("Iteration "+i+" of testing the method divide with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.divide(firstNumber, secondNumber)), Math.round(result),1);

		}
	}

	@Test
	public void testDivideZeros() {
		// Testing the case 0 / 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;

		LOG.info("Testing the method divide with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(cb.divide(firstNumber, secondNumber)), Math.round(result),1);


		for (int i = 0; i < 50; i++) {
			// Testing the case of (Random something) / 0
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(1000)));
			secondNumber = 0;
			result = -0.123456789;
			LOG.info("Iteration "+i+" of testing the method divide with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.divide(firstNumber, secondNumber)), Math.round(result),1);

			//Testing the case of 0 / random something.
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(1000)));
			result = firstNumber / secondNumber;
			LOG.info("Iteration "+i+" of testing the method divide with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.divide(firstNumber, secondNumber)), Math.round(result),1);
		}

	}
}
