/*
 * 多态是在一棵继承树中可以有多个同名但不同方法及不同形参的方法。通常有两种途
 * 径实现多态；
 * 方法的重载和覆盖。
 * 方法重载时：（在同一个类中）
 * 1 参数必须不同及参数个数不同，类型也可以不同。
 * 2 返回值可以相同，也可以不同。
 */
class Person1{
	static int count=0;
	protected String name;
	protected int age;
	public Person1(String n1,int a1){
		name=n1;
		age=a1;
		count++;
	}
	public Person1(String n1){
		//构造方法重载
		this(n1,0);  //调用本类的构造方法
	}
	public Person1(int a1){
		//构造放安防重载
		this("未知名",a1);
	}
	public Person1(){
		//构造方法重载
		this("未知名");
	}
	public void print(){
		System.out.print(this.getClass().getName()+" ");
		System.out.print("count="+this.count+" ");
		System.out.println(" "+name+", "+age);
	}
}
public class Student extends Person1{
	protected String dept;
	Student(String n1,int a1,String d1){
		super(n1,a1);
		dept=d1;
	}
	Student(){
		this("未知名",0,"未知系");
	}
	public static void main(String args[]){
		Person1 p1=new Person1("王小红",21);
		p1.print();
		Person1 p2=new Person1("张小云");
		p2.print();
		Person1 p3=new Person1(19);
		p3.print();
		Person1 p4=new Person1();
		p4.print();
		Student s1=new Student("赵小丽",19,"计算机系");
		s1.print();
		Student s2=new Student();
		s2.print();
	}
}
