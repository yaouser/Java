import java.io.*;
public class j206 {
	public static void main(String arg[])
	{
		int x=1,y=2;
		int num1=5,num2=5,num3=5,num4=5;

		boolean r1,r2,r3,r4;

		r1=x>y & num1++==5; //两边表达式都运算
		r2=x>y && num2++==5; //只运算左边表达式
		r3=x<y | num3++==5;  //两边表达式都运算
		r4=x<y | num4++==5;  //只运算左边表达式

		System.out.println("逻辑值：r1="+r1+","+"num1="+num1);
		System.out.println("逻辑值：r2="+r2+","+"num2="+num2);
		System.out.println("逻辑值：r3="+r3+","+"num3="+num3);
		System.out.println("逻辑值：r4="+r4+","+"num4="+num4);
	}
}


