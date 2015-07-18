import java.awt.*;
import java.io.*;
public class FileTest extends Frame{
	public static void main(String args[]){
		FileTest Test=new FileTest();
		TextArea Ta=new TextArea();
		File f=new File("work","test"); //建立一个路径为work/test的File组件
		try{
			Ta.append(f.getPath()+"\n ");
			Ta.append(f.getParent()+"\n ");
			Ta.append(f.getName()+"\n ");
			Ta.append(f.getAbsolutePath()+"\n ");
			f.createNewFile();
			Ta.append(f.exists()+"\n ");
			Ta.append(f.length()+"\n ");
		}
		catch(IOException e){
			System.out.println("exception ");
		}
		Test.add(Ta,BorderLayout.CENTER);
		Test.setSize(300,300);
		Test.setVisible(true);
	}
}

