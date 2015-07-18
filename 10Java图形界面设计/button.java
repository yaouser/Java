import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class button extends Applet implements ActionListener{
	Button btn1,btn2;
	int k=0;
	public void init(){
		Button btn1=new Button("你好");
		btn1.addActionListener(this);  //加事件监听器
		add(btn1);
		Button btn2=new Button("清除");
		btn2.addActionListener(this);
		add(btn2);
	}
	public void paint(Graphics g){
		if(k==1)
			g.drawString("你单击了【你好】按钮！", 50, 80);
		if(k==2){}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("你好"))  //判断是哪个按钮被单击
			k=1;
		if(e.getActionCommand().equals("清除"))
			k=2;
		repaint();  //重新绘制界面
	}
}
