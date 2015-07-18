import java.awt.*;
import java.awt.event.*;
public class KeyPress extends KeyAdapter{
	Frame f;
	public static void main(String[] args){
		new KeyPress();
		System.out.println("请任意按下一个键：");
	}
	public KeyPress(){
		f=new Frame("按键测试");
		f.addKeyListener(this); //给窗口加上键盘事件监听器
		f.setSize(200,150);
		f.setVisible(true);
	}
	public void keyPressed(KeyEvent event){
		System.out.println("您按下的键的编码为："+event.getKeyCode());
		System.out.println("您按下的键的名称为："+event.getKeyModifiersText(event.getModifiers()));
		System.out.println("您按下的键的文字为： "+event.getKeyText(event.getKeyCode()));
	}
	public void keyTyped(KeyEvent event){
		System.out.println("您按下的键的字符为："+event.getKeyChar());
	}
}

