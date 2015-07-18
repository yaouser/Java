import java.awt.*;
import java.awt.event.*;  //事件处理程序必需
class MyWindow extends Frame{
	MyWindow(String s){   //类的构造函数
		super(s);   //调用父类Frame的构造函数
		setSize(400,300);
		Toolkit tk=getToolkit();  //以下几行用于创建窗口图标
		Image img=tk.getImage("love.jpg");
		setIconImage(img);
		setBackground(Color.green);  //设置窗口背景颜色为绿色
		setVisible(true);
		        //给窗口增加事件监听器
		this.addWindowListener(new WindowAdapter(){
			//重写窗口关闭事件方法
			public void windowClosing(WindowEvent e){
				dispose();   //关闭窗口
				System.exit(0);  //退出系统
			}
		});
	}
}
public class window {
	public static void main(String args[]){
		//声明定义并实例化一个MyWindow类的对象window
		//这里的参数    我的第一个窗口    实际上就对应于MyWindow类的构造函数参数s
		MyWindow window=new MyWindow("我的第一个窗口");
	}
}
