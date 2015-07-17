/*
 * ”java.util“包中，专门有一个数组类Arrays,该类提供了一些方法用于排序，查找
 * 等操作，在编制程序中可以直接使用这些方法。
 * 
 * 调用sort方法来对数组排序。
 */
import java.util.*;
public class ArraySort {
	public static void main(String args[]){
		//int a[]={9,1,3,4,2,5,7,8};
		char ch []={'h','f','c','d','e','a','b'};
		System.out.println("数组ch排序前为：");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		System.out.println();
		System.out.println("数组ch排序后为：");
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		System.out.println();
	}
}
