package payrollgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myroll {

	private JFrame frmSimple;
	private JTextField textFieldEmpName;
	private JTextField textFieldRatePerHr;
	private JTextField textFieldHrsPerDay;
	private JTextField textFieldNoOfDaysWrkd;
	private JTextField textFieldfifteenwage;
	private JTextField textFieldfivephil;
	private JTextField textFieldtwosss;
	private JTextField textFieldgross;
	private JTextField textFielddeduct;
	private JTextField textFieldmaingross;
	private JTextField textFieldtotdeduct;
	private JTextField textFieldnetsalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myroll window = new myroll();
					window.frmSimple.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimple = new JFrame();
		frmSimple.setBounds(100, 100, 835, 395);
		frmSimple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimple.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(284, 10, 217, 36);
		frmSimple.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name");
		lblNewLabel_1.setBounds(31, 65, 82, 13);
		frmSimple.getContentPane().add(lblNewLabel_1);
		
		textFieldEmpName = new JTextField();
		textFieldEmpName.setBounds(159, 62, 96, 19);
		frmSimple.getContentPane().add(textFieldEmpName);
		textFieldEmpName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Rate Per Hour");
		lblNewLabel_2.setBounds(31, 101, 82, 13);
		frmSimple.getContentPane().add(lblNewLabel_2);
		
		textFieldRatePerHr = new JTextField();
		textFieldRatePerHr.setBounds(159, 98, 96, 19);
		frmSimple.getContentPane().add(textFieldRatePerHr);
		textFieldRatePerHr.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Hours Per Day");
		lblNewLabel_3.setBounds(31, 139, 82, 13);
		frmSimple.getContentPane().add(lblNewLabel_3);
		
		textFieldHrsPerDay = new JTextField();
		textFieldHrsPerDay.setBounds(159, 136, 96, 19);
		frmSimple.getContentPane().add(textFieldHrsPerDay);
		textFieldHrsPerDay.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Days Worked");
		lblNewLabel_4.setBounds(31, 174, 122, 13);
		frmSimple.getContentPane().add(lblNewLabel_4);
		
		textFieldNoOfDaysWrkd = new JTextField();
		textFieldNoOfDaysWrkd.setBounds(159, 171, 96, 19);
		frmSimple.getContentPane().add(textFieldNoOfDaysWrkd);
		textFieldNoOfDaysWrkd.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBackground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(344, 56, 165, 19);
		frmSimple.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tax 15% of Monthly Wage");
		lblNewLabel_6.setBounds(284, 98, 161, 19);
		frmSimple.getContentPane().add(lblNewLabel_6);
		
		textFieldfifteenwage = new JTextField();
		textFieldfifteenwage.setEditable(false);
		textFieldfifteenwage.setBounds(469, 98, 96, 19);
		frmSimple.getContentPane().add(textFieldfifteenwage);
		textFieldfifteenwage.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Philhealth 5%");
		lblNewLabel_7.setBounds(328, 139, 90, 13);
		frmSimple.getContentPane().add(lblNewLabel_7);
		
		textFieldfivephil = new JTextField();
		textFieldfivephil.setEditable(false);
		textFieldfivephil.setBounds(469, 136, 96, 19);
		frmSimple.getContentPane().add(textFieldfivephil);
		textFieldfivephil.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("SSS 2%");
		lblNewLabel_8.setBounds(335, 174, 58, 13);
		frmSimple.getContentPane().add(lblNewLabel_8);
		
		textFieldtwosss = new JTextField();
		textFieldtwosss.setEditable(false);
		textFieldtwosss.setBounds(469, 171, 96, 19);
		frmSimple.getContentPane().add(textFieldtwosss);
		textFieldtwosss.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Gross Salary:");
		lblNewLabel_9.setBounds(592, 99, 68, 16);
		frmSimple.getContentPane().add(lblNewLabel_9);
		
		textFieldgross = new JTextField();
		textFieldgross.setEditable(false);
		textFieldgross.setBounds(682, 98, 96, 19);
		frmSimple.getContentPane().add(textFieldgross);
		textFieldgross.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Deduction:");
		lblNewLabel_10.setBounds(592, 139, 68, 13);
		frmSimple.getContentPane().add(lblNewLabel_10);
		
		textFielddeduct = new JTextField();
		textFielddeduct.setEditable(false);
		textFielddeduct.setBounds(682, 136, 96, 19);
		frmSimple.getContentPane().add(textFielddeduct);
		textFielddeduct.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("GROSS SALARY");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_11.setBounds(22, 225, 113, 25);
		frmSimple.getContentPane().add(lblNewLabel_11);
		
		textFieldmaingross = new JTextField();
		textFieldmaingross.setEditable(false);
		textFieldmaingross.setBounds(159, 228, 96, 19);
		frmSimple.getContentPane().add(textFieldmaingross);
		textFieldmaingross.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("TOTAL DEDUCTION");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_12.setBounds(300, 228, 106, 19);
		frmSimple.getContentPane().add(lblNewLabel_12);
		
		textFieldtotdeduct = new JTextField();
		textFieldtotdeduct.setEditable(false);
		textFieldtotdeduct.setBounds(413, 228, 96, 19);
		frmSimple.getContentPane().add(textFieldtotdeduct);
		textFieldtotdeduct.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_13.setBounds(592, 225, 82, 19);
		frmSimple.getContentPane().add(lblNewLabel_13);
		
		textFieldnetsalary = new JTextField();
		textFieldnetsalary.setEditable(false);
		textFieldnetsalary.setBounds(682, 225, 96, 19);
		frmSimple.getContentPane().add(textFieldnetsalary);
		textFieldnetsalary.setColumns(10);
		
		JButton btncompute = new JButton("Compute");
		btncompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ratePerHour,hourPerDay,noOfDaysWorked,grossO;
				double fifteenTax,fiveTax,twoTax,deductions,netSal;
				String empName;
				ratePerHour=Integer.parseInt(textFieldRatePerHr.getText());
				hourPerDay=Integer.parseInt(textFieldHrsPerDay.getText());
				noOfDaysWorked=Integer.parseInt(textFieldNoOfDaysWrkd.getText());
			    empName=textFieldEmpName.getText();
			    grossO=ratePerHour*hourPerDay*noOfDaysWorked;
				fifteenTax=0.15*grossO;
				fifteenTax=Math.round(fifteenTax);
				textFieldfifteenwage.setText(String.valueOf(fifteenTax));
				fiveTax=0.05*grossO;
				fiveTax=Math.round(fiveTax);
				textFieldfivephil.setText(String.valueOf(fiveTax));
				twoTax=0.02*grossO;
				twoTax=Math.round(twoTax);
				textFieldtwosss.setText(String.valueOf(twoTax));
				textFieldgross.setText(String.valueOf(grossO));
				deductions=fifteenTax+fiveTax+twoTax;
				textFielddeduct.setText(String.valueOf(deductions));
				textFieldmaingross.setText(String.valueOf(grossO));
				textFieldtotdeduct.setText(String.valueOf(deductions));
				netSal=grossO-deductions;
				textFieldnetsalary.setText(String.valueOf(netSal));
			}
		});
		btncompute.setBounds(360, 301, 85, 21);
		frmSimple.getContentPane().add(btncompute);
	}
}
