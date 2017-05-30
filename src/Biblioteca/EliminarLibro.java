package Biblioteca;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarLibro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarLibro frame = new EliminarLibro();
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
	public EliminarLibro() {
		
		
		ListaLibro listaLibro = new ListaLibro();
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELsoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELhoy","cico",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELsoy","cnco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELhoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELoy","cico",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELsoy","cnco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELhoy","cnco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELsoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELhoy","cnco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELoy","cico",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELsoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELhoy","inco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELoy","cinco",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELsoy","cico",5)));
		listaLibro.insertarFinal(new NodoLibro(new Libro("ELhoy","cco",5)));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextArea textAreaLibros = new JTextArea();
		textAreaLibros.setText(listaLibro.mostrarTitulos());
		
		JLabel lblPosicinDelLibro = new JLabel("Posici\u00F3n del libro a eliminar");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 120, 1));
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int posicion=(Integer)spinner.getValue();
				if(listaLibro.eliminarPosicion(posicion))
					JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
				else
					JOptionPane.showMessageDialog(null,"No se ha podido eliminar el libro");

			}
			
			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textAreaLibros, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(86)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnAceptar)
								.addComponent(lblPosicinDelLibro))))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textAreaLibros, GroupLayout.PREFERRED_SIZE, 1682, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblPosicinDelLibro)
							.addGap(18)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAceptar)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
