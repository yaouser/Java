class Student{
	private int no;   //学号
	private String name;    //姓名
	private char sex;    //性别
	private int age;   //年龄
	private static int count=0;   //静态成员，属于类的成员
	public Student(int no,String name,char sex,int age){ //构造方法
		this.no=no;
		this.name=name;
		this.sex=sex;
		this.age=age;
		count++;
	}
	public void show(){   //显示学生信息的方法
		System.out.println("no:"+no);
		System.out.println("name:"+name);
		System.out.println("sex:"+sex);
		System.out.println("age:"+age);
	}
}
public class StudentDemo {
	public static void main(String args[]){
		Student a=new Student(1,"Wang",'f',23);  //建立对象
		Student b=new Student(2,"zhang",'m',21);  //建立对象
		a.show();
		b.show();
		System.out.println("count:"); //显示学生数
	}
}
