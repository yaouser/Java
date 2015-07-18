import java.awt.*;
public class NullLayoutTest {
	public static void main(String[] args){
		Frame f=new Frame("NullLayoutTest示例");
		f.setLayout(null);  //设置空布局
		//创建一个标签对象name
		Label name=new Label("请输入姓名： ",Label.CENTER);
		f.add(name);
		//指定标签的大小和位置
		name.setBounds(50,50,80,50);
		//创建一个文本框对象T1
		TextField T1=new TextField();
		f.add(T1);
		//设置文本框大小
		T1.setSize(100,20);
		//指定文本框位置
		T1.setLocation(140,65);
		//创建一个文本区域对象Ta
		TextArea Ta=new TextArea("请输入你的简介。。。。。");
		f.add(Ta);
		Ta.setBounds(50,100,200,140);
		f.setSize(300,250);
		f.setVisible(true);
	}
}
