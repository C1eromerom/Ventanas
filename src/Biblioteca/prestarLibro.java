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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class prestarLibro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;
	private JTextField textFieldAutor;
	private JTextField textFieldISBN;
	private JTextField textFieldEjemplares;
	private JTextField textFieldPrestados;
	private NodoLibro aux;
	private NodoUsuario aux2;
	private NodoEjemplar aux3;
	private JTextField textField;
	private JTextField textField_1;
	private int posicion;
	private int posicion2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public prestarLibro(ListaLibro listaLibro, ListaUsuario listaUsuario) {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		aux2 = listaUsuario.getInicio();
		
	
		
		JLabel lblTitulo = new JLabel("Titulo");
		
		JLabel lblAutor = new JLabel("Autor");
		
		JLabel lblIsbn = new JLabel("ISBN");
		
		JLabel lblEjemplares = new JLabel("Ejemplares");
		
		JLabel lblPrestados = new JLabel("Prestados");
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setEditable(false);
		textFieldTitulo.setColumns(10);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setEditable(false);
		textFieldAutor.setColumns(10);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setEditable(false);
		textFieldISBN.setColumns(10);
		
		textFieldEjemplares = new JTextField();
		textFieldEjemplares.setEditable(false);
		textFieldEjemplares.setColumns(10);
		
		textFieldPrestados = new JTextField();
		textFieldPrestados.setEditable(false);
		textFieldPrestados.setColumns(10);
		

		aux = listaLibro.getInicio();
		
		if(aux!=null) {
			rellenarLibro();
			}
		
		JLabel lblLibro = new JLabel("Libro");
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		if(aux2!=null) {
		rellenarUser(comboBox);
		}
		JLabel lblLibros = new JLabel("Libros");

		
		JButton btnAnterior_1 = new JButton("Anterior");
		btnAnterior_1.setEnabled(false);
		
		JButton btnSiguiente_1 = new JButton("Siguiente");
		if(aux2.getSiguiente()==null) {
			btnSiguiente_1.setEnabled(false);
			}
		btnSiguiente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(aux2.getSiguiente()!=null) {
					aux2 = aux2.getSiguiente();
					posicion2++;
					}else {
						aux2=listaUsuario.getInicio();
						posicion2=0;
					}
				
				rellenarUser(comboBox);
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		

		
		
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	
			
		JButton btnSiguiente = new JButton("Siguiente");
		if(aux.getSiguiente()==null) {
			btnSiguiente.setEnabled(false);
			}
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					if(aux.getSiguiente()!=null) {
						aux = aux.getSiguiente();
						posicion++;
						}else {
							aux=listaLibro.getInicio();
							posicion=0;
						}
					
					rellenarLibro();
					
			}
		});
		
		JButton btnPrestar = new JButton("Prestar");
		btnPrestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prestar(listaUsuario,listaLibro);
				rellenarLibro();
				rellenarUser(comboBox);
				};
		});
		
		
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(57)
							.addComponent(lblLibro))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(24)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblTitulo)
												.addComponent(lblAutor)
												.addComponent(lblIsbn)
												.addComponent(lblEjemplares)
												.addComponent(lblPrestados)))
										.addGroup(groupLayout.createSequentialGroup()
											.addContainerGap()
											.addComponent(btnAnterior)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldPrestados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldEjemplares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnSiguiente))
											.addGap(108)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnAnterior_1)
												.addComponent(lblNombre)
												.addComponent(lblDni)
												.addComponent(lblLibros))))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnPrestar)
									.addGap(101)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textField)
									.addComponent(textField_1)
									.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(19)
									.addComponent(btnSiguiente_1)))))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblLibro)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitulo)
						.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAutor)
						.addComponent(textFieldAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDni)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIsbn)
								.addComponent(textFieldISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEjemplares)
								.addComponent(textFieldEjemplares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldPrestados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPrestados))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSiguiente)
								.addComponent(btnAnterior)
								.addComponent(btnAnterior_1)
								.addComponent(btnSiguiente_1))
							.addGap(35)
							.addComponent(btnPrestar))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLibros)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(203, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		
	}
	
	public void prestar(ListaUsuario listaP,ListaLibro listaL){

		NodoEjemplar auxL2 = aux.getLibro().getListaEjemplares().getInicio();;
		boolean bucle=true;
		
		while(bucle==true) {
			if(auxL2!=null) {
				if(auxL2.getEjemplar().getPrestado()==true) {
					auxL2=auxL2.getSiguiente();
				}else {
					aux2.getUser().insertarLibro(auxL2.getEjemplar());
					auxL2.getEjemplar().setUsuario(aux2.getUser());
					auxL2.getEjemplar().setPrestado(true);
					aux.getLibro().setPrestados1(1);
					JOptionPane.showMessageDialog(null, "Prestado correctamente");
					bucle=false;
				}
			}else {
				JOptionPane.showMessageDialog(null, "Lo siento, no quedan ejemplares para prestar");
				bucle=false;
			}
		}
	
	}
	
	public void rellenarLibro() {
		textFieldTitulo.setText(aux.getLibro().getTitulo());
		textFieldAutor.setText(aux.getLibro().getAutor());
		textFieldISBN.setText(aux.getLibro().getISBN());
		textFieldEjemplares.setText(String.valueOf(aux.getLibro().getListaEjemplares().getTamano()));
		textFieldPrestados.setText(String.valueOf(aux.getLibro().getPrestados()));
	}
	
	public void rellenarUser(JComboBox combobox) {
		textField.setText(aux2.getUser().getNombre());
		textField_1.setText(aux2.getUser().getDNI());
		aux3 = aux2.getUser().getLista().getInicio();
		combobox.removeAllItems();
		while(aux3!=null) {
			combobox.addItem(aux3.getEjemplar().getTitulo());
			aux3 = aux3.getSiguiente();
			}
	}
}
