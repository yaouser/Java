import java.io.*;
public class j311 {
	public static void main(String arg[])
	{
		int[][] array={{10,78,57,89,37},{64,5,23,45,76}};//二维数组初始化
		int find=5;
		int i=0,j=0;
		boolean flag=false;
		found:
			for(;i<array.length;i++)
			{
				for(j=0;j<array.length;j++)
					if(array[i][j]==find)
					{
						flag=true;
						break found;   //终止外层循环
					}
			}
		if(flag==true)
			System.out.println("Found "+find+" at index:"+i+","+j);
		else
			System.out.println("not found!");
	}
}
