/*
 * 字符数组越界异常
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputDim {
	public static String input(){
		String result=null;
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			result=in.readLine();
		}
		catch(IOException e){
			System.out.println("IO exception!!!");
		}
		return (result);
	}
	public static void main(String[] args){
			int i;
			char dim[]=new char[8];
			String buffer;
			try{
				System.out.print("请输入字符：");
				buffer=input();
				for(i=0;i<buffer.length();i++)
					dim[i]=buffer.charAt(i);
				System.out.println("输入的字符序列为："+buffer);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("出现异常：数组越界！！！");
			}
		}
	}

