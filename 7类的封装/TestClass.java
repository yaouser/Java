/*
 * 重载是指在继承过程中，子类中的成员（包括数据和方法）与其父类中的成员同名，
 * 但功能不同，此时，子类的成员“覆盖“从父类继承过来的成员。
 * 在数据隐藏和方法覆盖后，子类成员覆盖了父类的同名成员，要访问父类的这些成
 * 员，需要super关键字来引用当前的父类。super的用法有3种情况。
 * 1 super.变量名：访问父类中被隐藏的成员变量。
 * 2 super.方法名（【参数表】）：调用父类中被重写的方法。
 * 3 super([参数表]):调用父类的构造方法，此时，可用super来表示父类的构造方法。
 */
class D {
	int x=1;
	void show(){
		System.out.println("class A: ");
	}
}
class E extends D{
	double x=7.8;  //子类E的成员变量double型的x隐藏了父类D的int型的x
	void show()    //子类E的成员方法覆盖了父类A的成员方法show()
	{
		System.out.println("class B: ");
	}
	void show1(){
		super.show();  //访问父类D的成员方法show()
		System.out.println(super.x);  //访问父类D的成员变量x
		show();          //访问本类B的成员方法show（）
		System.out.println(x);  //访问本类E的成员变量x
	}
}
public class TestClass {
	public static void main(String args[]){
		E bb=new E();
		bb.show1();
	}
}
