/*
 * 内部类是在一个类的声明里声明的类，也称为嵌套类。
 * 内部类可以作为外部类的一个成员使用，可以直接访问和引用它的外部类的所有变量
 * 和方法。
 */
class Outer{
	int outer_i=100;
	void test(){
		Inner in=new Inner();  //成员变量i指向Inner类的对象
		in.display();    //调用内部类Inner的方法
	}
	class Inner{
		void display(){
			System.out.println("display:outer_i="+outer_i);
		}
	}
}
class InnerClassDemo{
	public static void main(String[] args){
		Outer outer=new Outer();
		outer.test();
	}
}

