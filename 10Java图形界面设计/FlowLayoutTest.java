/*
 * FlowLayout布局实例
 * 
 */
import java.awt.*;
import java.awt.event.*;
public class FlowLayoutTest extends Frame {
	public FlowLayoutTest(String s){
		super(s);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		});
	}
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("你没有输入命令行参数！");
			System.exit(0);
		}
		//取得命令行参数
		String buttonString = args[0];
		//从命令行的参数输入得到显示的按钮数目
		int buttonNumber = Integer.parseInt(buttonString);
		//实例化FlowLayoutTest对象f
		FlowLayoutTest f=new FlowLayoutTest("FlowLayout 测试");
		//按参数创建按钮数组
		Button[] btn=new Button[buttonNumber];
		//给窗口添加布局，FlowLayout.LEFT参数指定所有组件局左对齐
		f.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		for(int i=0;i<buttonNumber;i++){
			btn[i]=new Button("按钮"+(i+1));
			//将按钮添加到窗口中
			f.add(btn[i]);
		}
		f.setSize(250,100);
		f.setVisible(true);
		
	}
}

