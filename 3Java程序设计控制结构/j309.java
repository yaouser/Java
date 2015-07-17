import java.io.*;
public class j309 {
	public static void main(String arg[])
	{
		int i,j,sum;   
		for(i=1;i<1000;i++)
		{
			sum=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)    //判断是否为完数
				System.out.println(i+"\t");
		}
		System.out.println();
	}
}
