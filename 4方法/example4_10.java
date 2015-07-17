import java.applet.Applet;
public class example4_10 {
	static String nameStr="同学";   //定义全局变量
	public static void main(String args[])
	{
		printOne();
		printTwo();
	}
	static void printOne()
	{
		String okStr="不要太烦恼！ ";   //定义局部变量
		System.out.println(nameStr+", "+okStr);
	}
	static void printTwo()
	{
		String okStr="只要努力就好！ ";   //定义局部变量
		System.out.println(nameStr+", "+okStr);
	}
}
