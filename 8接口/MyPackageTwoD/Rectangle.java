package MyPackageTwoD;

public class Rectangle {
	public int width=0;
	public int height=0;
	public Point origin;
	public Rectangle(Point p,int w,int h){
		origin=p;
		width=w;
		height=h;
	}
	public void move(int x,int y){
		origin.x=x;
		origin.y=y;
	}
	public int area(){
		return width*height;
	}
}

