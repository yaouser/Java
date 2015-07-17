/*
 * 字符串类使用
 * 本案例演示数组的使用。用随机函数产生一组整数，排序后在另一个文本框中输出，
 * 并求出这组数的和，直接在窗体上显示。
 * 利用Math.random()函数产生一组随机整数，存放到数组中。单击按钮时排序和求和。
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ArrayDemo extends Frame implements ActionListener{
	TextField t1=new TextField(40);
	TextField t2=new TextField(40);
	Button b1=new Button("排序并求和");
	int a[];        //定义数组
	public ArrayDemo(){
		setLayout(new FlowLayout(FlowLayout.LEFT));  //设置布局
		add(t1);
		add(b1);
		add(t2);
		a=new int[10];
		for(int i=0;i<10;i++){
			a[i]=(int)(Math.random()*100);   //用随机函数产生数值
			if(i==0)
				t1.setText(""+a[i]);
			else
				t1.setText(t1.getText()+","+a[i]);
		}
		b1.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		});
	}
	public static void main(String args[]){
		ArrayDemo mainFrame=new ArrayDemo();
		mainFrame.setSize(400,300);
		mainFrame.setTitle("数组排序和求和");
		mainFrame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		sort();    //排序
		t2.setText("");
		for(int i=0;i<a.length;i++){
			//在文本框t2中输出排序结果
			if(i==0)
				t2.setText(""+a[i]);
			else
				t2.setText(t2.getText()+","+a[i]);
		}
		Graphics g=this.getGraphics();  //取出窗体的Graphics对象，以便输出数组的和
		g.drawString("sum="+getSum(), 100, 100);  //在窗体上直接输出和
	}
	long getSum()    //求和
	{
		long s=0;
		for(int i=0;i<a.length;i++)
			s=s+a[i];
		return s;
	}
	void sort(){
		int t;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++)
				if(a[i]>a[j])
				{t=a[i];a[i]=a[j];a[j]=t;}
		}
	}
}

