package Biblioteca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import miLibreria.Entrada;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class IntoducirLibro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldISBN;

	/**
	 * Launch the application.
	 */
	

	
	

	/**
	 * Create the frame.
	 */
	public IntoducirLibro(ListaLibro listaLibro) {
		
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTituloDelLibro = new JLabel("Titulo del libro");
		
		JLabel lblNombreDelAutor = new JLabel("Nombre del autor");
		
		JLabel lblNumeroDeEjemplares = new JLabel("Numero de ejemplares");
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(10);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setColumns(10);
		
		JLabel lblIsbn = new JLabel("ISBN");
		
		textFieldISBN = new JTextField();
		textFieldISBN.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 120, 1));
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ejemplares=(Integer)spinner.getValue();
				
				if (ejemplares<=0){
					JOptionPane.showMessageDialog(null, "Numero de ejemplares invalido");
				}else if(listaLibro.buscarLibro(textFieldTitulo.getText())==null) {
					if(esVacio()==false) {
					listaLibro.insertarInicio(new NodoLibro(new Libro(textFieldAutor.getText(),textFieldTitulo.getText(),ejemplares, textFieldISBN.getText())));
					JOptionPane.showMessageDialog(null, "Registro completado");
					BorrarCampos();
					}else {
					JOptionPane.showMessageDialog(null, "Porfavor relleno los campos");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Ese libro ya está en la biblioteca");
					
				}
				
				
			}

		});
		
		JButton btnAtrs = new JButton("AtrÃ¡s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTituloDelLibro)
								.addComponent(lblNombreDelAutor)
								.addComponent(lblNumeroDeEjemplares)
								.addComponent(lblIsbn))
							.addGap(24))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addComponent(btnAtrs)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnAceptar)
							.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTituloDelLibro)
						.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombreDelAutor)
						.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIsbn))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNumeroDeEjemplares)
							.addGap(67)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAceptar)
								.addComponent(btnAtrs)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(61))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void BorrarCampos() {
		textFieldTitulo.setText("");
		textFieldAutor.setText("");
		textFieldISBN.setText("");
	}
	
	public boolean esVacio() {
		if(textFieldAutor.getText()==""||textFieldTitulo.getText()==""||textFieldISBN.getText()=="") {
			return true;
		}else {
			return false;
		}
	}
}
