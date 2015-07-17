/*
 * 类的定义
 * [public][abstract][final] class className [extends superClass]
 * [implements interface{interface}]
 * 其中修饰符public,abstract或final说明了类的属性；class是定义类的关键字；extends
 * 关键字表示类继承了以"superClass"为类名的父类；implements关键字表示类实现了
 * "interface"列出的各个接口。
 * 类的成员变量
 * [public|protected|private][static][final][transient][volatile]type variableName;
 * 其中修饰符public,protected,private说明了对象成员变量的访问权限，其他修饰符如下：
 * static属性用来限制该成员变量为类变量，表示它们可被类的所有对象共享。没有用static修饰符
 * 的成员变量为示例变量。
 * final用来声明一个常量，对于用final限定的常量，在程序中不能修改它的值。
 * transient用来声明一个暂时性变量，在默认情况下，类中所有变量都是对象永久状态的一部分，
 * 当对象被保存到外存时，这些变量必须同时被保存；同transient限定的变量则指示Java虚拟机，
 * 该变量并不属于对象的永久状态，从而不能被永久存储。
 * volatile表示该变量有可能被多个线程所改变，提示编译器不应该将该变量优化，这可避免读到不正确的值。
 */
public class MyClass {
	int a;   //默认的整型变量
	public String b="Hello";  //公有的字符串型变量
	final char c='c';    //字符型常量
	private boolean d;   //私有的布尔型变量
}
