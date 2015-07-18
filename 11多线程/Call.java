/*
 * 打电话
 * 
 * 学习线程同步控制的方法
 */
import java.awt.*;
import java.awt.event.*;
class Receiver{    //接电话者
	public synchronized void call(String CallerName,String msg){
		int tim;
		System.out.println("我在接"+CallerName+"打来的电话："+msg+",我在和他交谈。。。");
		try{
			tim=(int)(Math.random()*2000+1000); //接电话的时间，取1秒-3秒之间的随机数
			Thread.sleep(tim);
		}
		catch(InterruptedException e){}
		System.out.println("我接完"+CallerName+"的电话");
	}
}
class Caller implements Runnable{  //打电话者线程
	String name;
	Receiver r;
	String msg;
	Caller(String name,Receiver r,String msg){
		this.name=name;
		this.r=r;
		this.msg=msg;
	}
	public void run(){
		r.call(name, msg);
	}
}
public class Call {
	public static void main(String args[]){
		Receiver r=new Receiver();
		Caller s1=new Caller("张三",r,"你好吗？");
		Caller s2=new Caller("李四",r,"祝愿你万事如意");
		Caller s3=new Caller("王二",r,"新年好");
		Thread th1=new Thread(s1);
		Thread th2=new Thread(s2);
		Thread th3=new Thread(s3);
		th1.start();
		th2.start();
		th3.start();
		try{
			th1.join();
			th2.start();
			th3.start();   //等待线程结束
		}
		catch(InterruptedException e){}
	}
}

