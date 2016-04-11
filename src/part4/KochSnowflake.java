package part4;
import java.awt.geom.Point2D;
import draw.UltraDraw;


public class KochSnowflake {
	public static void main(String[] args) {
		KochSnowflake help = new KochSnowflake();
		help.draw(2);
	}
	
  public void draw(int n) {
	  KochCurve uno = new KochCurve();
	  KochCurve dos = new KochCurve();
	  KochCurve tres = new KochCurve();
	  Point2D.Double left = new Point2D.Double(12.0,256.0);
	  Point2D.Double right = new Point2D.Double(500.0,256.0);
	  Point2D.Double top = new Point2D.Double(256,12.0);
	  uno.draw(n,left,top,true);
	  dos.draw(n,top, right, true);
	  tres.draw(n, left, right, false);
	  }
}
