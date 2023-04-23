package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import modelo.Tablero;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class TableroGui extends JPanel implements MouseListener{
	
	private boolean[][] tablero;
	private int columnas;
	private Image on;
	private Image off;
	private int mouseposX;
	private int mouseposY;
	private boolean action=false;
	
	private int selectedX = 0;
    private int selectedY = 0;
	

	  public TableroGui() {
          JPanel panel = new JPanel();
          panel.setLayout(new FlowLayout());
          panel.setPreferredSize(new Dimension(500,500));
          panel.setVisible(true);
          addMouseListener(this);

          
          on = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Valen\\Downloads\\TallerGUI-main\\TallerGUI-main\\Taller4Gui\\src\\guiassets\\Ellipse 1\\Variant4-2.png");
          off = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Valen\\Downloads\\TallerGUI-main\\TallerGUI-main\\Taller4Gui\\src\\guiassets\\Ellipse 1\\Variant4.png");
      }
	
	  public void setTablero(boolean[][] tablerogui) {
		  tablero= tablerogui;
	  }
	  
	  public void setDifficulty(int columnas) {
		  this.columnas=columnas;
	  }
	  
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		int posx= 0;
		int posy=0;
		

		for (int i=0; i<columnas; i++) {
			for (int j=0; j<columnas; j++) {
				if (tablero[i][j]) {
					g2d.drawImage(on, posx, posy, 500/columnas, 500/columnas, getFocusCycleRootAncestor());
					g2d.setColor(new Color (255,255,102));
				}
				else {
					g2d.drawImage(off, posx, posy, 500/columnas, 500/columnas, getFocusCycleRootAncestor());
					g2d.setColor(new Color (0));
				}	
				g2d.fillRect(posx, posy, 500/columnas, 500/columnas);
				posx+=500/columnas;
			}
			posx=0;
			posy+=500/columnas;

		}
	}
	
	public boolean getAction(){
		return action;
	}
	
	public void setAction(){
		action=false;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {

        selectedX = e.getX();
        selectedY = e.getY();
        mouseposX=recalculatepos( selectedX);
        mouseposY=recalculatepos( selectedY);
        action=true;
        VentanaJuego.actualizar();
        updateBoard();
		// TODO Auto-generated method stub
	}
	
	  public void updateBoard() {
	        repaint();
	    }

	public int recalculatepos(int num) {
		
		float refact = num/(500/columnas);
		int refactselection = Integer.parseInt((String.valueOf(refact)).substring(0,1));
		return refactselection;
			
		}
	
	public int getMousePosX() {
		return mouseposX;
	}
	
	public int getMousePosY() {
		return mouseposY;
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
	
		
		