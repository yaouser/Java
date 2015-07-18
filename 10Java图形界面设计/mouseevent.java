import java.awt.*;
import java.awt.event.*;
public class mouseevent extends MouseAdapter implements MouseMotionListener{
	Frame f;
	public static void main(String argv[]){
		new mouseevent();
	}
	public mouseevent(){
		f=new Frame("鼠标事件测试");
		f.addMouseMotionListener(this);
		f.setSize(400,150);
		f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent e){
		f.setTitle("鼠标单击！");
		f.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}
	public void mouseExited(MouseEvent e){
		f.setTitle("鼠标离开！ ");
	}
	public void mouseDragged(MouseEvent e){
		f.setTitle("鼠标正在拖动");
		f.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
	}
	public void mouseMoved(MouseEvent e){
		int x=e.getX();
		int y=e.getY();
		f.setTitle("鼠标指针移动到：("+x+","+y+")");
		f.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
}
