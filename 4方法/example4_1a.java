import java.io.*;
public class example4_1a {
	public static void main(String args[ ])
	{
		long f=1;
		int x=1;
		for(x=3;x>0;x--) {
			f*=x;
		}
		System.out.println("3!="+ f);
		f=1;
		for(x=6;x>0;x--) {
			f*=x;
		}
		System.out.println("6!="+f);
		f=1;
		for(x=9;x>0;x--) {
			f*=x;
		}
		System.out.println("9!= "+f);
	}
}
