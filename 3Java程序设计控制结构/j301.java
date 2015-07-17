import java.io.*;
public class j301 {
	public static void main(String arg[]) throws IOException
	{
		int x;
		double y;
		String str;           			//声明字符串类
		BufferedReader buf;   			//声明缓冲数据流类
		System.out.print("请输入一个数：");
		buf= new BufferedReader(new InputStreamReader(System.in));
		str=buf.readLine();
		x=Integer.parseInt(str);
		y=Math.sqrt(x);       			//求平方根
		System.out.println(x+"的平方根为： "+y);  //显示计算结果
	}
}

