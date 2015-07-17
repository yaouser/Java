import java.io.*;
public class j305 {
	public static void main(String arg[]) throws IOException
	{
		char ch;
		System.out.print("请输入英文等级（A,B,C,D）： ");
		//接受从键盘上输入的一个数据把它转换成一个字符
		ch=(char)System.in.read();
		switch(ch)
		{
		case 'A':
		case 'a':System.out.println("成绩优秀！"); break;
		case 'B':
		case 'b':System.out.println("成绩良好！"); break;
		case 'C':
		case 'c':System.out.println("成绩及格！"); break;
		case 'D':
		case 'd':System.out.println("成绩不及格！"); break;
		default:System.out.println("输入错误！");
		}
	}
}
