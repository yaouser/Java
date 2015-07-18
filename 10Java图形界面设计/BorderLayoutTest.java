import java.awt.*;
public class BorderLayoutTest {
	public static void main(String[] args){
		Frame f=new Frame("BorderLayout 示例");
		//设置布局为BorderLayout,并指定组件间隔为5
		f.setLayout(new BorderLayout(5,5));
		Button btn1=new Button("东");
		Button btn2=new Button("南");
		Button btn3=new Button("西");
		Button btn4=new Button("北");
		Button btn5=new Button("中");
		f.add(btn1,BorderLayout.EAST);
		f.add(btn2,BorderLayout.SOUTH);
		f.add(btn3,BorderLayout.WEST);
		f.add(btn4,BorderLayout.NORTH);
		f.add(btn5,BorderLayout.CENTER);
		f.setSize(400,250);
		f.setVisible(true);
	}
}

