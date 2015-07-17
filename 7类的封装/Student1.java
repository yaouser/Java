/*
 * 成员变量和成员方法的继承
 * 子类和父类中有相同的变量名和方法名时子类会覆盖父类中的
 */
class Person{
	protected String name;  //保护成员
	protected int age;
	void setdata(String n1,int a1){
		name=n1;
		age=a1;
	}
	public void print(){
		System.out.println(name+","+age);
	}
}
public class Student1 extends Person{
	protected String dept;
	public static void main(String args[]){
		Person p1=new Person();
		p1.setdata("张军",21);
		p1.print();
		Student1 s1=new Student1();
		s1.setdata("王丽华", 20);  //调用父类的成员方法
		s1.print();  
	}
}
