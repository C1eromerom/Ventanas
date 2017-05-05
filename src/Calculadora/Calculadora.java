package Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField Pantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{438, 0};
		gbl_contentPane.rowHeights = new int[]{74, 179, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		Pantalla = new JTextField();
		Pantalla.setEditable(false);
		Pantalla.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(Pantalla, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(Pantalla, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{214, 106, 92, 0};
		gbl_panel_1.rowHeights = new int[]{179, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel_1.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{70, 67, 62, 0};
		gbl_panel_2.rowHeights = new int[]{44, 44, 44, 41, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton Siete = new JButton("7");
		GridBagConstraints gbc_Siete = new GridBagConstraints();
		gbc_Siete.fill = GridBagConstraints.BOTH;
		gbc_Siete.insets = new Insets(0, 0, 5, 5);
		gbc_Siete.gridx = 0;
		gbc_Siete.gridy = 0;
		panel_2.add(Siete, gbc_Siete);
		
		JButton Ocho = new JButton("8");
		GridBagConstraints gbc_Ocho = new GridBagConstraints();
		gbc_Ocho.fill = GridBagConstraints.BOTH;
		gbc_Ocho.insets = new Insets(0, 0, 5, 5);
		gbc_Ocho.gridx = 1;
		gbc_Ocho.gridy = 0;
		panel_2.add(Ocho, gbc_Ocho);
		
		JButton Nueve = new JButton("9");
		GridBagConstraints gbc_Nueve = new GridBagConstraints();
		gbc_Nueve.fill = GridBagConstraints.BOTH;
		gbc_Nueve.insets = new Insets(0, 0, 5, 0);
		gbc_Nueve.gridx = 2;
		gbc_Nueve.gridy = 0;
		panel_2.add(Nueve, gbc_Nueve);
		
		JButton Cuatro = new JButton("4");
		GridBagConstraints gbc_Cuatro = new GridBagConstraints();
		gbc_Cuatro.fill = GridBagConstraints.BOTH;
		gbc_Cuatro.insets = new Insets(0, 0, 5, 5);
		gbc_Cuatro.gridx = 0;
		gbc_Cuatro.gridy = 1;
		panel_2.add(Cuatro, gbc_Cuatro);
		
		JButton Cinco = new JButton("5");
		GridBagConstraints gbc_Cinco = new GridBagConstraints();
		gbc_Cinco.fill = GridBagConstraints.BOTH;
		gbc_Cinco.insets = new Insets(0, 0, 5, 5);
		gbc_Cinco.gridx = 1;
		gbc_Cinco.gridy = 1;
		panel_2.add(Cinco, gbc_Cinco);
		
		JButton Uno = new JButton("1");
		Uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton Seis = new JButton("6");
		GridBagConstraints gbc_Seis = new GridBagConstraints();
		gbc_Seis.fill = GridBagConstraints.BOTH;
		gbc_Seis.insets = new Insets(0, 0, 5, 0);
		gbc_Seis.gridx = 2;
		gbc_Seis.gridy = 1;
		panel_2.add(Seis, gbc_Seis);
		GridBagConstraints gbc_Uno = new GridBagConstraints();
		gbc_Uno.fill = GridBagConstraints.BOTH;
		gbc_Uno.insets = new Insets(0, 0, 5, 5);
		gbc_Uno.gridx = 0;
		gbc_Uno.gridy = 2;
		panel_2.add(Uno, gbc_Uno);
		
		JButton Dos = new JButton("2");
		GridBagConstraints gbc_Dos = new GridBagConstraints();
		gbc_Dos.fill = GridBagConstraints.BOTH;
		gbc_Dos.insets = new Insets(0, 0, 5, 5);
		gbc_Dos.gridx = 1;
		gbc_Dos.gridy = 2;
		panel_2.add(Dos, gbc_Dos);
		
		JButton Tres = new JButton("3");
		GridBagConstraints gbc_Tres = new GridBagConstraints();
		gbc_Tres.fill = GridBagConstraints.BOTH;
		gbc_Tres.insets = new Insets(0, 0, 5, 0);
		gbc_Tres.gridx = 2;
		gbc_Tres.gridy = 2;
		panel_2.add(Tres, gbc_Tres);
		
		JButton Punto = new JButton(".");
		GridBagConstraints gbc_Punto = new GridBagConstraints();
		gbc_Punto.fill = GridBagConstraints.BOTH;
		gbc_Punto.insets = new Insets(0, 0, 0, 5);
		gbc_Punto.gridx = 0;
		gbc_Punto.gridy = 3;
		panel_2.add(Punto, gbc_Punto);
		
		JButton Cero = new JButton("0");
		GridBagConstraints gbc_Cero = new GridBagConstraints();
		gbc_Cero.fill = GridBagConstraints.BOTH;
		gbc_Cero.insets = new Insets(0, 0, 0, 5);
		gbc_Cero.gridx = 1;
		gbc_Cero.gridy = 3;
		panel_2.add(Cero, gbc_Cero);
		
		JButton MasMenos = new JButton("+/-");
		GridBagConstraints gbc_MasMenos = new GridBagConstraints();
		gbc_MasMenos.fill = GridBagConstraints.BOTH;
		gbc_MasMenos.gridx = 2;
		gbc_MasMenos.gridy = 3;
		panel_2.add(MasMenos, gbc_MasMenos);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 0;
		panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{61, 0};
		gbl_panel_3.rowHeights = new int[]{44, 44, 44, 41, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton Mas = new JButton("+");
		Mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_Mas = new GridBagConstraints();
		gbc_Mas.fill = GridBagConstraints.BOTH;
		gbc_Mas.insets = new Insets(0, 0, 5, 0);
		gbc_Mas.gridx = 0;
		gbc_Mas.gridy = 0;
		panel_3.add(Mas, gbc_Mas);
		
		JButton Menos = new JButton("-");
		GridBagConstraints gbc_Menos = new GridBagConstraints();
		gbc_Menos.fill = GridBagConstraints.BOTH;
		gbc_Menos.insets = new Insets(0, 0, 5, 0);
		gbc_Menos.gridx = 0;
		gbc_Menos.gridy = 1;
		panel_3.add(Menos, gbc_Menos);
		
		JButton Por = new JButton("x");
		GridBagConstraints gbc_Por = new GridBagConstraints();
		gbc_Por.fill = GridBagConstraints.BOTH;
		gbc_Por.insets = new Insets(0, 0, 5, 0);
		gbc_Por.gridx = 0;
		gbc_Por.gridy = 2;
		panel_3.add(Por, gbc_Por);
		
		JButton Entre = new JButton("/");
		GridBagConstraints gbc_Entre = new GridBagConstraints();
		gbc_Entre.fill = GridBagConstraints.BOTH;
		gbc_Entre.gridx = 0;
		gbc_Entre.gridy = 3;
		panel_3.add(Entre, gbc_Entre);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 0;
		panel_1.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton Clear = new JButton("CLEAR");
		panel_4.add(Clear);
		
		JButton Igual = new JButton("=");
		panel_4.add(Igual);
	}

}
