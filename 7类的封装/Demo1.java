/*
 * 封装的含义：类的设计把类设计成一个黑匣子，使用者只能看见类中定义公共变量和
 * 公共方法，而看不见方法的具体实现细节，也不能对类中非公共的数据进行操作。这
 * 样可以防止外部干扰和无用。
 * 封装的实现：Java定义了4种访问权限：public,protected,private和默认的。
 */
class p1
{
	public int x;    //定义公有变量
	public void set_x(int i){
		x=i;
	}
	public void show_x()   //定义公有方法
	{
		System.out.println("x="+x);
	}
}
public class Demo1 {
	public static void main(String args[]){
		p1 obj=new p1();
		obj.set_x(3);   //通过调用类的公有方法给公有变量赋值
		obj.show_x();   //通过调用类的公有方法显示公有变量的值
		obj.x=18;       //直接给obj对象的公有变量赋值
		System.out.println("x="+obj.x);  //直接输出公有变量的值
	}
}
