/*
 * 方法的覆盖  子类继承超类中可被子类访问的成员方法，如果子类方法与超类方法
 * 同名，则不能继承，此时子类的方法称为覆盖（override）了超类中的那个方法。
 * 在进行覆盖时，应注意一下3点：
 * 1 子类不能覆盖超类中声明为final或static的方法。
 * 2 子类必须覆盖超类中声明为abstract的方法，或者子类也声明为abstract。
 * 3 子类覆盖超类中同名方法时，子类方法声明必须与超类被覆盖方法的声明一样。
 */
class Person2{
	static int count=0;
	protected String name;
	protected int age;
	public Person2(String n1,int a1){
		name=n1;
		age=a1;
		this.count++;   //超类对象计数
	}
	public String toString(){
		return this.name+","+this.age;
	}
	public void print(){
		System.out.println("本类名="+this.getClass().getName()+" "+"超类名="+this.getClass().getSuperclass().getName()+" ");
		System.out.print("Person2.count="+this.count+" ");
		System.out.print("SuperStudent.count="+SuperStudent.count+" ");
		Object s1=this;
		if(s1 instanceof Person2)   //判断对象属于哪个类
		{
			System.out.println(s1.toString()+"是Person类对象。");
		}
		if(s1 instanceof SuperStudent){
			System.out.println(s1.toString()+"是SuperStudent类对象。");
		}
	}
}
public class SuperStudent extends Person2{
	static int count=0;  //隐藏了超类的count
	protected String dept;
	protected SuperStudent(String n1,int a1,String d1)
	{
		super(n1,a1);   //调用超类的构造方法
		dept=d1;
		this.count++;   //子类对象计数
	}
	public String toString()   //覆盖超类的同名方法
	{
		return super.toString()+", "+dept;  //调用超类的同名方法
	}
	public void print()    //覆盖超类的命名方法
	{
		super.print();     //调用超类的方法
		System.out.println("super.count="+super.count); //引用超类变量
		System.out.println("this.count="+this.count);
	}
	public static void main(String args[]){
		Person2 p1=new Person2("王小明",21);
		p1.print();
		SuperStudent s1=new SuperStudent("张小云",19,"计算机系");
		s1.print();
	}
}
