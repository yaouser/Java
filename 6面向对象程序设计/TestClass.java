/*
 * 类的方法
 * [modify] type methodName([parameter])
 * {方法体}
 * 其中[modify]可以用public,private,protected修饰，type是返回值类型，表明
 * 方法执行以后，返回的执行结果的数据类型。可是Java的任何数据类型，这种类型必须和方法体中
 * return语句后面的表达式类型一致。
 * 如果局部变量的名字和类的成员变量的名字相同，则类的成员变量被隐藏，如果要将该类成员变量
 * 显露出来，则需在该变量前加上修饰符this。
 */
import java.io.*;
public class TestClass {
	private int x=1;
	private int y=1;
	private int z=1;
	void changeVar(int a,int b,int c){
		x=a;    //给类成员变量x赋值
		int y=b;   //y使同名类成员变量隐藏
		int z=9;   //z使同名类成员变量隐藏
		System.out.println("In changVar: "+"x="+x+" y="+y+" z="+z);
		this.z=c;   //给类成员变量z赋值
	}
	String getXYZ(){
		return "x="+x+" y="+y+" z="+z;
	}
	public static void main(String args[]){
		TestClass t=new TestClass();
		System.out.println("Before changVar:"+t.getXYZ());
		t.changeVar(10,10,10);
		System.out.println("After changeVar:"+t.getXYZ());
	}
}
