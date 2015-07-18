import java.awt.*;
public class GridLayoutTest {
	public static void main(String[] args){
		Frame f=new Frame("GridLayout 示例");
		//给窗口添加2*3的GridLayout布局，组件间隔为5
		f.setLayout(new GridLayout(2,3,5,5));
		Button btn1=new Button("第一按钮");
		Button btn2=new Button("第二按钮");
		Button btn3=new Button("第三按钮");
		Button btn4=new Button("第四按钮");
		Button btn5=new Button("第五按钮");
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.pack();  //以紧凑方法显示窗口
		f.setVisible(true);
	}
}

