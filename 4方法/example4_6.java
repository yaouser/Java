public class example4_6 {
	static void star_n(int n)
	{
		for(int i=1;i<=n;i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	public static void main(String args[])
	{
		int x;
		for(x=1;x<=5;x++) {
			star_n(x);
		}
	}
}

