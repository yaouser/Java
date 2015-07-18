/*
 * 哲学家用餐问题
 * 
 * 学习线程同步和通信的方法
 */
class ChopStick{  //筷子类
	boolean available;
	int n;
	ChopStick(int n){
		available=true;
		this.n=n;
	}
	public synchronized void takeup(String name){  //拿起筷子
		while(!available){
			System.out.println(name+"在等待拿起第"+n+"个筷子");
			try{
				wait();  //等待
			}
			catch(InterruptedException e){}
		}
		available=false;
	}
	public synchronized void putdown(){   //放下筷子
		available=true;
		notify();   //通知其他线程
	}
}
class Philosopher extends Thread{
	ChopStick left,right;
	String name;
	Philosopher(String name,ChopStick left,ChopStick right){
		this.name=name;
		this.left=left;
		this.right=right;
	}
	public void think(){    //思考问题
		left.putdown();
		right.putdown();
		System.out.println(name+"在思考。。。。。");
	}
	public void eat(){
		left.takeup(name);   //拿起左筷子
		right.takeup(name);  //拿起右筷子
		System.out.println(name+"在吃饭。。。。。");
	}
	public void run(){
		while(true){
			eat();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			think();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
public class Dining {
	static ChopStick cp[]=new ChopStick[5];
	static Philosopher ph[]=new Philosopher[5];
	public static void main(String args[]){
		for(int n=0;n<5;n++){
			cp[n]=new ChopStick(n);
		}
		for(int n=0;n<5;n++){
			ph[n]=new Philosopher("哲学家"+n,cp[n],cp[(n+1)%5]);
		}
		for(int n=0;n<5;n++){
			ph[n].start();
		}
	}
}

