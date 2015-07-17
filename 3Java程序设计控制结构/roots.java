import java.io.*;
public class roots {
	public static void main(String [] args)
	{
		int a,b,c;
		float x1,x2;
		int check;
		a=1;
		b=2;
		c=1;
		check=b*b-4*a*c;  	//判定式
		if(check==0)     	//如果有重根
		{
			x1=(-b)/(2*a);
			x2=x1;
			System.out.println("x1=x2="+x1);
		}
		else if(check>0)   //如果有不同两个根
		{
			x1=(-b+(float)Math.sqrt(check))/(2*a);  //根1
			x2=(-b-(float)Math.sqrt(check))/(2*a);  //根2
			System.out.println("x1="+x1);
			System.out.println("x2="+x2)
		}
		else    //否则无根
		{
			System.out.println("No roots");
		}
	}
}
