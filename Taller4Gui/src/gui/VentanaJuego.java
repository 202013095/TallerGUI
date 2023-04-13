package gui;

import javax.swing.JFrame;

import modelo.Tablero;
import modelo.Top10;

public class VentanaJuego extends JFrame {
	
	private Tablero tablero;
	private int dificultadpredef = 5;
	private PanelDificultad panelDificultad;
	private TableroGui tablero;
	private 
	
	
	public VentanaJuego() {
		
		tablero= new Tablero(dificultadpredef);
		
		

		
	}

}
