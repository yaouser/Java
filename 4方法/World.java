import java.io.*;
public class World {
	public static void main(String args[])
	{
		ChinaPeople cp=new ChinaPeople();
		AmericanPeople ap=new AmericanPeople();
		BeijingPeople bp=new BeijingPeople();
		
		cp.speakHello();
		ap.speakHello();
		bp.speakHello();
		cp.averageHeight();
		ap.averageHeight();
		bp.averageHeight();
		cp.averageWeight();
		ap.averageWeight();
		bp.averageWeight();
		cp.ChinaKongfu();
		ap.americanBoxing();
		bp.beijingOpera();
		bp.ChinaKongfu();
	}
}
abstract class people{
	protected double height=0;
	protected double weight=0;
	abstract public void speakHello();
	abstract public void averageHeight();
	abstract public void averageWeight();
}
class ChinaPeople extends people{
	public ChinaPeople(){
		height=173.8;
		weight=67.34;
	}
	public void speakHello(){
		System.out.println("你好，吃饭了吗？ ");
		
	}
	public void averageHeight(){
			System.out.println("中国人平均身高："+height);
	}
	public void averageWeight(){
		System.out.println("中国人平均体重："+weight);
	}
	public void ChinaKongfu(){
		System.out.println("坐如钟，站如松，卧如弓");
	}
}
class AmericanPeople extends people{
	public AmericanPeople(){
		height=183.8;
		weight=78.6;
	}
	public void speakHello(){
		System.out.println("How do you do!");
	}
	public void averageHeight(){
		System.out.println("American average height:"+height);
	}
	public void averageWeight(){
		System.out.println("American average weight:"+weight);
	}
	public void americanBoxing(){
		System.out.println("直拳，勾拳");
	}
}
class BeijingPeople extends ChinaPeople{
	public BeijingPeople(){
		height=166.8;
		weight=67.4;
	}
	public void speakHello(){
		System.out.println("吃了没，你哪？ ");
	}
	public void averageHeight(){
		System.out.println("北京人平均身高："+height);
	}
	public void averageWeight(){
		System.out.println("北京人平均体重："+weight);
	}
	public void beijingOpera(){
		System.out.println("京剧术语");
	}
}
