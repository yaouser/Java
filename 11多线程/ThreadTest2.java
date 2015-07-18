/*
 * 通过继承Thread类创建线程的步骤是
 * 1 从Thread类派生子类，并重写其中的run()方法定义线程体
 * 2 创建该子类的对象创建线程
 * 
 * 两种创建线程方法的比较
 * 1 直接继承线程Thread类。该方法编写简单，可以直接操作线程，适用于单重继承情况，
 * 因而不能再继承其他类。
 * 2 实现Runnable接口。当一个线程已继承了另一个类时，就只能实现Runnable接口的方法
 * 来创建进程，且便于保持程序风格一致。
 */
public class ThreadTest2 {
	public static void main(String args[]){
		Thread t1=new Thread(new Hello2());
		Thread t2=new Thread(new Hello2());
		t1.start();
		t2.start();
	}
}
class Hello2 extends Thread{
	int i;
	public void run(){
		while(true){
			System.out.println("Hello"+i++);
			if(i==5) break;
		}
	}
}
