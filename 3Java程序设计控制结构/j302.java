import java.io.*;
public class j302 {
	public static void main(String arg[]) throws IOException
	{
		int x;
		double y;
		String str;
		BufferedReader buf;
		System.out.print("请输入一个数：");
		buf=new BufferedReader(new InputStreamReader(System.in));
		str=buf.readLine();
		x=Integer.parseInt(str);
		if(x>=0)
		{
			y=Math.sqrt(x);
			System.out.println(x+"的平方根为："+y);
		}
	}
}
