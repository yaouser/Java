import java.io.*;
public class j308 {
	public static void main(String arg[])
	{
		int i,sum;    //定义变量
		/*
		 * 方法1
		 */
		sum=0;       //给存放累加和的变量赋初值0
		for(i=1;i<=100;i++) {  	//求累加和的循环开始
			sum=sum+i;    	//求累加和
		}
		System.out.println("1+2+...+100="+sum);
		/*
		 * 方法2
		 */
		for(sum=0,i=1;i<=100;sum=sum+i,i++);  //循环语句
		System.out.println("1+2+...+100="+sum);
		/*
		 * 方法3
		 */
		i=1;sum=0;   //赋初值
		for(;;)
		{
			sum=sum+i;     		//求累加和
			if(i>=100) break;   	//退出循环条件
			i++;         		//加数自加
		}
		System.out.println("1+2+...+100="+sum);
	}
}


