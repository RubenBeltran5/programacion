package pruebaseclipse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
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
	public Ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setBounds(0, 0, 434, 33);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(67, 54, 226));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre departamento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(39, 120, 120, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setForeground(new Color(255, 255, 128));
		panel.setBounds(20, 61, 385, 145);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 56, 224, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 87, 224, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad departamento:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 90, 129, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Código departamento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(19, 26, 120, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(255, 128, 192));
		textField.setBounds(149, 23, 50, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(59, 227, 120, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTON LIMPIAR");
			}
		});
		btnLimpiarDatos.setFont(btnLimpiarDatos.getFont().deriveFont(btnLimpiarDatos.getFont().getStyle() | Font.BOLD));
		btnLimpiarDatos.setBounds(278, 227, 111, 23);
		frame.getContentPane().add(btnLimpiarDatos);
	}
}