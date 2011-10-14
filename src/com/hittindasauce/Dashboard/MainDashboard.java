package com.hittindasauce.Dashboard;

/*
 * Copyright 2011  Wayne Krug
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class MainDashboard {

	private JFrame frmBbqThermocoupleDashboard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashboard window = new MainDashboard();
					window.frmBbqThermocoupleDashboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBbqThermocoupleDashboard = new JFrame();
		frmBbqThermocoupleDashboard.setTitle("BBQ Thermocouple Dashboard");
		frmBbqThermocoupleDashboard.setResizable(false);
		frmBbqThermocoupleDashboard.setBounds(100, 100, 360, 420);
		frmBbqThermocoupleDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBbqThermocoupleDashboard.getContentPane().setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField.setText("0000.000");
		formattedTextField.setEditable(false);
		formattedTextField.setBounds(132, 12, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField);
		
		JButton btnNewButton = new JButton("History");
		btnNewButton.setToolTipText("Display full time history data for this thermocouple");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(238, 12, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(btnNewButton);
		
		JLabel lblThermocouple = new JLabel("Thermocouple 1");
		lblThermocouple.setBounds(12, 17, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("0000.000");
		formattedTextField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_1.setEditable(false);
		formattedTextField_1.setBounds(132, 49, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_1);
		
		JButton button = new JButton("History");
		button.setToolTipText("Display full time history data for this thermocouple");
		button.setBounds(238, 49, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button);
		
		JLabel lblThermocouple_1 = new JLabel("Thermocouple 2");
		lblThermocouple_1.setBounds(12, 54, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("0000.000");
		formattedTextField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_2.setEditable(false);
		formattedTextField_2.setBounds(132, 86, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_2);
		
		JButton button_1 = new JButton("History");
		button_1.setToolTipText("Display full time history data for this thermocouple");
		button_1.setBounds(238, 86, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_1);
		
		JLabel lblThermocouple_2 = new JLabel("Thermocouple 3");
		lblThermocouple_2.setBounds(12, 91, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setText("0000.000");
		formattedTextField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_3.setEditable(false);
		formattedTextField_3.setBounds(132, 123, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_3);
		
		JButton button_2 = new JButton("History");
		button_2.setToolTipText("Display full time history data for this thermocouple");
		button_2.setBounds(238, 123, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_2);
		
		JLabel lblThermocouple_3 = new JLabel("Thermocouple 4");
		lblThermocouple_3.setBounds(12, 128, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_3);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setText("0000.000");
		formattedTextField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_4.setEditable(false);
		formattedTextField_4.setBounds(132, 160, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_4);
		
		JButton button_3 = new JButton("History");
		button_3.setToolTipText("Display full time history data for this thermocouple");
		button_3.setBounds(238, 160, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_3);
		
		JLabel lblThermocouple_4 = new JLabel("Thermocouple 5");
		lblThermocouple_4.setBounds(12, 165, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_4);
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		formattedTextField_5.setText("0000.000");
		formattedTextField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_5.setEditable(false);
		formattedTextField_5.setBounds(132, 197, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_5);
		
		JButton button_4 = new JButton("History");
		button_4.setToolTipText("Display full time history data for this thermocouple");
		button_4.setBounds(238, 197, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_4);
		
		JLabel lblThermocouple_5 = new JLabel("Thermocouple 6");
		lblThermocouple_5.setBounds(12, 202, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_5);
		
		JFormattedTextField formattedTextField_6 = new JFormattedTextField();
		formattedTextField_6.setText("0000.000");
		formattedTextField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_6.setEditable(false);
		formattedTextField_6.setBounds(132, 234, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_6);
		
		JButton button_5 = new JButton("History");
		button_5.setToolTipText("Display full time history data for this thermocouple");
		button_5.setBounds(238, 234, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_5);
		
		JLabel lblThermocouple_6 = new JLabel("Thermocouple 7");
		lblThermocouple_6.setBounds(12, 239, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_6);
		
		JFormattedTextField formattedTextField_7 = new JFormattedTextField();
		formattedTextField_7.setText("0000.000");
		formattedTextField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_7.setEditable(false);
		formattedTextField_7.setBounds(132, 271, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_7);
		
		JButton button_6 = new JButton("History");
		button_6.setToolTipText("Display full time history data for this thermocouple");
		button_6.setBounds(238, 271, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_6);
		
		JLabel lblThermocouple_7 = new JLabel("Thermocouple 8");
		lblThermocouple_7.setBounds(12, 276, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblThermocouple_7);
		
		JFormattedTextField formattedTextField_8 = new JFormattedTextField();
		formattedTextField_8.setText("0000.000");
		formattedTextField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_8.setEditable(false);
		formattedTextField_8.setBounds(132, 308, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(formattedTextField_8);
		
		JButton button_7 = new JButton("History");
		button_7.setToolTipText("Display full time history data for the ambient temperature sensor");
		button_7.setBounds(238, 308, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(button_7);
		
		JLabel lblAmbient = new JLabel("Ambient");
		lblAmbient.setBounds(12, 313, 120, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblAmbient);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 345, 360, 2);
		frmBbqThermocoupleDashboard.getContentPane().add(separator);
		
		JLabel lblUpdateRate = new JLabel("Update rate");
		lblUpdateRate.setBounds(12, 361, 80, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblUpdateRate);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Float(1), new Float(1), new Float(10), new Float(1)));
		spinner.setBounds(110, 359, 67, 20);
		frmBbqThermocoupleDashboard.getContentPane().add(spinner);
		
		JLabel lblSecond = new JLabel("seconds");
		lblSecond.setBounds(180, 361, 52, 15);
		frmBbqThermocoupleDashboard.getContentPane().add(lblSecond);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(238, 356, 94, 25);
		frmBbqThermocoupleDashboard.getContentPane().add(btnChange);
	}
}
