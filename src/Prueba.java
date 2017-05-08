import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;

public class Prueba extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel label;
	private JComboBox cmbEmail;
	private JLabel lblNewLabel;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		
		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		
		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		label = new JLabel("@");
		
		cmbEmail = new JComboBox();
		cmbEmail.addItem("gmail.com");
		cmbEmail.addItem("hotmail.com");
		cmbEmail.addItem("yahoo.com");


		
		lblNewLabel = new JLabel("Sexo:");
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre",true);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		
		ButtonGroup Sexo = new ButtonGroup();
		
		Sexo.add(rdbtnHombre);
		Sexo.add(rdbtnMujer);
		JLabel lblEdad = new JLabel("Edad:");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 120, 1));
		
		JCheckBox Acepto = new JCheckBox("Acepto los terminos");
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNombre.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Rellena el campo del nombre por favor");
				} else if (txtApellido1.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Rellena el campo del primer apellido por favor");
				} else if (txtApellido2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Rellena el campo del segundo apellido por favor");
				} else if (txtEmail.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Rellena el campo del email por favor");
				} else if(Acepto.isSelected()) {
					JOptionPane.showMessageDialog(null, "Envio satisfactorio");
					
					String email=txtEmail.getText();
					
					if (cmbEmail.getSelectedIndex()==0){
						email=email+"@gmail.com";
					} else if (cmbEmail.getSelectedIndex()==1){
						email=email+"@hotmail.com";
					} else if (cmbEmail.getSelectedIndex()==2){
						email=email+"@yahoo.com";
					} 
					
					String sexo="";
					
					if (rdbtnHombre.isSelected()){
						sexo="hombre";
					} else {
						sexo="mujer";
					} 
					int edad=(Integer)spinner.getValue();
					Persona registro = new Persona(txtNombre.getText(),txtApellido1.getText(),txtApellido2.getText(),email,sexo,edad);
					JOptionPane.showMessageDialog(null, registro.toString());
					ObjectOutputStream out= null;
					
				} else{
					JOptionPane.showMessageDialog(null, "Acepta los terminos!!!!");
				}
			}
		});
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText("");
				txtApellido1.setText("");
				txtApellido2.setText("");
				txtEmail.setText("");
				
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEdad)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNombre)
										.addComponent(lblPrimerApellido)
										.addComponent(lblSegundoApellido)
										.addComponent(lblEmail))
									.addGap(63)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtApellido2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtApellido1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cmbEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(24)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnHombre)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(rdbtnMujer))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(132)
							.addComponent(btnLimpiar)
							.addGap(67)
							.addComponent(btnValidar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(67)
							.addComponent(Acepto)))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrimerApellido)
						.addComponent(txtApellido1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSegundoApellido)
						.addComponent(txtApellido2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(cmbEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(rdbtnHombre))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnMujer)
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEdad)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addComponent(Acepto)
					.addGap(98)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLimpiar)
						.addComponent(btnValidar))
					.addGap(59))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
