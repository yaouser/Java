import java.io.*;
public class j304 {
	public static void main(String arg[]) throws IOException
	{
		int x;
		String str;
		BufferedReader buf;
		System.out.print("请输入学生成绩（0~100）之间：");
		buf=new BufferedReader(new InputStreamReader(System.in));
		str=buf.readLine();
		x=Integer.parseInt(str);
		if(x>=85)
			System.out.println("成绩优秀！");
		else if(x>=75)
			System.out.println("成绩良好！");
		else if(x>=60)
			System.out.println("成绩及格！");
		else 
			System.out.println("成绩不及格！");
	}
}

