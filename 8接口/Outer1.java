/*
 * 在内部类中访问同名的外部类成员，需要加上修饰符   this.
 */
public class Outer1{
	private int size;
	public class Inner1{
		private int size;
		public void doIncrease(int size){
			size++;    //存取本方法的参数size
			this.size++;   //存取内部类的成员变量
			Outer1.this.size++;   //存取其外部类Outer的成员变量
			System.out.println("size in Inner. doIncrease():"+size);
			System.out.println("size in Inner class: "+this.size);
			System.out.println("size in Outer class: "+Outer1.this.size);
		}
	}
	Inner1 i=new Inner1();
	public void increaseSize(int s){
		i.doIncrease(s);  //调用内部类Inner的方法
	}
	public static void main(String[] a){
		Outer1 outer=new Outer1();
		outer.increaseSize(10);
	}
}
