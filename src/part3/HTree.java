package part3;
import java.awt.geom.Point2D;

import draw.UltraDraw;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HTree implements KeyListener {

	
	public Point2D.Double center;
	public H help;
	
	public static void main(String[] args) {
	
		
	}

	
	public HTree() {
		UltraDraw.setXscale(0, 150);
		UltraDraw.setYscale(0, 150);
		UltraDraw.clear(UltraDraw.RED);
		center = new Point2D.Double(75, 75);
		help = new H(center,50);
		
	}
	
	public void draw(int n, H focus) {
		if (n == 0) return;
		
		H[] res = drawH(focus);
		for(H h : res){
			draw(n-1, h);
		}

	}
	public H[] drawH(H original) {
		original.draw();
		H left = new H(original.getTopLeft(),original.getSize()/2);
        H right = new H(original.getTopRight(), original.getSize()/2);
		H bl = new H(original.getBottomLeft(),original.getSize()/2);
		H br = new H(original.getBottomRight(),original.getSize()/2);
		H[] values = {left, right, bl, br};
		return values;
	}
	
	public void keyPressed(KeyEvent e){
		
	}
	public void keyReleased(KeyEvent e){
		
	}
	
	public void keyTyped(KeyEvent e){
		char keyChar = e.getKeyChar();
		UltraDraw.clear(UltraDraw.GRAY);
		int n = Character.getNumericValue(keyChar);
		HTree htree = new HTree();
		
	}
	
}
