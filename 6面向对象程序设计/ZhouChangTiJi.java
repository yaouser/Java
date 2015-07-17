import java.io.*;

class circle   //圆类
{
	double radius;
	double mianJi;
	double zhouChang;
	final double PI=3.14159;
	
	circle(double r)   //带参数的构造方法
	{
		radius=r;
	}
	double calculateMianJi()   //计算面积
	{
		mianJi=PI*radius*radius;
		return (mianJi);
	}
	double calculateZhouChang()  //计算周长
	{
		zhouChang=PI*2*radius;
		return (zhouChang);
	}
}

class cylinder extends circle  //从圆类里派生出圆柱类
{
	double height;
	double tiJi;
	
	cylinder(double r, double h)	//构造方法
	{
		super(r);   //调用圆类的构造方法
		height = h;
	}
	double calculateTiJi()   //计算体积
	{
		calculateMianJi();    //计算面积
		tiJi=mianJi*height;
		return(tiJi);
	}
}
public class ZhouChangTiJi {
	public static void main(String[] args) throws IOException
	{
		String input;
		double radius;
		double height;
		System.out.print("请输入圆的半径： ");
		BufferedReader myRead=new BufferedReader(new InputStreamReader(System.in));
		//从键盘输入半径
		input=myRead.readLine();
		radius=Double.parseDouble(input);
		circle myCircle=new circle(radius);
		myCircle.calculateMianJi();
		myCircle.calculateZhouChang();
		System.out.println("圆面积是"+myCircle.mianJi);
		System.out.println("圆周长是"+myCircle.zhouChang);
		System.out.print("请输入圆柱的半径：");
		input=myRead.readLine();
		radius=Double.parseDouble(input);
		System.out.print("请输入圆柱的高度：");
		input=myRead.readLine();
		height=Double.parseDouble(input);
		cylinder myCylinder=new cylinder(radius,height);
		myCylinder.calculateTiJi();
		System.out.print("圆柱的体积是："+myCylinder.tiJi);
	}
}
