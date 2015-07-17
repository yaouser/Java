import java.io.*;
public class example4_8 {
	public static void main(String args[ ])
	{
		int i=0;
		int j=0;
		for(i=0;i<8;i++)
		{
			System.out.println("i in for loop: "+i); //i在定义它的程序块内
			j+=i;   //j在定义它的程序块所包含的程序块内
		}
		System.out.println("i out of for loop: "+i); //i在定义它的程序块内
		System.out.println("j: "+j);   //j在定义它的程序块内
	}
}

