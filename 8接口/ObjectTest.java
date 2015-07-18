/*
 * Java基本类库
 * java.lang  语言包是Java语言的核心。这个包中的所有类都由系统自动导入。
 * java.io  输入，输出包（I/O）提供所有用于输入，输出的类，以实现对外部设备的
 * 输入，输出，文件的读写，存储器的读写等操作。
 * java.util 使用包提供各种工具的类和界面，也提供多种数据类型和有关的操作方法。
 * java.net  网络包提供有关网络的类和界面，以此实现各种网络功能。
 * java.awt  抽象窗口工具包提供实现文本，图形，窗口的类和图形用户界面（GUI）。
 * awt还包括java.awt.image和java.awt.peer两个软件包。
 * java.awt.image  提供用于高级图形处理的类。
 * java.awt.peer  提供有关图形组件和窗口的类和界面。
 * java.applet  提供各种功能的Applet
 * 
 * Object类      
 * Object类是所有类的父类，Java类的继承关系图上处于根部（root），所有class
 * 的对象（包括数组对象）都继承了Object的方法。
 * Object类的及格常用方法：
 * boolean equals(Object obj)  比较两个对象是否相等。  circle1.equals(circle2)
 * final Class getClass()  返回正在运行对象的类信息，如类名和父类等。
 * void getClassName(Object obj)
 *        {System.out.println("The object's class is:"+obj.getClass().getName());}
 * String toString()  把对象信息转换为字符串，在Object中，返回一个对象的内部状态，
 * 这个状态以字符串形式表现。
 * System.out.println(circle1.toString())
 */
class A    //A类默认继承Object类
{
	public String toString()  //重写Object类的toString()方法
	{
		return "A is for ObjectTest class";
	}
}
public class ObjectTest {
	public static void main(String[] s){
		A a1=new A();
		A a2=new A();
		A a3=a1;
		System.out.println("a1.equals(a1) is "+a1.equals(a1));
		System.out.println("a1.equals(a2) is "+a1.equals(a2));
		System.out.println("a1.equals(a3) is "+a1.equals(a3));
		System.out.println(a1.toString());
		System.out.println("a1 is a instance of class "+a1.getClass().getName());
	}
}
