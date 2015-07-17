import java.io.*;
public class Score {
	public static void main(String[] args){
		int a[]={90,87,67,81,89,96,76,71,91,57},i,sum=0;
		double ave;
		for(i=0;i<a.length;i++)
			sum+=a[i];  //求平均成绩
		ave=sum/10.0;
		System.out.println("Average="+ave);
		for(i=0;i<10;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(i=0;i<10;i++)   //求平均成绩和成绩差
			System.out.print(a[i]-(int)ave+" ");
	}
}

