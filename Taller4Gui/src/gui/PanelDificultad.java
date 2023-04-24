package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class PanelDificultad extends JPanel implements ChangeListener{

	JLabel label = new JLabel("SIZE");
	JLabel label2 = new JLabel("LEVEL");
	
	Font font = new Font(label.getFont().getFamily(), Font.BOLD, label.getFont().getSize());
	
	
	private JComboBox<String> diffBox;
	private int difficulty = 7;
	private int columns = 5;
	private ButtonGroup bg;
	private JRadioButton facil,intermedio,dificil;
	
	public PanelDificultad () {
		
		
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    panel.setPreferredSize(new Dimension(800,100));
    panel.setVisible(true);
    
    
    bg=new ButtonGroup();
    
    
    facil=new JRadioButton("Easy");
    facil.setBounds(10,20,100,30);
    facil.addChangeListener(this);
    
    intermedio=new JRadioButton("Medium");
    intermedio.setBounds(10,20,100,30);
    intermedio.addChangeListener(this);
    
    dificil=new JRadioButton("Hard");
    dificil.setBounds(10,20,100,30);
    dificil.addChangeListener(this);
    
    bg.add(facil);
    bg.add(intermedio);
    bg.add(dificil);
    
    String[] dificultades = {"5X5", "6X6", "7X7"};
    diffBox = new JComboBox<>(dificultades);
   
    
    diffBox.addActionListener(new ActionListener() {						
        @Override
        public void actionPerformed(ActionEvent e) {

            String seleccion = (String)diffBox.getSelectedItem();
            
            if (seleccion.equals("5X5")) {
            	columns=5;	
            }
            else if (seleccion.equals("6X6")) {
            	columns=6;
            }
            else if (seleccion.equals("7X7")) {
            	columns=7;
            	
            }
            VentanaJuego.tamanoboard();
        }});
    
    label.setFont(font);
    label2.setFont(font);
    add(label);
    add(diffBox);
    add(label2);
    add(facil);
    add(intermedio);
    add(dificil);
    
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		 if (facil.isSelected()) {
	            difficulty=7;        }
	        if (intermedio.isSelected()) {
	        	difficulty=10;
	        }
	        if (dificil.isSelected()) {
	        	difficulty=15;
	        } 
	        
	        VentanaJuego.seleccionarDificultad(); ;
		
		
	}
	

	
	public void actionPerformed(ActionEvent e) {
        
        String seleccion = (String)diffBox.getSelectedItem();
        
        if (seleccion.equals("5X5")) {
        	columns=5;	
        }
        else if (seleccion.equals("6X6")) {
        	columns=6;
        	System.out.print("selected");
        }
        else if (seleccion.equals("7X7")) {
        	columns=7;
        	
        }
        VentanaJuego.tamanoboard();
    }
	
	public int getDifficulty() {
		return difficulty;
	}
	
	public int getColumns() {
		return columns;
	}
}
