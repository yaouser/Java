import java.io.*;
public class example4_1b {
	public static void main(String args[ ])
	{
		fact(3);
		fact(6);
		fact(9);
	}
	static void fact(int n)
	{
		int x=n;
		long f=1;
		for(;x>0;x--) {
			f*=x;
		}
		System.out.println(n+"!="+f);
	}
}
