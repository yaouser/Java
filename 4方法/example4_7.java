import java.io.*;
public class example4_7 {
	static int sum_be(int posbegin, int posend)
	{
		int sum=0;
		for(int i=posbegin; i<=posend; i++)
		{
			System.out.println(" "+i);
			sum+=i;
		}
		System.out.println(" ");
		return sum;
	}
	public static void main(String args[])
	{
		int pb,pe,ss,count=0;
		pb=3;
		pe=10;
		count+=pe-pb+1;     	//求第一段数据的个数
		ss=sum_be(pb,pe);   	//求第一段数据的和
		pb=120;
		pe=130;
		count+=pe-pb+1;     	//求两段数据的个数
		ss=ss+sum_be(pb,pe);   	//求两段数据的和
		float average1=ss/count;   //求两端数据的平均值
		System.out.println("average="+average1);
	}
}
