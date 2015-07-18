/*
 * 内部类并非只能在类里定义，也可以在几个程序块的范围之内定义，甚至可以在for
 * 循环内部都可以定义内部类。
 */
class Outer2{
	int size=100;
	void test(){
		for(int i=0;i<5;i++){
			class Inner{
				void display(){
					System.out.println("display: size="+size);
				}
			}
			Inner inner=new Inner();
			inner.display();
		}
	}
}
public class InnerClassDemo1 {
	public static void main(String args[]){
		Outer2 outer=new Outer2();
		outer.test();
	}
}
