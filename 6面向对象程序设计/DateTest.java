/*
 * 方法重载
 * 方法的重载是允许在一个类的定义中，多个方法使用相同的方法名。
 * 构造方法      构造方法是类的一种特殊方法
 * [public|protected|private] class_name([argument_list])
 * {
 * 		statements
 * }
 * public:任何类都能够创建这个类的实例对象。
 * protected:只有这个类的子类以及与该类在同一个包中的类可以创建这个类的实例对象。
 * private:没有其他类可以实例化该类。此时，这个类中可能包含一个具有public权限的方法
 * 只有这些方法可以构造该类的对象并将其返回。
 * 没有权限指定:只有该类在同一个包中的类可以创建这个类的实例对象。
 * 构造方法不同于一般的成员方法，其特征如下：
 * 1 构造方法是一种特殊的类成员方法，在创建每个新的类对象时自动执行，以保证新对象的各成员
 * 有合法，确定的数值。
 * 2 构造方法与类名相同，并且不能定义返回值。
 * 3 使用new操作符是自动调用构造方法，返回类型为对象实例。
 * 4 构造方法只能在创建类对象时由系统隐含调用，而不能直接引用。
 * 5 用于分配对象所需要的全部资源；另外还可创建多个构造方法（重载）。
 */
class DateClass
{
	int year,month,day;
	DateClass(int y,int m,int d)	//类的构造方法
	{
		year=y;
		month=m;
		day=d;
	}
	boolean isleapyear(){
		return (year%400==0)||((year%100!=0)&&(year%4==0));
	}
	void print(){
		System.out.println("date is "+year+"-"+month+"-"+day);
	}
}
public class DateTest {
	public static void main(String args[]){
		DateClass d=new DateClass(2006,8,9);  //创建对象的同时初始化
		d.print();
		System.out.println(d.year+" is a leap year:"+d.isleapyear());
	}
}
