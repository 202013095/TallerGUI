package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class TableroGui extends JPanel implements MouseListener{
	
	private TableroGui tablero;
	private Image on;
	private Image off;
	
	
	  public TableroGui() {
          JPanel panel = new JPanel();
          panel.setLayout(new FlowLayout());

          panel.setLayout(new FlowLayout());
          panel.setPreferredSize(new Dimension(500,500));
          panel.setVisible(true);
          panel.addMouseListener(this);
          
          on = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Valen\\Downloads\\TallerGUI-main\\TallerGUI-main\\Taller4Gui\\src\\guiassets\\Ellipse 1\\Variant4-2.png");
          off = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Valen\\Downloads\\TallerGUI-main\\TallerGUI-main\\Taller4Gui\\src\\guiassets\\Ellipse 1\\Variant4.png");
      }
	
	public void paint(Graphics g,boolean[][] tablero, int columnas) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		int posx= 0;
		int posy=0;
		
		
		for (int i=0; i<columnas; i++) {
			for (int j=0; j<columnas; i++) {
				if (tablero[i][j]) {
					g2d.drawImage(on, posx, posy, 25, 25, getFocusCycleRootAncestor());
				}
				else {
					g2d.drawImage(off, posx, posy, 25, 25, getFocusCycleRootAncestor());
				}
			}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
}
	
		
		