/*
 * 示例一维数组的构建与输出，并求数组平均值
 */
import java.io.*;
public class Array1creat {
	public static void main(String args[]){
		int num1[]={1,2,3,4,5,6};
		int num2[];
		int j;
		float ave=0f;
		System.out.println("数组num1各元素的值为： ");
		for(j=0;j<num1.length;j++)
			System.out.print(num1 [j]+"\t");
		System.out.println();
		System.out.println("数组num1的长度为："+num1.length);
		num2=num1;
		System.out.println("数组num2各元素的值为：");
		for(j=0;j<num2.length;j++){
			System.out.print(num2 [j]+"\t");
			ave = ave + num2[j];
		}
		System.out.println();
		ave=ave/num2.length;
		System.out.println("数组num2的平均值为："+ave);
	}
}
