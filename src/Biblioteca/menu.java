package Biblioteca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton rdbtnIntroducirUnLibro = new JRadioButton("Introducir un libro");
		
		JRadioButton rdbtnEliminarLibro = new JRadioButton("Eliminar libro");
		
		JRadioButton rdbtnRegistrarUsuario = new JRadioButton("Registrar usuario");
		
		JRadioButton rdbtnEliminarUsuario = new JRadioButton("Eliminar usuario");
		
		JRadioButton rdbtnPrestarLibro = new JRadioButton("Prestar libro");
		
		JRadioButton rdbtnDevolverLibro = new JRadioButton("Devolver libro");
		
		JRadioButton rdbtnListarUsuarios = new JRadioButton("Listar usuarios");
		
		JRadioButton rdbtnListarLibros = new JRadioButton("Listar libros");
		
		JRadioButton rdbtnModificarUsuario = new JRadioButton("Modificar usuario");
		
		JRadioButton rdbtnModificarLibro = new JRadioButton("Modificar libro");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnDevolverLibro)
						.addComponent(rdbtnRegistrarUsuario)
						.addComponent(rdbtnEliminarUsuario)
						.addComponent(rdbtnPrestarLibro)
						.addComponent(rdbtnEliminarLibro)
						.addComponent(rdbtnIntroducirUnLibro)
						.addComponent(rdbtnListarUsuarios)
						.addComponent(rdbtnListarLibros)
						.addComponent(rdbtnModificarUsuario)
						.addComponent(rdbtnModificarLibro))
					.addContainerGap(278, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnIntroducirUnLibro)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(rdbtnEliminarLibro)))
					.addGap(2)
					.addComponent(rdbtnRegistrarUsuario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnEliminarUsuario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnPrestarLibro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnDevolverLibro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnListarUsuarios)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnListarLibros)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnModificarUsuario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnModificarLibro)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
