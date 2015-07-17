/*
 * 查找与替换的方法
 * char charAt(int index)  //该方法返回字符串中第index个字符
 * int indexOf(int ch)  //返回字符ch在字符串中第一次出现的位置
 * int indexOf(int ch, int pos)  //同上，但比较位置是从pos位置开始向后进行的
 * int lastIndexOf(int ch)   //返回字符ch在字符串最后一次出现的位置
 * int lastIndexOf(int ch,int pos) //同上，但比较位置是从pos位置开始向前进行的
 * 字符串中字符，子字符串的替换用replace()方法，形式有：
 * String replace(char oldChar,char newChar)  //用字符newChar替换当前字符串中所有的字符oldChar
 * String replaceFirst(String srt1, String srt2) //同上，当时替换遇到的第一个srt1子串
 * String replaceAll(String srt1,String srt2)  //同上，
 * 转换与除去多余空格方法
 * String toLowerCase()  //将字符串所有字符转换成小写
 * String toUpperCase()  //将字符串所有字符转换成大写
 * String trim()    //去掉字符串开头和结尾的空格。但字符串中间的空格保留
 * 
 * 求每一个位置上的字符与字符替换示例
 */
public class charAtOp {
	public static void main(String args[]){
		String s="Hi,你好！";
		int l=s.length();
		System.out.println("字符串s为："+s);
		System.out.println("字符串s的长度为："+1);
		for(int i=0;i<1;i++){
			char c=s.charAt(i);
			System.out.println("s中的第"+i+"个字符是："+c);
		}
		String s0=" I am a 学生， I am a 男生。";
		String s1=s0.replace(' ','_');
		String s2=s0.replaceFirst("I am a ","We are ");
		String s3=s0.replaceAll("I am a ", "我是");
		System.out.println("s0="+s0);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
	}
}
