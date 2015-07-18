/*
 * 抛出异常的方法与调用方法处理异常
 * 1 抛出异常的方法
 * 在方法声明中，添加throws子句表示该方法将抛出异常。
 * 2 由调用方法处理异常
 * 由一个方法抛出异常后，系统将异常向上传播，由调用它的方法处理这些异常。
 */
public class Try6 {
	public void calc(byte k) throws Exception{  //抛出异常
		byte y=1,i=1;
		System.out.print(k+"!=");
		for(i=1;i<=k;i++){
			try{
				if(y>Byte.MAX_VALUE/i)  //Integer类的常量，表示最大值
					throw new Exception("overflow");  //溢出时抛出异常
				else 
					y=(byte)(y*i);
			}
			catch(Exception e){
				System.out.println("exception:"+e.getMessage());
				e.printStackTrace();
				System.exit(0);
			}
		}
		System.out.println(y);
	}
	public void run(byte k){  //捕获并处理异常
		try{
			calc(k);
		}
		catch(Exception e){
			System.out.println("exception:"+e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static void main(String args[]){
		Try6 a=new Try6();
		for(byte i=1;i<10;i++)
			a.run(i);
	}
}

