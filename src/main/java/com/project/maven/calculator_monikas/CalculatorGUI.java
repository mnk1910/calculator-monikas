package com.project.maven.calculator_monikas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.project.maven.calculator_monikas.classes.CalculatorAdvanced;
import com.project.maven.calculator_monikas.classes.CalculatorBasic;

import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalculatorGUI implements ActionListener{
	private JFrame frmCalculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;

	private CalculatorBasic cb = new CalculatorBasic();
	private CalculatorAdvanced ca = new CalculatorAdvanced();

	private JLabel lblResult = new JLabel("Result:");

	private JLabel lblFirstNumber = new JLabel("x:");
	private JLabel lblSecondNumber = new JLabel("y:");

	private JLabel lblBasic = new JLabel("Basic operations");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");

	/*
	 * new buttons
	 */

	private JLabel lblAdvanced = new JLabel("Advanced operations (\"y\" not required)");
	private JButton btnPowerOfTwo = new JButton("x\u00B2");
	private JButton btnPowerOfThree = new JButton("x\u00B3");
	private JButton btnSquareRoot = new JButton("√x");
	private JButton btnCubeRoot = new JButton("∛x");
	private JButton btnAbsoluteValue = new JButton("|x|");
	private JButton btnOneDividedBy = new JButton("1/x");

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createAndShowGUI() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.MAGENTA);
		frmCalculator.setTitle("Advanced Operations Calculator");
		frmCalculator.setBounds(100, 100, 330, 330);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 108, 20);
		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);

		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 108, 20);
		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);

		lblFirstNumber.setBounds(10, 30, 96, 14);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		lblResult.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblResult.setBounds(10, 86, 223, 14);

		lblBasic.setBounds(10, 109, 135, 14);

		btnAdd.setBounds(10, 139, 47, 23);
		btnSubtract.setBounds(67, 139, 48, 23);
		btnMultiply.setBounds(125, 139, 47, 23);
		btnDivide.setBounds(182, 139, 37, 23);

		lblAdvanced.setBounds(10, 169, 275, 14);

		btnPowerOfTwo.setBounds(10, 199, 47, 23);
		btnPowerOfThree.setBounds(67, 199, 48, 23);
		btnSquareRoot.setBounds(125, 199, 47, 23);
		btnCubeRoot.setBounds(182, 199, 37, 23);

		btnAbsoluteValue.setBounds(10, 229, 47, 23);
		btnOneDividedBy.setBounds(67, 229, 48, 23);

		frmCalculator.setVisible(true);
	}

	/**
	 * Adding components to frame.
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame(){
		frmCalculator.getContentPane().add(lblFirstNumber);
		frmCalculator.getContentPane().add(lblSecondNumber);
		frmCalculator.getContentPane().add(lblResult);
		frmCalculator.getContentPane().add(lblBasic);
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnSubtract);
		frmCalculator.getContentPane().add(btnMultiply);
		frmCalculator.getContentPane().add(btnDivide);

		frmCalculator.getContentPane().add(lblAdvanced);
		frmCalculator.getContentPane().add(btnPowerOfTwo);
		frmCalculator.getContentPane().add(btnPowerOfThree);
		frmCalculator.getContentPane().add(btnSquareRoot);
		frmCalculator.getContentPane().add(btnCubeRoot);
		frmCalculator.getContentPane().add(btnAbsoluteValue);
		frmCalculator.getContentPane().add(btnOneDividedBy);
	}


	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);

		/*
		 * new listeners
		 */
		btnPowerOfTwo.addActionListener(this);
		btnPowerOfThree.addActionListener(this);
		btnSquareRoot.addActionListener(this);
		btnCubeRoot.addActionListener(this);
		btnAbsoluteValue.addActionListener(this);
		btnOneDividedBy.addActionListener(this);
	}


	/**
	 *
	 * get value from text field
	 *
	 * @return firstNUmber - Number that is written in the textfield
	 **/
	public double getValueFromTextField1(){
		double firstNumber = 0.0;
		firstNumber = Double.valueOf(txfFirstNumber.getText());
		return firstNumber;
	}

	public double getValueFromTextField2(){
		double secondNumber = 0.0;
		secondNumber = Double.valueOf(txfSecondNumber.getText());
		return secondNumber;
	}



	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd){
			double result = cb.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnSubtract){
			double result = cb.subtract(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnMultiply){
			double result = cb.multiply(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnDivide){
			if (getValueFromTextField2() != 0) {
				double result = cb.divide(getValueFromTextField1(), getValueFromTextField2());
				lblResult.setText("Result: "+result);
			}
			else {
				lblResult.setText("Result: ERROR-division by zero!");
			}
		}

		/*
		 * new advanced functions
		 */

		if (e.getSource() == btnPowerOfTwo){
			double result = ca.raisedToThePowerOf2(getValueFromTextField1());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnPowerOfThree){
			double result = ca.raisedToThePowerOf3(getValueFromTextField1());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnSquareRoot){
			double result = ca.squareRoot(getValueFromTextField1());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnCubeRoot){
			double result = ca.cubeRoot(getValueFromTextField1());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnAbsoluteValue){
			double result = ca.absoluteValue(getValueFromTextField1());
			lblResult.setText("Result: "+result);
		}

		if (e.getSource() == btnOneDividedBy){
			double result = ca.oneDividedBy(getValueFromTextField1());
			if (result != -0.123456789) {
				lblResult.setText("Result: "+result);
			}
			else {
				lblResult.setText("Result: ERROR-division by zero!");
			}
		}

	}

}
