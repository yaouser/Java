/*
 * Random类
 * Random()：建立一个随机数生成器。
 * Random(Long):用一个指定数作为种子值，建立一个随机数生成器。
 * 一般方法主要用于产生不同类型的随机数，常用的方法有以下几种。
 * NextInt() 返回一个均匀分布的Int型随机数，即在Int型范围内产生一个随机数。
 * NextLong() 返回一个均匀分布的Long型随机数。
 * NextFloat() 返回一个(0,1)区间的Float型随机数。
 * NextDouble() 返回一个(0,1)区间的Double型随机数。
 * setSeed(Long) 对用重载构造方法创建的随机对象，重设种子值。
 * 
 * Vector类
 * Vector是一个动态数组，他可以根据需要动态伸缩。Vector类还提供了一些有用的
 * 方法，如增加和删除元素的方法，而这些操作在数组中一般来说必须手工完成。
 * 1 属性
 * protected int capacityIncrement 当向量的大小超过容量时，向量容量的增长量。
 * protected int elementCount  这个Vector对象中的组件数。
 * protected Objected[] elementData  存储向量的组件的数组缓冲区
 * 2 构造器
 * Vector() 构造一个空间量。
 * Vector(Collection c) 构造一个包含给定集合中的元素的向量。
 * Vector(int initialCapacity) 构造一个具有给定的初始容量的空向量
 * Vector(int initialCapacity,int capacityIncrement) 
 * 构造一个具有给定的初始容量和容量增量的空向量
 * 3 常用的方法
 *   1 向向量中添加对象。
 *   void addElement(Object obj) 在向量的最后增加一个元素
 *   void insetElementAt(Object obj,int index) 在向量的指定位置插入一个元素
 *   2 从向量中删除对象
 *   void removeAllElement() 删除向量中的所有对象
 *   void removeElementAt(Object ob) 删除向量中一个指定的对象（仅删除第一次出现的对象）
 *   void removeElementAt(int index) 删除向量中一个指定位置上的对象
 *   3 搜索向量中的对象
 *   Object firstElement() 返回这个向量的第一个对象
 *   Object lastElement()  返回这个向量的最火一个对象
 *   Object ElementAt(int index) 返回这个向量中指定位置的对象
 *   Boolean contains(Object elem) 如果这个向量在这个对象中，则返回true
 *   4 获取向量的基本信息
 *   int capacity() 返回这个向量的当前容量
 *   int size()  返回这个向量的对象个数
 */
import java.util.*;
public class VectorTest extends Vector{
	public VectorTest(){super(1,1);}
	public void addInt(int i){  //向向量中添加一个整型对象
		addElement(new Integer(i));
	}
	public void addFloat(float f){  //向向量中添加一个浮点型对象
		addElement(new Float(f));
	}
	public void addString(String s){  //向向量中添加一个字符串对象
		addElement(s);
	}
	public void addCharArray(char a[]){  //向向量中添加一个字符
		addElement(a);
	}
	public void printVector(){   //打印向量中的所有对象
		Object o;
		int length=size();
		System.out.println("Number of vector elements is "+length+" and they are:");
		for(int i=0;i<length;i++){
			o=elementAt(i);
			if(o instanceof char[]){
				System.out.println(String.copyValueOf((char[])o));
			}
			else
				System.out.println(o.toString());
		}
	}
	public static void main(String args[]){
		VectorTest v=new VectorTest();
		int digit=5;
		float real=3.14f;
		char letters[]={'a','b','c','d'};
		String s=new String("Hello!");
		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);
		v.addCharArray(letters);
		v.printVector();
	}
}
