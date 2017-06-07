package Biblioteca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miLibreria.Entrada;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		Entrada entrada = new Entrada();
		ListaLibro listaLibro = new ListaLibro();
		ListaUsuario listaUsuario = new ListaUsuario();
		boolean bucle = true;
		String titulo;
		String autor;
		String nomUsu;
		int ejemplares;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 349);
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
		
		JRadioButton rdbtnSalir = new JRadioButton("Salir");
		
		ButtonGroup opcion = new ButtonGroup();
		
		opcion.add(rdbtnIntroducirUnLibro);
		opcion.add(rdbtnEliminarLibro);
		opcion.add(rdbtnRegistrarUsuario);
		opcion.add(rdbtnEliminarUsuario);
		opcion.add(rdbtnPrestarLibro);
		opcion.add(rdbtnDevolverLibro);
		opcion.add(rdbtnListarUsuarios);
		opcion.add(rdbtnListarLibros);
		opcion.add(rdbtnModificarUsuario);
		opcion.add(rdbtnModificarLibro);
		opcion.add(rdbtnSalir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnIntroducirUnLibro.isSelected()) {
					try {
						IntoducirLibro frame = new IntoducirLibro(listaLibro);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
						
				}else if (rdbtnEliminarLibro.isSelected()) {
					try {
						EliminarLibro frame = new EliminarLibro(listaLibro);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
						
				}else if (rdbtnRegistrarUsuario.isSelected()) {
					try {
						RegistrarUsuario frame = new RegistrarUsuario(listaUsuario);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
						
				}else if (rdbtnEliminarUsuario.isSelected()) {
					try {
						EliminarUsuario frame = new EliminarUsuario(listaUsuario,listaLibro);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
						
				}else if (rdbtnPrestarLibro.isSelected()) {
					try {
						prestarLibro frame = new prestarLibro(listaLibro,listaUsuario);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}else if (rdbtnDevolverLibro.isSelected()) {
					try {
						DevolverLibro frame = new DevolverLibro(listaUsuario,listaLibro);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else if (rdbtnListarLibros.isSelected()) {
					try {
						ListarLibros frame = new ListarLibros(listaLibro);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}		
					
				}else if (rdbtnListarUsuarios.isSelected()) {
					try {
						ListarUsuarios frame = new ListarUsuarios(listaUsuario);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}	

						
				}else if (rdbtnModificarUsuario.isSelected()) {
					
						
				}else if (rdbtnModificarLibro.isSelected()) {
					
						
				}else if (rdbtnSalir.isSelected()) {
					
						
				}
			}
		});
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnDevolverLibro)
								.addComponent(rdbtnPrestarLibro))
							.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
							.addComponent(btnAceptar)
							.addGap(29))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnRegistrarUsuario)
								.addComponent(rdbtnEliminarUsuario)
								.addComponent(rdbtnEliminarLibro)
								.addComponent(rdbtnIntroducirUnLibro)
								.addComponent(rdbtnListarUsuarios)
								.addComponent(rdbtnListarLibros)
								.addComponent(rdbtnModificarUsuario)
								.addComponent(rdbtnModificarLibro))
							.addContainerGap(307, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnSalir)
							.addContainerGap(309, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
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
							.addComponent(rdbtnModificarLibro))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(106)
							.addComponent(btnAceptar)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnSalir)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
