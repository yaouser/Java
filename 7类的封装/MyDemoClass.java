class ParentClass{
	protected int n=3;
	protected void show_n(){
		System.out.println("n="+n);
	}
}
public class MyDemoClass extends ParentClass{
	public static void main(String args[]){
		MyDemoClass obj=new MyDemoClass();
		obj.show_n();  //在MyDemoClass类中直接访问父类中被保护的方法
		obj.n=18;      //直接访问父类中被保护的数据
		obj.show_n();
	}
}
