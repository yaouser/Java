/*
 * 字符串比较示例
 * “==”不管对那种方式产生的字符串对象，都是比较两个对象的内存地址，仅在地址
 * 相同时，结果才为true。
 * 而equals方法比较的是两个字符串对象的内容。
 */
import java.io.*;
public class compchar {
	public static void main(String args){
		String str1=new String("Very well"); //使用类的构造方法
		String str2=new String("Very well");
		String str3="Very well";    //使用双引号赋值法
		String str4="Very well";
		System.out.println(str1+" "+str2+" "+str3+" "+str4);
		System.out.println(str1==str2);  //false
		System.out.println(str3==str4);  //true
		System.out.println(str2==str3);  //false
		System.out.println(str1.equals(str2));  //true
		System.out.println(str3.equals(str4));  //true
		System.out.println(str2.equals(str3));  //true
	}
}
