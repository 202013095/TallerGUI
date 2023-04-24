package gui;

import java.awt.Font;
import java.util.Collection;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import modelo.RegistroTop10;

public class VentanaHighscore extends JDialog{

    private int posicion=1;
    private DefaultListModel<String> modlista;
	private static Collection<RegistroTop10> registros;
	private JList<String> lista;
	

	public VentanaHighscore() 
	{
        setSize(200, 250);
        setResizable(false);
        setTitle("Highscore");
        
                      
        modlista = new DefaultListModel<>();
        
        JLabel label = new JLabel("PLAYERS");
        Font font = label.getFont();
        label.setFont(new Font(font.getName(), Font.BOLD, font.getSize()));
        
        add(label);
        
        modlista.addElement("# NOMBRE");
              
		for (RegistroTop10 registro : registros) {
			modlista.addElement(posicion+"...."+registro.darNombre()+"...."+registro.darPuntos());
			posicion++;
		}
	
		lista = new JList<>(modlista);
		
		add(lista);
           
    }
	
	public static void setRegistros(Collection<RegistroTop10> top10) {
		registros=top10;
	}
}
