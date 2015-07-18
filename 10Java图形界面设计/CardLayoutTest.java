import java.awt.*;
import java.awt.event.*;
//引用接口ActionListener，这是按钮事件编程所必须的，implements为关键字
public class CardLayoutTest implements ActionListener{
	//由于要在不同函数中使用，所以f和card必须定义成全局变量
	Frame f;
	CardLayout card;
	public CardLayoutTest()   //类CardLayoutTest的构造函数
	{
		Frame f=new Frame("CardLayout 示例");
		Button btn1=new Button("第一张卡片");
		Button btn2=new Button("第二张卡片");
		Button btn3=new Button("第三张卡片");
		btn1.addActionListener(this);   //给按钮增加事件监听器
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		CardLayout card=new CardLayout(10,10);  //设置卡片和容器的间隔距离
		f.setLayout(card);
		f.add(btn1,"C1");
		f.add(btn2,"C2");
		f.add(btn3,"C3");
		f.setSize(100,80);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new CardLayoutTest();     //实例化类对象
	}
	public void actionPerformed(ActionEvent e){
		card.next(f);  //重写抽象方法，指定当单击按钮时显示下一卡片
	}
}
