package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel {
	
	private JButton nuevo, reiniciar, top10, cambiarJugador;
	
	public PanelOpciones() {
		
		JPanel btnPanel = new JPanel(new GridLayout(10, 1, 10, 5));
		nuevo = new JButton("NEW");
		nuevo.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){  
		    	 VentanaJuego.nuevo();
		        }    
		 });
		
	
		
		reiniciar = new JButton("RESTART");
		reiniciar.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){  
		    	 VentanaJuego.reiniciar();
		        }    
		 });
		
		
		top10 = new JButton("SCOREBOARD");
		top10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  VentanaJuego.Top10();
            }});
		
		cambiarJugador = new JButton("SELECT PLAYER");
		cambiarJugador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VentanaJuego.jugador.txtJugador.setEditable(true);                	
            }});
		
		
		btnPanel.add(nuevo);
		btnPanel.add(reiniciar);
		btnPanel.add(top10);
		btnPanel.add(cambiarJugador);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.anchor = GridBagConstraints.CENTER;
		add(btnPanel, gbc);
		
		
	}


		
	

}
