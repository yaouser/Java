/*
 * 在引用方式中，用形参代替实参表中的数据，实参和形参的名称虽然不一定相同，但二者表示同一个
 * 数据，使用相同的存储单元。所以，引用方式调用中参数的传递是双向的，形参的改变影响实参的值。
 * 这对应于其他语言中的“地址”方式。
 */
public class PassTest {
	int ptVlaue;     //类PassTest的成员变量
	//参数类型是基本类型
	public void changeInt(int value)
	{value=20;}
	//参数类型是引用型，并且方法中改变了参数的值
	public void changeStr(String value)
	{value=new String("world");}
	//参数类型是引用型，并且方法中改变了参数所指向对象的成员变量的值
	public void changeObj(PassTest value)
	{ value.ptVlaue=200; }
	public static void main(String[] args)
	{
		String str;
		int val;
		PassTest pt=new PassTest();    //创建PassTest的对象
		//测试基本类型参数的传递，看调用程序对变量值是否改变
		val=10;
		pt.changeInt(val);
		System.out.println("Int value is: "+val);
		//测试引用类型参数的传递，看调用程序对变量值是否改变
		str=new String("Hello");
		pt.changeStr(str);
		System.out.println("Str value is:"+str);
		//测试引用类型参数的传递，看调用程序对变量值是否改变
		pt.ptVlaue=100;
		pt.changeObj(pt);
		System.out.println("pt value is:"+pt.ptVlaue);
	}
}
