import java.io.*;
public class j321 {
	public static void main(String arg[])
	{
		int i,j;
		loop:         //标签
			for(i=2;i<=100;i++)
			{
				for(j=2;j<i;j++)
				if((i%j)==0)
					continue loop;
				if(j>=i)
					System.out.println(i+"\t");
			}
	}
}


