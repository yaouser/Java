import java.io.*;
public class CountBytes {
	public static void main(String[] args) throws IOException{
		InputStream in;
		if(args.length==0)  //无参数
			in=System.in;   //在没有指定具体文件的情况下，使用System。in
		else 
			in=new FileInputStream(args[0]); //打开文件
		int total=0;
		while(in.read()!=-1)  //对文件中的字节数进行计数
			total++;
		System.out.println(total+"bytes");
	}
}
