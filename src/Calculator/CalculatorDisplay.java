package Calculator;

import java.awt.EventQueue;
import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class CalculatorDisplay {

	private JFrame frame;
	private JTextField num2Field;
	private JTextField num1Field;
	private JTextField answerField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorDisplay window = new CalculatorDisplay();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2;
				int sum;
				try {
					num1 = Integer.parseInt(num1Field.getText());
					num2 = Integer.parseInt(num2Field.getText());
					
					sum = num1 + num2;
					
					answerField.setText(Integer.toString(sum));
					
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnPlus.setBackground(Color.CYAN);
		btnPlus.setBounds(10, 205, 52, 23);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2;
				int difference;
				try {
					num1 = Integer.parseInt(num1Field.getText());
					num2 = Integer.parseInt(num2Field.getText());
					
					difference = num1 - num2;
					
					answerField.setText(Integer.toString(difference));
					
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnMinus.setBackground(Color.CYAN);
		btnMinus.setBounds(72, 205, 52, 23);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2;
				int product;
				try {
					num1 = Integer.parseInt(num1Field.getText());
					num2 = Integer.parseInt(num2Field.getText());
					
					product = num1 * num2;
					
					answerField.setText(Integer.toString(product));
					
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnMultiply.setBackground(Color.CYAN);
		btnMultiply.setBounds(134, 205, 52, 23);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2;
				int quotient;
				try {
					num1 = Integer.parseInt(num1Field.getText());
					num2 = Integer.parseInt(num2Field.getText());
					
					quotient = num1 / num2;
					
					answerField.setText(Integer.toString(quotient));
					
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnDivide.setBackground(Color.CYAN);
		btnDivide.setBounds(196, 205, 52, 23);
		frame.getContentPane().add(btnDivide);
		
		num2Field = new JTextField();
		num2Field.setBounds(120, 118, 100, 64);
		frame.getContentPane().add(num2Field);
		num2Field.setColumns(10);
		
		num1Field = new JTextField();
		num1Field.setColumns(10);
		num1Field.setBounds(10, 118, 100, 64);
		frame.getContentPane().add(num1Field);
		
		answerField = new JTextField();
		answerField.setBounds(262, 118, 162, 64);
		frame.getContentPane().add(answerField);
		answerField.setColumns(10);
		
		JButton btnPower = new JButton("^");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base;
				double exponent;
				double ans;
				
				try {
					base = Integer.parseInt(num1Field.getText());
					exponent = Integer.parseInt(num2Field.getText());
					
					ans = (Math.pow(base, exponent));
					
					answerField.setText(Double.toString(ans));
					
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		btnPower.setBackground(Color.CYAN);
		btnPower.setBounds(258, 205, 52, 23);
		frame.getContentPane().add(btnPower);
		
		JButton btnSqRoot = new JButton("√");
		btnSqRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base;
				double ans;
				
				
				try {
					base = Integer.parseInt(num1Field.getText());
					
					ans = (Math.sqrt(base));
					
					answerField.setText(Double.toString(ans));
					
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnSqRoot.setBackground(Color.CYAN);
		btnSqRoot.setBounds(320, 205, 52, 23);
		frame.getContentPane().add(btnSqRoot);
	}
}
