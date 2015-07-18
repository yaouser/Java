/*
 * 接口是用来实现类似多重继承功能的一种结构，它在有属性和方法，接口间也可以形
 * 成继承关系，但接口和类有着很大的区别，它的属性都是常量，方法都是抽象方法，
 * 没有方法体，所以它的名字也就称为“接口”。
 * 接口有如下特点：
 * 1 接口用关键字interface来定义，而不是class。
 * 2 接口中定义的变量全部是静态变量，而且都是最终的静态变量。
 * 3 接口中没有自身的构造方法，而且定影的方法都是抽象方法，即只提供方法的定
 * 义，而不提供具体的实现。
 * [public] interface 接口名 [extends 父接口列表] {......}
 * 一个接口可以有多个父接口，用逗号隔开
 * [修饰符] class 类名 [extends 超类名] [implements 接口名1,接口名2,...]
 * 接口的实现类似于继承，只是不用extends，而是用关键字implements声明一个类将
 * 实现一个接口
 * 抽象类
 * 某些类在现实世界中是不能直接找到其对应的实例的，如“车”这个类，不可能为它找
 * 到一个对应的事物，因为现实世界中只有汽车，自行车，火车等事物，而它们都是扯
 * 得子类，不能说是车这个类的实例，这样的类称为抽象（abstract）类。
 * abstract 返回值类型方法名([形参]);   //是否有形参，根据具体情况
 * 接口与抽象类二者之间的区别：
 * 1 接口中的所有方法都是抽象的，而抽象类可以定义带有方法体的不同方法。
 * 2 一个类可以实现多个接口，而只能继承一个抽象父类
 * 3 接口与实现它的类不构成类的继承体系，即接口不是类体系的一部分。因此，不相
 * 关的类也可以实现相同的接口。而抽象类是属于一个类的继承体系，并且一般位于类
 * 的体系的顶层。
 */
import java.util.*;
//将Shape定义为interface
interface Shape{
	void draw();
	void erase();
}
//定义Circle类实现Shape
class Circle implements Shape{
	public void draw(){
		System.out.println("Calling Circle.draw()");
	}
	public void erase(){
		System.out.println("Calling Circle.erase()");
	}
}
//定义Square类实现Shape
class Square implements Shape{
	public void draw(){
		System.out.println("Calling Square.draw()");
	}
	public void erase(){
		System.out.println("Calling Square.erase()");
	}
}
//定义Triangle类实现Shape
class Triangle implements Shape{
	public void draw(){
		System.out.println("Calling Triangle.erase()");
	}
	public void erase(){
		System.out.println("Calling Triangle.erase()");
	}
}
//包含main()的测试类
public class NewShapes {
	static void drawOneShape(Shape s){
		s.draw();
	}
	static void drawShapes(Shape[] ss){
		for(int i=0;i<ss.length;i++){
			ss[i].draw();
		}
	}
	public static void main(String[] args){
		Random rand=new Random();
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++){
			switch(rand.nextInt(3)){
			case 0:s[i]=new Circle();break;
			case 1:s[i]=new Square();break;
			case 2:s[i]=new Triangle();break;
			}
		}
		drawShapes(s);
	}
}
