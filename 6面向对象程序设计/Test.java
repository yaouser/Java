class A{
	static String a;  //类变量（静态变量）
	String b;         //实例变量
}
public class Test {
	public static void main(String args[]){
		A obj1=new A();   //类A的对象1
		A obj2=new A();   //类A的对象2
		//在此代码中如果给x赋值，那么obj1.a和obj2.a指的是同一个内存空间，无论那个
		//对象修改都是对一个a进行操作
	}
}
