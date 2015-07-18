/*
 * 线程同步是通过synchronized关键字实现的。被声明为同步的方法只能被线程顺序地使用
 * 将方法设置为同步的方式为
 * synchronized void myMethod() {  //修改同步成员的值     }
 * 在程序中，可能只想实现某一段代码的同步，而不是整个方法。这种情况下，可以使用如下的设置方法
 * synchronized(myObject) { //修改同步成员的值  }
 * 
 * 同步程序如果出现问题或者遇到异常，就可能出现死锁和饥饿两类问题。
 */
public class Syn implements Runnable{
	public void run(){
		for(int i=0;i<=2;i++){
			synchronized(System.out){  //同步输出
				System.out.println(Thread.currentThread().getName());
				System.out.println("Count:"+i);
			}
		}
	}
	public static void main(String args[]){
		Syn run=new Syn();
		Thread thread;
		for(int i=0;i<=2;i++){
			thread=new Thread(run);
			thread.start();
		}
	}
}
