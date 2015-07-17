import java.io.*;
public class j204 {
	static int x=5;  	//定义变量x为类变量
	public static void main(String arg[])
	{
		int y=23;   	//定义变量y为局部变量
		System.out.println("x="+x);
		System.out.println("y="+y);
		m(6);      	//调用方法m（）
	}
	static void m(int z)
	{
		System.out.println("z="+z);
		System.out.println("x="+x);
	}
}

