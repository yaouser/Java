/*
 * Date类    Date()用系统日期和时间构造一个日期对象。
 * Date d1=new Date(05,09,10)
 * Date(int,int,int,int,int):用YMDHM构造一个日期对象。
 * Date(int,int,int,int,int,int):用YMDHMS构造一个日期对象。
 * Date(long):用UTC值构造一个日期对象。
 * Date(String):用一个字符串构造一个日期对象。 
 * 示例：用字符串技术获取小时数，分钟数和秒数，并测试一个循环所消耗的时间
 */
import java.util.*;
public class Datetest {
	public static void main(String args[]){
		Date date1=new Date();
		System.out.println("日期及时间是："+date1);
		String temp=date1.toString();
		temp=temp.substring(11,temp.indexOf('C')); //获取时分秒部分
		System.out.println(temp);
		double sum=0.0;
		for(double i=0;i<=1000000;i++){
			sum=sum+i;
		}
		System.out.println(""+sum);
		Date date2=new Date();
		temp=date2.toString();
		temp=temp.substring(11,temp.indexOf('C'));
		System.out.println("现在的时间是："+temp);
	}
}
