/*
 * 使用arraycopy方法复制数组
 * 方法：System。arraycopy(from,fromIndex,to,toIndex,count);
 * 该方法从数组from的索引fromindex位置起，复制count个元素到数组to的从索引
 * toindex位置开始的地方。
 */
public class UseArrayCopy {
	public static void main(String args[]){
		char a[]={'a','b','c','d','e','f','f'};
		char b[]=new char[7];
		int i;
		System.arraycopy(a, 1, b, 2, 3);
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
		for(i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println("");
	}
}
