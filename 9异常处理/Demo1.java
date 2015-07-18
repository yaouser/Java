/*
 * 由方法抛出异常交给系统处理
 * 对于程序中需要处理的异常，一般编写try-catch-finally语句捕获并处理；而对于程序
 * 中无法处理必须由系统处理的异常，可以使用throw语句在方法中抛出异常交系统处理。
 * 
 * 例   对于文件流操作，将必须捕获的系统定义的异常交由系统处理
 */
public class Demo1 {    //异常用法举例
	static int a,b,c;
	public static void main(String args[]){
		try{
			a=100;
			b=Integer.parseInt(args[0]);
			if(b==13)
				throw(new ArithmeticException());  //方法中抛出异常
			c=a/b;
			System.out.println("a/b="+c);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("没有命令行第一个参数");
		}
		catch(ArithmeticException e){
			System.out.println("算术运算错误");
		}
	}
}

