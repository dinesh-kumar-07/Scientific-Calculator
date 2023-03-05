import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class scientificCalculator extends trigonometry{
	private JFrame frame;
	
	private JTextField txtTeam;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificCalculator window = new scientificCalculator();
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
	public scientificCalculator() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setTitle("Scientific Calculator");
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 18));
		frame.setBounds(100, 100, 557, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField.setBounds(34, 103, 501, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bt9 = new JButton("9");
		bt9.setEnabled(false);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt9.getText();
				textField.setText(num);
			}
		});
		bt9.setFont(new Font("Cambria", Font.BOLD, 20));
		bt9.setBounds(253, 373, 63, 49);
		frame.getContentPane().add(bt9);
		
		JButton bt8 = new JButton("8");
		bt8.setEnabled(false);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt8.getText();
				textField.setText(num);
			}
		});
		bt8.setFont(new Font("Cambria", Font.BOLD, 20));
		bt8.setBounds(326, 373, 63, 49);
		frame.getContentPane().add(bt8);
		
		JButton bt7 = new JButton("7");
		bt7.setEnabled(false);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt7.getText();
				textField.setText(num);
			}
		});
		bt7.setFont(new Font("Cambria", Font.BOLD, 20));
		bt7.setBounds(399, 373, 63, 49);
		frame.getContentPane().add(bt7);
		
		JButton bt6 = new JButton("6");
		bt6.setEnabled(false);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt6.getText();
				textField.setText(num);
			}
		});
		bt6.setFont(new Font("Cambria", Font.BOLD, 20));
		bt6.setBounds(253, 433, 63, 49);
		frame.getContentPane().add(bt6);
		
		JButton bt5 = new JButton("5");
		bt5.setEnabled(false);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt5.getText();
				textField.setText(num);
			}
		});
		bt5.setFont(new Font("Cambria", Font.BOLD, 20));
		bt5.setBounds(326, 433, 63, 49);
		frame.getContentPane().add(bt5);
		
		JButton bt4 = new JButton("4");
		bt4.setEnabled(false);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt4.getText();
				textField.setText(num);
			}
		});
		bt4.setFont(new Font("Cambria", Font.BOLD, 20));
		bt4.setBounds(399, 433, 63, 49);
		frame.getContentPane().add(bt4);
		
		JButton bt3 = new JButton("3");
		bt3.setEnabled(false);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt3.getText();
				textField.setText(num);
			}
		});
		bt3.setFont(new Font("Cambria", Font.BOLD, 20));
		bt3.setBounds(253, 493, 63, 49);
		frame.getContentPane().add(bt3);
		
		JButton bt2 = new JButton("2");
		bt2.setEnabled(false);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt2.getText();
				textField.setText(num);
			}
		});
		bt2.setFont(new Font("Cambria", Font.BOLD, 20));
		bt2.setBounds(326, 493, 63, 49);
		frame.getContentPane().add(bt2);
		
		JButton bt1 = new JButton("1");
		bt1.setEnabled(false);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt1.getText();
				textField.setText(num);
			}
		});
		bt1.setFont(new Font("Cambria", Font.BOLD, 20));
		bt1.setBounds(399, 493, 63, 49);
		frame.getContentPane().add(bt1);
		
		JButton bt0 = new JButton("0");
		bt0.setEnabled(false);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt0.getText();
				textField.setText(num);
			}
		});
		bt0.setFont(new Font("Cambria", Font.BOLD, 20));
		bt0.setBounds(253, 553, 136, 49);
		frame.getContentPane().add(bt0);
		
		JButton bt_dot = new JButton(".");
		bt_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(bt_dot);
			}
		});
		bt_dot.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_dot.setBounds(399, 553, 63, 49);
		frame.getContentPane().add(bt_dot);
		
		JButton bt_mul = new JButton("\u00D7");
		bt_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_mul;
			}
		});
		bt_mul.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_mul.setBounds(472, 373, 63, 49);
		frame.getContentPane().add(bt_mul);
		
		JButton bt_sub = new JButton("\u2013");
		bt_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_sub;
			}
		});
		bt_sub.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_sub.setBounds(472, 433, 63, 49);
		frame.getContentPane().add(bt_sub);
		
		JButton bt_add = new JButton("+");
		bt_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_add;
			
			}
		});
		bt_add.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_add.setBounds(472, 493, 63, 49);
		frame.getContentPane().add(bt_add);
		
		JButton bt_eq = new JButton("=");
		bt_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op==null) {
					textField.setText(String.valueOf(result));
				}
				else {
					secondNum=getNum();
				    doOperation(op);
				}   
				
			if(r2==f)
			{
				textview.setText(operator1+" = "+result);
			}
			else if(r1==f)
			{
				if(r1==f)
				{
					textview.setText(operator2+" = "+result);
					textField.setText(String.valueOf(result));
				}
				else {textview.setText(operator2+" = "+result);}
			}
			
			else
			{
				textview.setText("SYNTAX ERROR");
			}
			}
		});
		bt_eq.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_eq.setBounds(472, 553, 63, 49);
		frame.getContentPane().add(bt_eq);
		
		JButton bt_divide = new JButton("\u00F7");
		bt_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_divide;
			}
		});
		bt_divide.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_divide.setBounds(472, 313, 63, 49);
		frame.getContentPane().add(bt_divide);
		
		JButton btbackspace = new JButton("\uF0E7");
		btbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btbackspace.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btbackspace.setBounds(399, 313, 63, 49);
		frame.getContentPane().add(btbackspace);
		
		JButton bt_mod = new JButton("%");
		bt_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_mod;
			}
		});
		bt_mod.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_mod.setBounds(326, 316, 63, 49);
		frame.getContentPane().add(bt_mod);
		
		JButton btln = new JButton("ln");
		btln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("ln");
			}
		});
		btln.setFont(new Font("Cambria", Font.PLAIN, 20));
		btln.setBounds(253, 313, 63, 49);
		frame.getContentPane().add(btln);
		
		JButton btsqrt = new JButton("\u221A");
		btsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("sqrt");
			}
		});
		btsqrt.setFont(new Font("Cambria", Font.PLAIN, 20));
		btsqrt.setBounds(253, 252, 63, 49);
		frame.getContentPane().add(btsqrt);
		
		JButton btlog = new JButton("log");
		btlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("log");
			}
		});
		btlog.setFont(new Font("Cambria", Font.PLAIN, 18));
		btlog.setBounds(180, 313, 63, 49);
		frame.getContentPane().add(btlog);
		
		JButton btsqr = new JButton("x\u00B2");
		btsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("x^2");
			}
		});
		btsqr.setFont(new Font("Cambria", Font.PLAIN, 20));
		btsqr.setBounds(180, 373, 63, 49);
		frame.getContentPane().add(btsqr);
		
		JButton btcube = new JButton("x\u00B3");
		btcube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("x^3");
			}
		});
		btcube.setFont(new Font("Cambria", Font.PLAIN, 20));
		btcube.setBounds(180, 433, 63, 49);
		frame.getContentPane().add(btcube);
		
		JButton btex = new JButton("e\u02E3");
		btex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("exp");
			}
		});
		btex.setFont(new Font("Cambria", Font.PLAIN, 20));
		btex.setBounds(107, 433, 63, 49);
		frame.getContentPane().add(btex);
		
		JButton btpower = new JButton("x\u02B8");
		btpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btpower;
			}
		});
		btpower.setFont(new Font("Cambria", Font.PLAIN, 20));
		btpower.setBounds(180, 493, 63, 49);
		frame.getContentPane().add(btpower);
		
		JButton btp2 = new JButton("2\u02E3");
		btp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("2^x");
			}
		});
		btp2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btp2.setBounds(180, 252, 63, 49);
		frame.getContentPane().add(btp2);
		
		JButton bt_fac = new JButton("x!");
		bt_fac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("xfact");
			}
		});
		bt_fac.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_fac.setBounds(180, 553, 63, 49);
		frame.getContentPane().add(bt_fac);
		
		JButton bt_rand = new JButton("rand");
		bt_rand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doOperation("random");
			}
		});
		bt_rand.setFont(new Font("Cambria", Font.PLAIN, 13));
		bt_rand.setBounds(326, 193, 63, 49);
		frame.getContentPane().add(bt_rand);
		
		JButton btpi = new JButton("\u03C0");
		btpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText()==null) {
					firstNum=1;
				}
				else 
				{
					firstNum=getNum();  
				}   
				doOperation("pi");
				
			}

			
		});
		btpi.setFont(new Font("Cambria", Font.PLAIN, 20));
		btpi.setBounds(472, 192, 63, 49);
		frame.getContentPane().add(btpi);
		
		JButton bt_modulus = new JButton("|x|");
		bt_modulus.setEnabled(true);
		bt_modulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("modulus");
			}
		});
		bt_modulus.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_modulus.setBounds(399, 252, 63, 49);
		frame.getContentPane().add(bt_modulus);
		
		JButton btinv = new JButton("inv");
		btinv.setEnabled(true);
		btinv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("inverse");
			}
		});
		btinv.setFont(new Font("Cambria", Font.PLAIN, 20));
		btinv.setBounds(472, 252, 63, 49);
		frame.getContentPane().add(btinv);
		
		JButton bt_e = new JButton("e");
		bt_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText()==null) {
					firstNum=1;
				}
				else 
				{
					firstNum=getNum();  
				}   
				doOperation("e");
				
			}
		});
		bt_e.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_e.setBounds(399, 192, 63, 49);
		frame.getContentPane().add(bt_e);
		
		JButton btp10 = new JButton("10\u02E3");
		btp10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("10^x");
			}
		});
		btp10.setFont(new Font("Cambria", Font.PLAIN, 20));
		btp10.setBounds(34, 433, 63, 49);
		frame.getContentPane().add(btp10);
		
		JButton bt_sin = new JButton("sin");
		bt_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
			doOperation("sin");	
			}
		});
		bt_sin.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_sin.setBounds(107, 252, 63, 49);
		frame.getContentPane().add(bt_sin);
		
		JButton bt_cos = new JButton("cos");
		bt_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
						doOperation("cos");
		
			}
		});
		bt_cos.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_cos.setBounds(107, 313, 63, 49);
		frame.getContentPane().add(bt_cos);
		
		JButton bt_tan = new JButton("tan");
		bt_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				
						doOperation("tan");
			
			}
		});
		bt_tan.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_tan.setBounds(107, 373, 63, 49);
		frame.getContentPane().add(bt_tan);
		
		JButton btgr = new JButton("[x]");
		btgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("floor");
			}
		});
		btgr.setFont(new Font("Cambria", Font.PLAIN, 18));
		btgr.setBounds(326, 252, 63, 49);
		frame.getContentPane().add(btgr);

		JButton btclr = new JButton(" Clear All");
		btclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);  
				textview.setText(null);
				firstNum=0;
				secondNum=0;
			}
		});
		btclr.setBounds(34, 193, 136, 48);
		frame.getContentPane().add(btclr);
	
		
		txtTeam = new JTextField();
		txtTeam.setEditable(false);
		txtTeam.setFont(new Font("Tohoma", Font.BOLD, 18));
		txtTeam.setText("Scientific Calculator");
		txtTeam.setHorizontalAlignment(SwingConstants.CENTER);
		txtTeam.setBounds(107, 0, 282, 30);
		frame.getContentPane().add(txtTeam);
		txtTeam.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("   ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
				  
					bt0.setEnabled(true);
					bt1.setEnabled(true);
					bt2.setEnabled(true);
					bt3.setEnabled(true);
					bt4.setEnabled(true);
					bt5.setEnabled(true);
					bt6.setEnabled(true);
					bt7.setEnabled(true);
					bt8.setEnabled(true);
					bt9.setEnabled(true);
					}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(180, 193, 63, 49);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("   OFF");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textview.setText(null);
			
				bt0.setEnabled(false);
				bt1.setEnabled(false);
				bt2.setEnabled(false);
				bt3.setEnabled(false);
				bt4.setEnabled(false);
				bt5.setEnabled(false);
				bt6.setEnabled(false);
				bt7.setEnabled(false);
				bt8.setEnabled(false);
				bt9.setEnabled(false);
		}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(253, 192, 63, 50);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textview = new JTextField();
		textview.setHorizontalAlignment(SwingConstants.RIGHT);
		textview.setBackground(Color.GRAY);
		textview.setForeground(Color.WHITE);
		textview.setBounds(34, 56, 501, 49);
		frame.getContentPane().add(textview);
		
		JButton btnsini = new JButton("sin'");
		btnsini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("sini");	
			}
		});
		btnsini.setFont(new Font("Cambria", Font.PLAIN, 15));
		btnsini.setBounds(33, 252, 64, 49);
		frame.getContentPane().add(btnsini);
		
		JButton btncosi = new JButton("Cos'");
		btncosi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("cosi");	
			}
		});
		btncosi.setFont(new Font("Cambria", Font.PLAIN, 14));
		btncosi.setBounds(34, 313, 63, 49);
		frame.getContentPane().add(btncosi);
		
		JButton btntani = new JButton("Tan'");
		btntani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("tani");	
			}
		});
		btntani.setBounds(34, 373, 63, 49);
		frame.getContentPane().add(btntani);
		
		JButton info = new JButton("Info");
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textview.setText("Team members: Pranav ,Harsha,Dinesh, Eswar");
				textField.setText("Done by Team 7                                Special  Thanks to Dr.Sachin kumar ");
				textField_1.setText("property belongs to batch 7 All rights reserved@2021");
			}
		});
		info.setBounds(253, 162, 63, 23);
		frame.getContentPane().add(info);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(34, 546, 136, 30);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USD TO INR", "INR TO USD", "KMPH TO MPS", "Rad To Deg"}));
		comboBox.setBounds(34, 493, 136, 49);
		frame.getContentPane().add(comboBox);
		
		JButton btconvert = new JButton("Convert");
		btconvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				Double value;
				if(comboBox.getSelectedItem().toString() == "USD TO INR") {
					value=73.92*firstNum;
					textField_1.setText(String.valueOf(value));
					}
				else if(comboBox.getSelectedItem().toString() == "INR TO USD") {
					value=0.014*firstNum;
					textField_1.setText(String.valueOf(value));                                           // The conversion of currency as of 28/02/2021 12:03:15
					}
				else if(comboBox.getSelectedItem().toString() == "KMPH TO MPS") {
					value=0.27777778*firstNum;
					textField_1.setText(String.valueOf(value));
					}
				else if(comboBox.getSelectedItem().toString() == "Rad To Deg") {
					value=57.2957795*firstNum;
					textField_1.setText(String.valueOf(value));
					}
			}
		});
		btconvert.setBounds(33, 579, 137, 23);
		frame.getContentPane().add(btconvert);
		
		
		textview.setColumns(10);
		textview.setEnabled(true);
		textview.setEditable(false);
		textview.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		textview.setColumns(8);
	}
}
