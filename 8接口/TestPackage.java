/*
 * 什么是包
 * 如果编写的程序代码较繁杂，参加编写的人员较多，很可能由于类的命名和引用问题
 * 引发冲突。为此，Java提供了一种叫做“包（package）”的机制，从而避免了命名冲
 * 突的发生。所谓“包”就是一个区别类命名空间的机制，它是Java提供的类的组织方式。
 * 包对应一个文件夹，包中还可以有包，称为包等级。
 * 创建一个包非常简单，在Java源文件的最开始包含一个package语句即可。
 * 包的定义
 * package pkg1[.pkg2[.pkg3...]];
 * 包的使用
 * import pkg1[.pkg2[,.pkg3. ...]].(classname|*);
 */
import MyPackageTwoD.*;   //引用MyPackageTwoD中的所有类
public class TestPackage {
	public static void main(String args[]){
		Point p=new Point(1,2);
		Rectangle r1=new Rectangle(p,10,10);
		System.out.println("The area of the rectangle is "+r1.area());
	}
}

