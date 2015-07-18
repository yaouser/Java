import java.awt.*;
public class FirstWindow {
	public static void main(String[] args){
		Frame f1=new Frame();  //创建一个无标题窗口f1
		Frame f2=new Frame("我是标题");  //创建一个带标题的窗口f2
		f1.setSize(100, 100);  //设置第一个窗口的大小为100*100
		f2.setSize(200,100);  //设置第二个窗口
		f1.setVisible(true);  //设置第一个窗口可见
		f2.setVisible(true);  //设置第二个窗口可见
	}
}
