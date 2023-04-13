package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class TableroGui extends JPanel implements MouseListener{
	
	private TableroGui tablero;
	
	  public TableroGui() {
          JPanel panel = new JPanel();
          panel.setLayout(new FlowLayout());

          panel.setLayout(new FlowLayout());
          panel.setPreferredSize(new Dimension(500,500));
          panel.setVisible(true);
          panel.addMouseListener(this);

      }
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;}

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
	
		
		