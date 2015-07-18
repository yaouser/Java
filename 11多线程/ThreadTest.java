/*
 * 通过Runnable接口创建线程
 * 1 定义一个类实现Runable接口，即在该类中提供run()方法的实现
 * 2 把Runnable的一个实例作为参数传递给Thread类的一个构造方法，该实例对象提供线程体run()
 */
public class ThreadTest {
	public static void main(String args[]){
		Thread t1=new Thread(new Hello());
		Thread t2=new Thread(new Hello());
		t1.start();
		t2.start();
	}
}
class Hello implements Runnable{
	int i;
	public void run(){
		while(true){
			System.out.println("Hello"+i++);
			if(i==5) break;
		}
	}
}
