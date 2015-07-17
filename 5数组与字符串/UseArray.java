import java.io.*;
public class UseArray {
	public static void main(String arg[]){
		int i,j,max,temp;
		//定义数组并初始化
		int a[]={3,0,6,7,5,2};
		//求数组最大值
		max=a[0];
		for(i=1;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		System.out.println("数组最大值为"+max);
		//对数组排序（升序）
		for(i=0;i<a.length-1;i++)
			for(j=i+1;j<a.length;j++)
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		//输出排序之后的数组
		System.out.println("数组排序之后的结果为");
		for(i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
	}
}
