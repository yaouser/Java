public class Conversation {
	public static void main(String [] args)
	{
		String str="123";
		int j;
		byte b;
		int i=257;
		double d=323.142;
		System.out.println("\nConversation of int to byte.");
		b=(byte)i;   	//强制转换
		System.out.println("i and b "+ i + " "+b);
		System.out.println("\nConversation of double to int.");
		i=(int)d;  	//强制转换
		System.out.println("d and i "+d+" "+i);
		b=(byte)d;  	//强制转换
		System.out.println("d and b "+d+" "+b);
		j=Integer.parseInt(str);
		System.out.println("j="+j);
	}
}
