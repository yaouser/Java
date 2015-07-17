import java.io.*;
public class j207 {
	public static void main(String arg[])
	{
		int a=12,b=-23,c=34;
		int max,min,t;
		//求三个数中的最大值
		t=a>b?a:b;
		max=t>c?t:c;
		//求三个数中最小值
		t=a<b?a:b;
		min=t<c?t:c;
		//显示结果
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}
