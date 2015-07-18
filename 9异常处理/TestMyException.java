/*
 * 满足下列任何一种或多种情况就应该考虑自己定义异常类
 * 1 Java异常类体系中不包含所需要的异常类型
 * 2 用户需要将自己所提供的异常与其他人提供的异常进行区分
 * 3 类中将多次抛出这种类型的异常
 * 4 如果使用其他程序包中定义的异常类，将影响程序包的独立性与自包含性
 */
class MyException extends Exception{  //自定义异常类
	MyException(){}
	MyException(String msg){ super(msg); }
}
class UsingMyException{  //抛出异常类
	Void f() throws MyException{
		System.out.println("Throws MyException from f()");
		throw new MyException();
	}
	Void g() throws MyException{
		System.out.println("Throws MyException from g()");
		throw new MyException("originated in g()");
	}
}
public class TestMyException {   //捕获并处理异常
	public static void main(String args[]){
		UsingMyException m=new UsingMyException();  //创建自定义异常类对象
		try{
			m.f();
		}
		catch(MyException e){
			e.printStackTrace();
		}
		try{
			m.g();
		}
		catch(MyException e){
			e.printStackTrace();
		}
	}
}

