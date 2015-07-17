/*
 * 栈  掌握接口的使用方法
 * 先定义一个字符栈的接口CharStackInterface，接口中定义了栈的空间容量，规定了
 * 栈所包含的方法，然后定义栈类CharStack，该类实现了字符栈接口。
 */
import java.awt.*;
import java.awt.event.*;
interface CharStackinterface{    //定义栈的接口
	final int maxsize=100;
	void initStack();
	boolean push(char x);
	char pop();
	boolean empty();
	boolean full();
}
class CharStack implements CharStackinterface{ //定义栈类，该类实现了栈接口
	char data[];
	int top;
	CharStack(){
		data=new char[maxsize];
	}
	public void initStack(){
		top=-1;
	}
	public boolean push(char x){
		if(!full()){
			data[++top]=x;
			return true;
		}
		else{
			return false;
		}
	}
	public char pop(){
		if(!empty()){
			top--;
			return data[top+1];
		}
		else
			return '\0';
	}
	public boolean empty(){
		return top==-1;
	}
	public boolean full(){
		return top==maxsize-1;
	}
}
class StackDemo{
	public static void main(String args[]){
		CharStack s=new CharStack();
		s.initStack();
		s.push('A');
		s.push('B');
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
