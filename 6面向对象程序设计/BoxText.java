/*
 * 默认的构造方法
 * 在类的定义中可以不定义构造方法，而其他类任然可以通过调用new classname()来实例化某类
 * 对象。这是因为系统给没有定义构造方法的类自动加入了一个特殊的构造方法，这个方法不带参数且方法体
 * 为空，称为默认的构造方法。
 * 重载构造方法
 * 在一个类中可以定义多个构造方法，以便对类对象提供不同的初始化的方法，供用户选用。这些构造方法
 * 具有相同的名字，而参数的个数或参数的类型不相同。这称为构造方法的重载。
 */
class Box{
	private int height;
	private int width;
	private int length;
	public Box()     //定义一个无参数的构造方法
	{
		height=10;
		width=10;
		length=10;
	}
	public Box(int h,int w,int l)   //定义一个3个参数的构造方法
	{
		height=h;
		width=w;
		length=l;
	}
	public int volume(){
		return height*width*length;
	}
}
public class BoxText {
	public static void main(String[] args){
		Box box1=new Box();
		System.out.println("Box1 volume: "+box1.volume());
		Box box2=new Box(15,20,25);
		System.out.println("Box2 volume: "+box2.volume());
	}
}
