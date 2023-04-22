package gui;

import java.awt.GridBagLayout;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import modelo.Tablero;
import modelo.Top10;

public class VentanaJuego extends JFrame {
	
	private Tablero tablero;
	private int dificultadpredef = 5;
	private PanelDificultad panelDificultad;
	private TableroGui tablerogui;
	private PanelOpciones opciones;
	private PanelJugador jugador;
	private boolean[][] tableroactual;
	
	
	public VentanaJuego() {
		
		tablero= new Tablero(dificultadpredef);
		
		panelDificultad= new PanelDificultad();
		tablerogui= new TableroGui();
		opciones= new PanelOpciones();
		jugador = new PanelJugador();
		
	/*Distribucion en ventana*/
		
		setLayout(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets(2, 2, 2, 2);
        grid.gridx = 0;
      	grid.gridy = 0;

      	grid.anchor = GridBagConstraints.WEST;
      	
      	grid.gridx = 0;
        grid.gridy = 0;
        add(panelDificultad, grid);

        grid.gridx = 0;
        grid.gridy = 1;
        grid.gridwidth = 4;
        add(tablerogui, grid);

        grid.gridx = 1;
        grid.gridy = 1;
        add(opciones, grid);
        
        grid.gridx = 0;
        grid.gridy = 2 ;
        add(jugador, grid);

        pack();
        setSize(850, 660);
        setResizable(false);
        setTitle("Light Up");
        setVisible(true);
        
        pintarTablero();
	}

	public void pintarTablero() {
		tableroactual =tablero.darTablero();
		tablerogui.paint(Graphics g, tableroactual,dificultadpredef);}
	
    public static void main(String[] args) {
        new VentanaJuego();
    }
}

