/*
 * 异常的处理优先级
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class jiecheng {
	public static long CalculateJieCheng(long n){ //递归计算阶乘
		long result;
		if(n==1)
			result=1;
		else 
			result=CalculateJieCheng(n-1)*n;
		return result;
	}
	public static long input(){    //从键盘输入要计算的数
		long result=0;
		String input;
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			input=in.readLine();
			result=Long.parseLong(input);
			if(result>10) throw new MyException();
		}
		catch(IOException e)   //IO异常
		{
			System.out.println("IO exception!!!");
		}
		catch(NumberFormatException e){
			int search=0;
			search=e.getMessage().indexOf("0x");
			
			if(search==-1)
				System.out.println("[出现异常]:输入的非整型错误，输入为实数");
			else
				System.out.println("[出现异常]:错误输入0x开头的16进制数");
			System.exit(0);
		}
		catch(MyException e){
			System.out.println("[出现异常]:输入数超出范围");
			System.exit(0);
		}
		return (result);
	}
	public static void main(String[] args){
		System.out.print("请输入要结算的阶乘数：");
		System.out.println("结果是： "+CalculateJieCheng(input()));
	}
}
