/*
 * 继承是一种已有类创建新类的机制。
 * 从现在类出发定义一个新类，称为新类继承了现有的类，其中被继承的现有类叫做超
 * 类（superclass）或父类，继承的新类由继承而得到的类称为子类（subclass）。
 * 在Java中规定，一个父类可以同时拥有多个子类，但一个子类只能有一个父类，即单
 * 重继承而且允许多层继承。
 */
class A{
	int a1=1;
	public int a2=2;
	protected int a3=3;
	private int a4=4;
	int geta4(){
		return a4;
	}
}
class B extends A{
	int b=5;   //添加新的数据成员b，同时B类还有从A类继承过来的数据成员
			   //a1，a2，a3和成员方法geta4()
}
class C extends B{
	int c=6;   //添加新的数据成员c
	void change()  //添加新的方法change()
	{
		a1+=10;a2+=10;a3+=10;b+=10;c+=10;
	}
}
public class MyClass {
	public static void main(String args[]){
		A aa=new A();
		System.out.println("A: "+aa.a1+" "+aa.a2+" "+aa.a3+" "+aa.geta4());
		B bb=new B();
		System.out.println("B: "+bb.a1+" "+bb.a2+" "+bb.a3+" "+bb.geta4()+" "+bb.b);
		C cc=new C();
		System.out.println("C: "+cc.a1+" "+cc.a2+" "+cc.a3+" "+cc.geta4()+" "+cc.b+" "+cc.c);
		cc.change();
		System.out.println("C: "+cc.a1+" "+cc.a2+" "+cc.a3+" "+cc.geta4()+" "+cc.b+" "+cc.c);
	}
}

