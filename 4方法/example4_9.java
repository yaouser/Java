/*
 * 局部变量和全局变量（类成员变量）作用域示例
 */
import java.io.*;
class Variable2{
	int x=0;
	int y=0;
	int z=0;   //定义类的成员变量x,y,z并开始生效
	void init(int x,int y)
	{
		this.x=x;
		this.y=y;
		int z=5;    //定义局部变量z并开始生效
		System.out.println("** in init**");
		System.out.println("x="+x+" y="+y+" z="+z);
	}     //局部变量z此后失效
}
public class example4_9 {
	public static void main(String args[])
	{
		Variable2 v=new Variable2();
		System.out.println("**before init**");
		System.out.println("x="+v.x+" y="+v.y+" z="+v.z);
		v.init(20, 30);
		System.out.println("**after init**");
		System.out.println("x="+v.x+" y="+v.y+" z="+v.z);
	}
}
