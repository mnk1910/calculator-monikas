package com.project.maven.calculator_monikas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.project.maven.calculator_monikas.classes.CalculatorAdvanced;
import com.project.maven.calculator_monikas.classes.CalculatorBasic;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;


/**
 * Main frame of the calculator GUI.
 * @author Monika - mnk1910
 * @version 1.0
 */

public class CalculatorGUI implements ActionListener{
	
	/**
	 * Attributes
	 */
	private CalculatorBasic cb = new CalculatorBasic();
	private CalculatorAdvanced ca = new CalculatorAdvanced();
	
	private JFrame frameCalculator;
	private JTextField fieldFirstNumber;
	private JTextField fieldSecondNumber;
	private JTextField fieldResult;

	private JLabel labelFirstNumber = new JLabel("First number (x):");
	private JLabel labelSecondNumber = new JLabel("Second number (y):");
	private JLabel labelResult = new JLabel("RESULT:");
	
	private JLabel labelBasic = new JLabel("Basic operations");
	private JButton btnAdd = new JButton("x+y");
	private JButton btnSubtract = new JButton("x-y");
	private JButton btnMultiply = new JButton("x*y");
	private JButton btnDivide = new JButton("x/y");

	/*
	 * advanced operations buttons
	 */
	private JLabel labelAdvanced = new JLabel("Advanced operations (\"y\" not required)");
	private JButton btnPowerOfTwo = new JButton("x\u00B2");
	private JButton btnPowerOfThree = new JButton("x\u00B3");
	private JButton btnSquareRoot = new JButton("√x");
	private JButton btnCubeRoot = new JButton("∛x");
	private JButton btnAbsoluteValue = new JButton("|x|");
	private JButton btnOneDividedBy = new JButton("1/x");
	private JButton btnRandom = new JButton("rand");
	private JButton btnClearAll = new JButton("CLEAR");

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frameCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * This is a constructor method for creating the application.
	 */
	public CalculatorGUI() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame
	 */
	private void createAndShowGUI() {
		frameCalculator = new JFrame();
		frameCalculator.getContentPane().setBackground(new Color(221, 160, 221));
		frameCalculator.setTitle("Advanced Operations Calculator");
		frameCalculator.setBounds(100, 100, 330, 330);
		frameCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCalculator.getContentPane().setLayout(null);

		fieldFirstNumber = new JTextField();
		fieldFirstNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		fieldFirstNumber.setBounds(130, 26, 150, 20);
		frameCalculator.getContentPane().add(fieldFirstNumber);
		fieldFirstNumber.setColumns(10);

		fieldSecondNumber = new JTextField();
		fieldSecondNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		fieldSecondNumber.setBounds(130, 58, 150, 20);
		frameCalculator.getContentPane().add(fieldSecondNumber);
		fieldSecondNumber.setColumns(10);

		fieldResult = new JTextField();
		fieldResult.setBounds(74, 90, 206, 20);
		frameCalculator.getContentPane().add(fieldResult);
		fieldResult.setColumns(10);

		labelFirstNumber.setBounds(10, 30, 125, 14);
		labelSecondNumber.setBounds(10, 61, 125, 14);
		labelResult.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		labelResult.setBounds(10, 93, 150, 14);
		
		labelBasic.setBounds(10, 122, 135, 14);

		btnAdd.setBounds(10, 142, 64, 23);
		btnSubtract.setBounds(80, 142, 64, 23);
		btnMultiply.setBounds(150, 142, 64, 23);
		btnDivide.setBounds(220, 142, 64, 23);

		labelAdvanced.setBounds(10, 177, 260, 14);

		btnPowerOfTwo.setBounds(10, 199, 64, 23);
		btnPowerOfThree.setBounds(80, 199, 64, 23);
		btnSquareRoot.setBounds(150, 199, 64, 23);
		btnCubeRoot.setBounds(220, 199, 64, 23);

		btnAbsoluteValue.setBounds(10, 229, 64, 23);
		btnOneDividedBy.setBounds(80, 229, 64, 23);
		btnRandom.setBounds(150, 229, 64, 23);
		btnClearAll.setBounds(220, 229, 64, 23);

		frameCalculator.setVisible(true);
	}

	/**
	 * Method that adds components to the frame.
	 */
	public void addComponentsToFrame(){
		frameCalculator.getContentPane().add(labelFirstNumber);
		frameCalculator.getContentPane().add(labelSecondNumber);
		frameCalculator.getContentPane().add(labelResult);
		
		frameCalculator.getContentPane().add(labelBasic);
		frameCalculator.getContentPane().add(btnAdd);
		frameCalculator.getContentPane().add(btnSubtract);
		frameCalculator.getContentPane().add(btnMultiply);
		frameCalculator.getContentPane().add(btnDivide);

		frameCalculator.getContentPane().add(labelAdvanced);
		frameCalculator.getContentPane().add(btnPowerOfTwo);
		frameCalculator.getContentPane().add(btnPowerOfThree);
		frameCalculator.getContentPane().add(btnSquareRoot);
		frameCalculator.getContentPane().add(btnCubeRoot);
		frameCalculator.getContentPane().add(btnAbsoluteValue);
		frameCalculator.getContentPane().add(btnOneDividedBy);
		frameCalculator.getContentPane().add(btnRandom);
		
		frameCalculator.getContentPane().add(btnClearAll);
		
	}

	/**
	 * Method for adding action listeners.
	 */
	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		//advanced operations
		btnPowerOfTwo.addActionListener(this);
		btnPowerOfThree.addActionListener(this);
		btnSquareRoot.addActionListener(this);
		btnCubeRoot.addActionListener(this);
		btnAbsoluteValue.addActionListener(this);
		btnOneDividedBy.addActionListener(this);
		btnRandom.addActionListener(this);
		
		btnClearAll.addActionListener(this);
	}

	/**
	 * Method that gets the value written in the first number, or (x), text field
	 * @return firstNumber: a double that is written by the user in the text field corresponding to the first number
	 **/
	public double getValueFromTextField1(){
		double firstNumber = 0.0;
		firstNumber = Double.valueOf(fieldFirstNumber.getText());
		return firstNumber;
	}

	/**
	 * Method that gets the value written in the second number, or (y), text field
	 * @return secondNumber: a double that is written by the user in the text field corresponding to the second number
	 */
	public double getValueFromTextField2(){
		double secondNumber = 0.0;
		secondNumber = Double.valueOf(fieldSecondNumber.getText());
		return secondNumber;
	}
	
	/**
	 * Method that performs actions when the buttons are clicked.
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else if (fieldSecondNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (y), please enter the second number if you want to perform a basic operation.\nOtherwise you can proceed with an advanced operation, no (y) required).");
			}
			else {
				double result = cb.add(getValueFromTextField1(), getValueFromTextField2());
				fieldResult.setText(Double.toString(result));
			}
		}
		
		if (e.getSource() == btnSubtract){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else if (fieldSecondNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (y), please enter the second number if you want to perform a basic operation.\nOtherwise you can proceed with an advanced operation, no (y) required).");
			}
			else {
				double result = cb.subtract(getValueFromTextField1(), getValueFromTextField2());
				fieldResult.setText(Double.toString(result));
			}
		}

		if (e.getSource() == btnMultiply){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else if (fieldSecondNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (y), please enter the second number if you want to perform a basic operation.\nOtherwise you can proceed with an advanced operation, no (y) required).");
			}
			else {
				double result = cb.multiply(getValueFromTextField1(), getValueFromTextField2());
				fieldResult.setText(Double.toString(result));
			}
		}

		if (e.getSource() == btnDivide){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else if (fieldSecondNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (y), please enter the second number if you want to perform a basic operation.\nOtherwise you can proceed with an advanced operation, no (y) required).");
			}
			else if (getValueFromTextField2() == 0) {
				fieldResult.setText("Error - division by zero");	
			}
			else {
				double result = cb.divide(getValueFromTextField1(), getValueFromTextField2());
				fieldResult.setText(Double.toString(result));
			}
		}

		/*
		 * advanced operations
		 */

		if (e.getSource() == btnPowerOfTwo){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else {
				double result = ca.raisedToThePowerOf2(getValueFromTextField1());
				fieldResult.setText(Double.toString(result));
			}
		}

		if (e.getSource() == btnPowerOfThree){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else {	
				double result = ca.raisedToThePowerOf3(getValueFromTextField1());
				fieldResult.setText(Double.toString(result));
			}
		}

		if (e.getSource() == btnSquareRoot){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else {
				double result = ca.squareRoot(getValueFromTextField1());
				if (result == -0.123456789) {
					fieldResult.setText("Error - negative number");
				}
				else {
					fieldResult.setText(Double.toString(result));
				}
			}
		}

		if (e.getSource() == btnCubeRoot){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else {
				double result = ca.cubeRoot(getValueFromTextField1());
				fieldResult.setText(Double.toString(result));
			}
		}

		if (e.getSource() == btnAbsoluteValue){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else {
				double result = ca.absoluteValue(getValueFromTextField1());
				fieldResult.setText(Double.toString(result));
			}
		}

		if (e.getSource() == btnOneDividedBy){
			if (fieldFirstNumber.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Empty field for (x), please enter the first number if you want to perform any operation.");
			}
			else {
				double result = ca.oneDividedBy(getValueFromTextField1());
				if (result == -0.123456789) {
					fieldResult.setText("Error - division by zero");
				}
				else {
					fieldResult.setText(Double.toString(result));
				}
			}
		}
		
		if (e.getSource() == btnRandom){
			fieldResult.setText(Double.toString(ca.randomNumberBetween0and1()));
			fieldFirstNumber.setText("");
			fieldSecondNumber.setText("");
		}
		
		if (e.getSource() == btnClearAll){
			fieldFirstNumber.setText("");
			fieldSecondNumber.setText("");
			fieldResult.setText("");
		}
		
	}
}
