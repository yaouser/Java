import java.awt.*;
import java.awt.event.*;
class MyWindow1 implements WindowListener{
	//以下重写7个抽象类方法
	public void windowOpened(WindowEvent e){}
	//我们只使用windowClosing方法
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
}
public class windowevent {
	public static void main(String args[]){
		Frame f=new Frame("WindowEvent 测试");
		f.setSize(400,300);
		f.setBackground(Color.green);
		f.setVisible(true);
		//给窗口加入监听器，注意参数是建立的事件处理类对象
		f.addWindowListener(new MyWindow1());
	}
}
