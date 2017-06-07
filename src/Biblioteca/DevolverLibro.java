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
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class DevolverLibro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldDNI;
	private NodoUsuario aux;
	private NodoEjemplar aux2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DevolverLibro(ListaUsuario listaUsuario, ListaLibro listaLibro) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		aux =  listaUsuario.getInicio();
		
		JLabel lblUsuario = new JLabel("Usuario");
		
		JLabel lblTitulo = new JLabel("Nombre");
		
		JLabel lblAutor = new JLabel("DNI");
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setEditable(false);
		textFieldDNI.setColumns(10);
		JComboBox comboBox = new JComboBox();
		rellenarUsuario(comboBox);
		
		JButton btnSiguiente = new JButton("Siguiente");
		if(aux.getSiguiente()==null) {
			btnSiguiente.setEnabled(false);
			}
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					if(aux.getSiguiente()!=null) {
						aux = aux.getSiguiente();
						}else {
							aux=listaUsuario.getInicio();
						}
					
					rellenarUsuario(comboBox);
					
			}
		});
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblLibros = new JLabel("Libros");
		

		
		JButton btnDevolver = new JButton("Devolver");
		btnDevolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				devolucion(aux.getUser(),listaLibro.buscarLibro(comboBox.getName()).getLibro(),listaLibro,comboBox);
				//aux.getUser().getLista().eliminarPosicion(comboBox.getSelectedIndex());
					rellenarUsuario(comboBox);

				};	
			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnAtrs)
								.addGap(18)
								.addComponent(btnSiguiente)
								.addGap(18)
								.addComponent(btnDevolver))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblTitulo)
									.addComponent(lblAutor))
								.addGap(46)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textFieldDNI)
									.addComponent(textFieldNombre)
									.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(41)
								.addComponent(lblUsuario)))
						.addComponent(lblLibros))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblUsuario)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTitulo)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAutor))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(lblLibros))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAtrs)
						.addComponent(btnSiguiente)
						.addComponent(btnDevolver))
					.addContainerGap(149, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void rellenarUsuario(JComboBox combobox) {
		textFieldNombre.setText(aux.getUser().getNombre());
		textFieldDNI.setText(aux.getUser().getDNI());
		aux2 = aux.getUser().getLista().getInicio();
		combobox.removeAllItems();
		while(aux2!=null) {
			combobox.addItem(aux2.getEjemplar().getTitulo());
			aux2 = aux2.getSiguiente();
			}
	}
	
	public void devolucion(Usuario user, Libro libro,ListaLibro listaLibro,JComboBox comboBox){	
		boolean bucle=false;
		NodoLibro auxiliar = listaLibro.getInicio(); 
		NodoEjemplar auxiliar2 = auxiliar.getLibro().getListaEjemplares().getInicio();
		if(listaLibro.getTamano()>0){
			while(bucle=false){
				auxiliar2 = auxiliar.getLibro().getListaEjemplares().getInicio();
				if(auxiliar!=null) {
					if(auxiliar2==null){
						auxiliar=auxiliar.getSiguiente();
					}else if(auxiliar2.getEjemplar().getPrestado()==true && auxiliar2.getEjemplar().getUsuario()==user){
						auxiliar2.getEjemplar().setPrestado(false);
						auxiliar2.getEjemplar().setUsuario(null);
						user.getLista().eliminarPosicion(comboBox.getSelectedIndex());
						auxiliar.getLibro().setPrestados2(1);
						bucle=true;
						JOptionPane.showMessageDialog(null, "Libro devuelto correctamente");
					} else {
						auxiliar2=auxiliar2.getSiguiente();
					}

				}else {
					bucle=true;
					JOptionPane.showMessageDialog(null, "El libro no se ha podido devolver");
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "El libro no se ha podido devolver");
	}
	}}
