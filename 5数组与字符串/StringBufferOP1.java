/*
 * String类型的字符串一旦创建之后，其长度和内容就不再，这也是称其为字符串常量
 * 的原因。相反，
 * 与之对等的StringBuffer类表示了可以扩充，可以修改的字符串，或称为字符串变量。
 * 创建StringBuffer类对象
 * public StringBuffer() //构造一个空字符串，长度为16
 * public StringBuffer(int length) //构造一个长度为length的空字符串的缓冲区
 * public StringBuffer(String str)//构造一个内容为str的字符串
 * StringBuffer类对象的常用操作及方法
 * 1 分配/获取字符串的长度  void setLength(int newLength)    int length()
 * 2 分配/获取字符串的容量
 * void ensureCapacity(int minCapacity)   int capacity()
 * 3 字符串的检索和子串 voidgetChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
 * String substring(int begpos)    String substring(int begpos,int endpos)
 * 4 StringBuffer类对象的扩充与字符串类型转换
 * public StringBuffer append(Objectobj)
 * public StringBuffer insert(int 插入位置,参数对象类型,参数对象名)
 * 5 字符串的其他修改方法
 * StringBuffer delete(int begpos,int endpos)
 * StringBuffer deleteCharAt(int pos)
 * StirngBuffer reverse()
 * StringBuffer replace(int begpos, int endpos,String str)
 * void setCharAt(int pos,char ch)
 * 
 * StringBuffer类字符串常用操作实例1
 */
public class StringBufferOP1 {
	public static void main(String arg[]){
		StringBuffer strBuff1=new StringBuffer();
		strBuff1.append(1f);
		strBuff1.append(" 他是天才， ");
		strBuff1.append(100);
		strBuff1.append("%的天才。");
		System.out.println(strBuff1);
		System.out.println("");
		StringBuffer strBuff2=new StringBuffer("Java编程高手！");
		System.out.println(strBuff2);
		strBuff2.insert(0,2);
		System.out.println(strBuff2);
		strBuff2.insert(1, '、');
		System.out.println(strBuff2);
		strBuff2.insert(2, "我要做 ");
		System.out.println(strBuff2);
		System.out.println("");
		System.out.println("strBuff2.length()="+strBuff2.length());
		System.out.println("strBuff2.capacity()="+strBuff2.capacity());
	}
}
