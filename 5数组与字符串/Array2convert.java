/*
 * 二维数组的转置与输出
 */
public class Array2convert {
	public static void main(String args[]){
		int a[][]={{11,12,13},{21,22,23},{31,32,33},{41,42,43}};
		int b[][]=new int[3][4];
		int i,j;
		System.out.println("数组a各元素的值为：");
		for(i=0;i<4;i++){
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
		for(i=0;i<4;i++)
			for(j=0;j<3;j++)
				b[j][i]=a[i][j];
		System.out.println("数组b各元素的值为：");
		for(i=0;i<3;i++){
			for(j=0;j<4;j++)
				System.out.print(b[i][j]+"\t");
			System.out.println();
		}
	}
}
