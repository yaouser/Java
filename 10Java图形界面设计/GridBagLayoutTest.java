import java.awt.*;
public class GridBagLayoutTest {
	public static void main(String[] args){
		MyGridBagLayout jb1=new MyGridBagLayout("GridBayLayout 示例");
	}
}
class MyGridBagLayout extends Frame{
	MyGridBagLayout(String s)	//MyGridBayLayout类的构造函数
	{
		super(s);
		//实例化GridBagLayout对象gridbag
		GridBagLayout gridbag=new GridBagLayout();
		//实例化GridBagConstraints对象c
		GridBagConstraints c=new GridBagConstraints();
		setLayout(gridbag);   //设置布局为gridbag
		c.fill=GridBagConstraints.BOTH;  //设置属性fill
		//该属性指明改行所放置的组件在容器放大时，分配额外水平空间的比例
		c.weightx=1.0;
		//调用自定义方法addButton加入按钮，以下3个按钮按相同属性配置
		addButton("按钮1",gridbag,c);
		addButton("按钮2",gridbag,c);
		addButton("按钮3",gridbag,c);
		//设置第4个按钮为第一行最后一个组件
		c.gridwidth=GridBagConstraints.REMAINDER;
		addButton("按钮4",gridbag,c);
		c.weightx=0.0;
		addButton("按钮5",gridbag,c);
		//指定按钮6为当前列以加组件“按钮5”的下一个组件
		c.gridwidth=GridBagConstraints.RELATIVE;
		addButton("按钮6",gridbag,c);
		//设置第7个按钮为第3行最后一个组件
		c.gridwidth=GridBagConstraints.REMAINDER;
		addButton("按钮7",gridbag,c);
		c.gridheight=2;  //指定“按钮8”占有2行1列
		c.gridwidth=1;
		c.weighty=1.0;
		addButton("按钮8",gridbag,c);
		c.gridheight=1;   //指定“按钮9”占有1列
		//指定“按钮9”为当前行最后一个组件
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.weighty=0;
		addButton("按钮9",gridbag,c);
		addButton("按钮10",gridbag,c);
		setSize(300,200);
		setVisible(true);
	}
	void addButton(String label,GridBagLayout gridbag,GridBagConstraints c){
		Button b=new Button(label);
		gridbag.setConstraints(b,c);
		add(b);
	}
}
