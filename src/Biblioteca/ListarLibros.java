package Biblioteca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarLibros extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldEjemplares;
	private JTextField textFieldPrestados;
	private JTextField textFieldISBN;
	private NodoLibro aux;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ListarLibros(ListaLibro listaLibro) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		aux =  listaLibro.getInicio();
		
		JLabel lblUsuario = new JLabel("Libro");
		
		JLabel lblTitulo = new JLabel("Titulo");
		
		JLabel lblAutor = new JLabel("Autor");
		
		JLabel lblEjemplares = new JLabel("Ejemplares");
		
		JLabel lblPrestados = new JLabel("Prestados");
		
		JLabel lblIsbn = new JLabel("ISBN");
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setEditable(false);
		textFieldTitulo.setColumns(10);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setEditable(false);
		textFieldAutor.setColumns(10);
		
		textFieldEjemplares = new JTextField();
		textFieldEjemplares.setEditable(false);
		textFieldEjemplares.setColumns(10);
		
		textFieldPrestados = new JTextField();
		textFieldPrestados.setEditable(false);
		textFieldPrestados.setColumns(10);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setEditable(false);
		textFieldISBN.setColumns(10);
		
		rellenarLibro();
		
		JTextArea textAreaUsuarios = new JTextArea();
		textAreaUsuarios.setEditable(false);
		textAreaUsuarios.setText(aux.getLibro().getListaEjemplares().mostrarTitulos());
		JLabel lblUsuariosConEste = new JLabel("Usuarios con este Libro");
		
		JButton btnSiguiente = new JButton("Siguiente");
		if(aux.getSiguiente()==null) {
			btnSiguiente.setEnabled(false);
			}
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					if(aux.getSiguiente()!=null) {
						aux = aux.getSiguiente();
						}else {
							aux=listaLibro.getInicio();
						}
					
					rellenarLibro();
					textAreaUsuarios.setText(aux.getLibro().getListaEjemplares().mostrarTitulos());
					
			}
		});
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTitulo)
						.addComponent(lblAutor)
						.addComponent(lblIsbn)
						.addComponent(lblPrestados)
						.addComponent(lblEjemplares)
						.addComponent(btnAtrs))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSiguiente)
						.addComponent(textFieldPrestados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldEjemplares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addComponent(textAreaUsuarios, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(76, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(lblUsuario)
					.addPreferredGap(ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
					.addComponent(lblUsuariosConEste)
					.addGap(105))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(lblUsuariosConEste))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textAreaUsuarios, GroupLayout.PREFERRED_SIZE, 1157, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTitulo)
								.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAutor))
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIsbn)
								.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEjemplares)
								.addComponent(textFieldEjemplares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrestados)
								.addComponent(textFieldPrestados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAtrs)
								.addComponent(btnSiguiente))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void rellenarLibro() {
		textFieldTitulo.setText(aux.getLibro().getTitulo());
		textFieldAutor.setText(aux.getLibro().getAutor());
		textFieldISBN.setText(aux.getLibro().getISBN());
		textFieldEjemplares.setText(String.valueOf(aux.getLibro().getListaEjemplares().getTamano()));
		int prestados=(Integer)aux.getLibro().prestados();
		textFieldPrestados.setText(String.valueOf(prestados));
	}

}
