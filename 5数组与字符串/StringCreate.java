/*
 * 利用new方法创建String类字符串示例。
 * 设计思路：利用new声明并初始化赋值7个String类字符串s1,s2,s3,s4,s5,s6,s7.
 * 7次赋值使用了7种不同的构造方法。
 */
public class StringCreate {
	public static void main(String args[]){
		char chars1[]={'a','b','c','d','e','f'};
		String s1=new String();   //创建空字符s1
		String s2=new String(chars1);  //由字符串chars1,创建字符串s2
		String s3=new String(chars1,3,3);  //由数组chars1的指定部分，创建字符串s3
		byte asc[]={65,66,67,68,69};
		//由字节数组asc,创建字符串s4，值是"ABCDE"
		String s4=new String(asc);
		//由字节数组asc的指定部分,创建字符串s5，值是“CDE”
		String s5=new String(asc,2,3);
		//数组hz构成“面向对象”4各汉字。-61与-26组合成汉字“面”，其余类推
		byte hz[ ]={-61,-26,-49,-14,-74,-44,-49,-13};
		//用字节数组hz按缺省的字符串编码方案创建串对象s6
		String s6=new String(hz);
		//从数组hz下标为2的字节开始，取连续的4个字节{-49，-14，-74，-44}创建串对象
		String s7=new String(hz,2,4);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("s4="+s4);
		System.out.println("s5="+s5);
		System.out.println("s6="+s6);
		System.out.println("s7="+s7);
	}
}
