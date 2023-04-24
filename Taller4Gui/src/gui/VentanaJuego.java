package gui;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import modelo.Tablero;
import modelo.Top10;

public class VentanaJuego extends JFrame {
	
	public Top10 top10;
	public VentanaHighscore jugadoresHighscores;
	private static final File top = new File("Data\\top10.csv");
	private static Tablero tablero;
	private static int dificultadpredef=10;
	private static int casillas=5;
	private static PanelDificultad panelDificultad;
	private static TableroGui tablerogui;
	private PanelOpciones opciones;
	public static PanelJugador jugador;
	private static boolean[][] tableroactual;
	

	
	
	public VentanaJuego() {
		
		tablero= new Tablero(casillas);
		
		panelDificultad= new PanelDificultad();
		tablerogui= new TableroGui();
		opciones= new PanelOpciones();
		jugador = new PanelJugador();
		
		top10 = new Top10();
		top10.cargarRecords(top);
		
		pintarTablero();
		
	/*Distribucion en ventana*/
		setLayout(new BorderLayout());
		add(panelDificultad, BorderLayout.NORTH);
		add(tablerogui,BorderLayout.CENTER);
		add(jugador,BorderLayout.SOUTH);
		add(opciones,BorderLayout.EAST);
		
        pack();
        setSize(630,600);
        setResizable(false);
        setTitle("LIGTHS OFF");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
	
	public static void seleccionarDificultad() {
		dificultadpredef = panelDificultad.getDifficulty();
		tablero.desordenar(dificultadpredef);
		tablero.salvar_tablero();
		tablero.reiniciar();
		tablerogui.updateBoard();}
	
	public static void tamanoboard() {
		casillas = panelDificultad.getColumns();
		tablero= new Tablero(casillas);
		tablerogui.setTablero(tablero.darTablero());
		tablero.reiniciar();
		tablerogui.setTablero(tableroactual);
		tablerogui.updateBoard();
	}

	public static void pintarTablero() {
		
		tableroactual =tablero.darTablero();
		tablero.salvar_tablero();
		tablerogui.setTablero(tableroactual);
		tablerogui.setDifficulty(casillas);}
	
	public static void actualizar() {
		tablero.jugar( tablerogui.getMousePosY(),tablerogui.getMousePosX());
		pintarTablero();
		actualizarJugador();
		
	}
	
	public static void actualizarJugador() {
		jugador.actualizarJugadas(tablero.darJugadas());
	
	}
	
	public static void reiniciar() {
		tablero.reiniciar();
		tablero.salvar_tablero();
		tableroactual =tablero.darTablero();
		actualizarJugador();
		tablerogui.setTablero(tableroactual);
		tablerogui.updateBoard();
		
	}
	
	public static void Top10() {
		VentanaHighscore.setRegistros(Top10.darRegistros());
	}
	
public static void nuevo() {
		
	}
	
    public static void main(String[] args) {
        new VentanaJuego();
    }
}

