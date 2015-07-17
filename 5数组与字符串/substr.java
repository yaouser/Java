/*
 * String类字符串对象是不可修改的。任何修改String类字符串对象的操作，都将导致长生一个新的字符串对象。
 * 字符串的连接。 String strC= strA.concat(strB)
 * 比较字符串可以利用String类提供的下列方法；
 * equals()与equalsIgnoreCase().后者将忽略字母大小写的区别。
 * compareTo() 判断一个字符串是< = >另一个字符串，对应这3种情况将分别返回一个大于0，等于0，小于0的正数。
 * 求子串的方法。
 * substring() 可从一个大的字符串中提取一个子串，该方法有两种常用的形式；
 * String substring(int begpos) //从begpos位置起，取出剩余的字符串
 * String substring(int begpos,int endpos) //该子串从begpos位置起，至endpos-1为止。
 * startWith()和endsWith() 判断字符串的前缀和后缀有两种方法
 * boolean startsWith(String prefix)  //判断当前字符串的前缀是否和prefix一致
 * boolean endsWith(Stirng suffix) //判断当前字符串的后缀是否和suffix一致
 * 
 * compareTo与求子字符串示例。
 */
import java.io.*;
public class substr {
	public static void main(String[ ] args){
		String strA="They are students ";
		String strB="他们是学生";
		String strC=strA.concat(strB);
		System.out.println(strC);
		System.out.println(strA.compareTo(strB));
		System.out.println(strB.compareTo(strC));
		System.out.println("strA.substring(6): "+strA.substring(6));
		System.out.println("strA.substring(6,12): "+strA.substring(6,12));
		System.out.println(strC.startsWith(strA));
		System.out.println(strC.startsWith("是学生")+" "+strC.endsWith("是学生"));
	}
}

