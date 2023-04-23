package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJugador extends JPanel {
	
	private JLabel Jugadas;
	private JLabel Jugador;
	
	private JTextField txtJugadas;
	private JTextField txtJugador;
	
	public PanelJugador() {
		
		Jugadas = new JLabel("Jugadas");
		Jugadas.setPreferredSize(new Dimension(50, 20));
		
		txtJugadas = new JTextField();
		txtJugadas .setPreferredSize(new Dimension(50, 20));

		Jugador = new JLabel("Jugador");
		Jugador.setPreferredSize(new Dimension(50, 20));
		
		txtJugador = new JTextField();
		txtJugador .setPreferredSize(new Dimension(50, 20));	
		
		
	  JPanel panel = new JPanel();
	  panel.setLayout(new FlowLayout());
	  panel.setPreferredSize(new Dimension(800,50));
	  panel.setVisible(true);
	  
	  add(Jugadas);
	  txtJugadas.setEditable(false);
	  add(txtJugadas); 
	  
	  add(Jugador);
	  add(txtJugador); 
	
	
	}
	
	public void actualizarJugadas (int valor) {
		txtJugadas.setText(String.valueOf(valor));
		
	}
	
	public void actualizarJugador(String valor) {
		txtJugador.setText(valor);
	}

}
