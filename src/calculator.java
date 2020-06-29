import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer, number;
	int operation;
	static Color color1 = new Color(163, 228, 215);
	static Color color2 = new Color(213, 245, 227);
	static Color color3 = new Color(212, 239, 223);

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void calculate() throws Exception {
		switch (operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			if (Double.parseDouble(input.getText()) == 0) {
				input.setText("ERROR");
				number = 0;
				throw new Exception();
			} else {
				answer = number / Double.parseDouble(input.getText());
				input.setText(Double.toString(answer));
			}
			break;
		}
	}

	public void addInput(String str) {
		input.setText(input.getText() + str);

	}

	public calculator() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("HESAP MAK\u0130NES\u0130");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		getContentPane().setBackground(color1);

		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 374, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		screen.setBackground(color1);

		JLabel lbl = new JLabel("");
		lbl.setBounds(104, 0, 270, 24);
		screen.add(lbl);
		lbl.setBackground(color3);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);

		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 26, 374, 34);
		screen.add(input);
		input.setColumns(10);

		JPanel control = new JPanel();
		control.setBackground(color1);
		control.setBounds(10, 78, 374, 382);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));

		JButton btn8 = new JButton("8");
		btn8.setBackground(color2);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});

		JButton btn7 = new JButton("7");
		btn7.setBackground(color2);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn7);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(color2);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn9);

		JButton btnTopla = new JButton("+");
		btnTopla.setBackground(color3);
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnTopla.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnTopla);

		JButton btn4 = new JButton("4");
		btn4.setBackground(color2);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(color2);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(color2);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn6);

		JButton btnCikar = new JButton("-");
		btnCikar.setBackground(color3);
		btnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnCikar.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnCikar);

		JButton btn1 = new JButton("1");
		btn1.setBackground(color2);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(color2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(color2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn3);

		JButton btnCarp = new JButton("*");
		btnCarp.setBackground(color3);
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnCarp.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnCarp);

		JButton btn0 = new JButton("0");
		btn0.setBackground(color2);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btn0);

		JButton btnEsittir = new JButton("=");
		btnEsittir.setBackground(color3);
		btnEsittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calculate();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lbl.setText("");
			}
		});
		btnEsittir.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnEsittir);

		JButton btnC = new JButton("C");
		btnC.setBackground(color3);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnC);

		JButton btnBol = new JButton("/");
		btnBol.setBackground(color3);
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnBol.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnBol);

		JLabel lblCreatedSerapErel = new JLabel("Created by Serap Er\u00E7el");
		lblCreatedSerapErel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCreatedSerapErel.setBounds(143, 461, 121, 14);
		contentPane.add(lblCreatedSerapErel);
	}
}
