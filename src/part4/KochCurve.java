package part4;
import java.awt.geom.Point2D;
import draw.StdDraw;


public class KochCurve {
	
	public Point2D.Double start, end;
	public KochCurve(Point2D.Double start, Point2D.Double end){
		this.start = start;
		this.end = end;
		
	}
	public void draw(int n) {
		drawCurve(this.start,this.end, );
		kochCurve(this.start, this.end, n-1);
		
		
		
	}
	public void drawCurve() {
		
	}
	
	public void kochCurve(int n) {
		
	}
}
