/*
 * 使用throw语句抛出异常
 * throw <异常对象>
 * 其中，throw是关键字，异常对象是创建的异常类对象
 */
public class Try5 {
	public void run(byte k){
		byte y=1,i=1;
		System.out.print(k+"!=");  //不换行输出
		for(i=1;i<=k;i++){
			try{
				if(y>Byte.MAX_VALUE/i)   //Integer类的常量，表示最大值
					throw new Exception("overflow"); //溢出时抛出异常
				else
					y=(byte)(y*i);
			}
			catch(Exception e){
				System.out.println("exception:"+e.getMessage());
				e.printStackTrace();  //显示异常信息
				System.exit(0);
			}
		}
		System.out.println(y);
	}
	public static void main(String args[]){
		Try5 a=new Try5();
		for(byte i=1;i<10;i++)
			a.run(i);
	}
}
