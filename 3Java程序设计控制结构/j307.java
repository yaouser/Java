import java.io.*;
public class j307 {
	public static void main(String arg[]) throws IOException
	{
		char ch;
		int count=0;
		System.out.println("请输入字符，以‘#’结束输入： ");
		do
		{
			ch=(char)System.in.read();
			System.out.println("字符"+ch+"的ASCII值为："+(int)ch);
			System.in.skip(2);
			count=count+1;
		}while(ch!='#');
		System.out.println("输入的字符串共："+count);
	}
}
