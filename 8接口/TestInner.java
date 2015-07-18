/*
 * 在外部以外的其他类中访问内部类。对于可以在外部类之外访问的内部类，引用内部
 * 类时必须使用完整的标示：外部类名.内部类名。
 * 例如，假设类B是类A的内部类，则在其他类中要以下列格式访问类B：
 * A a=new A();
 * A.B b=new B();
 */
class Outer3{
	private int size;
	class Inner2{
		void doIncrease(){
			size++;
			System.out.println("The size value in Outer class: "+size);
		}
	}
}
public class TestInner {
	public static void main(String[] a){
		Outer3 out=new Outer3();
		Outer3.Inner2 in=out.new Inner2();
		in.doIncrease();
	}
}
