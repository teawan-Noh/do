package day7;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Line {
	
	void draw(Point p1, Point p2) {
		
	}
}



public class LineTest {

	public static void main(String[] args) {
		Line line = new Line();
		line.draw(new Point(1,2), new Point(3,4));
		
		Line line2 = new Line();
		Point p1 = new Point(2, 4);
		Point p2 = new Point(2, 4);
		line2.draw(p1, p2);
		
		
		
	}

}
