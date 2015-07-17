import java.io.*;
public class j306 {
	public static void main(String arg[]) throws IOException
	{
		char ch;
		int count=0;    //对count初始化
		System.out.println("请输入一个字符，以‘#’结束输入：");
		ch=(char)System.in.read();    //对ch赋值，接受第一个字符
		while(ch!='#')
		{
			//输出字符对应的ASCII值
			System.out.println("字符"+ch+"的ASCII值为："+(int)ch);
			System.in.skip(2);   //跳过回车键
			count=count+1;       //字符个数增1
			ch=(char)System.in.read();
		}
		System.out.println("输入的字符共"+count);
	}
}
