import java.awt.*;
import java.applet.*;
public class label extends Applet{  //创建一个java小程序
	Label label1,label2;   //声明两个标签对象
	public void init(){
		label1=new Label();
		label1.setText("你好！我是一个标签！");
		label2=new Label("你好！我是另外一个标签！");
		label2.setBackground(Color.yellow); //设置背景和前景颜色
		label2.setForeground(Color.red);
		add(label1);
		add(label2);
	}
	public void paint(Graphics g){
		//下面的方法我们在后面学习
		g.drawString("label1的文本是："+label1.getText(),15,100);
		g.drawString("label2的文本是："+label2.getText(), 60, 140);
	}
}

