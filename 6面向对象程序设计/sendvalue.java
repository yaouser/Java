/*
 * 方法的调用  参数传递
 * 在赋值方式中，只是把实参的值赋给形参，两者的名称不论是否相同，总是代表两个数据，使用 不同
 * 的存储单元，形参作为局部变量，只在方法内起作用，退出这个方法调用时自动释放，对应的实参
 * 任然保留原来的值。
 */
public class sendvalue {
	public static void main(String[] args){
		int x=10;
		System.out.println("x is: "+x);
		sendvalue mychange=new sendvalue();
		mychange.changeX(x); //将x的值传递给changeX()方法的形参x
		System.out.println("At last x is: "+x);
	}
	public void changeX(int x)  //这里的形参x和main()中的x占用不同的内存
	{
		for(int i=0;i<10;i++)
			x++;    //对传递过来的值进行改变
		System.out.println("x in changeX() is: "+x);
	}
}

