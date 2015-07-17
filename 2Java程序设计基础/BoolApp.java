import java.io.*;
public class BoolApp {
	public static void  main(String args[])
	{
		int a=25,b=7;
		boolean d = a<b;
		System.out.println("a<b="+d);
		int c=3;
		if(c!=0 && a/c>5)
			System.out.println("a/c="+a/c);
		int e=0;
		if(e!=0 && a/e>5)
			System.out.println("a/e="+a/e);
		else
			System.out.println("e="+e);
	}
}
