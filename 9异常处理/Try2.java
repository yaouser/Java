/*
 * 使用try-catch-finally语句捕获和处理异常
 * try{  语句1  }
 * catch(ExceptionType1 e){
 *          语句2    }
 * finally{  语句3   }
 * 其中，语句1 是可能产生异常的代码；语句2 是捕获某种异常对象时进行处理的代码，Exception1
 * 代表某种异常类，e为相应的对象； 语句3 是其后必须执行的代码，无论是否捕获到异常。
 * catch语句可以有一个或多个，但至少要有一个catch语句，finally语句可以省略。
 */
public class Try2 {
	public static void main(String args[]){
		int i=0;
		int a[]={5,6,7,8};
		for(i=0;i<5;i++){
			try{
				System.out.println("a["+i+"]="+a[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("数组下标越界异常！");
			}
			finally{
				System.out.println("finally i="+i);
			}
		}
	}
}

