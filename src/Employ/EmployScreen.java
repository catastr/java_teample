package Employ;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;


@SuppressWarnings("serial")
public class EmployScreen extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployScreen frame = new EmployScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployScreen() {
		TableData td = new TableData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1189, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 251, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1149, 310);
		contentPane.add(panel);
		
		
		table = new JTable(td);
		table.setBounds(12, 12, 1115, 270);
		table.setRowHeight(30);
		table.setPreferredScrollableViewportSize(new Dimension(1115,250));
		panel.add(new JScrollPane(table));
		panel.setOpaque(false);
		
		JButton btnNewButton = new JButton("\uBA54\uC778 \uD654\uBA74");
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		btnNewButton.setBounds(950, 440, 156, 56);
		contentPane.add(btnNewButton);
		
		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(247, 239, 229));
		header.setForeground(new Color(0,0,0));
		header.setFont(new Font("Sansserif",Font.BOLD,15));
	}
}
