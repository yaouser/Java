/*
 * 多维数组矩阵转置
 */
public class Matrixt {
	public static void main(String[] args){
		int a[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		int b[][]=new int[4][3];
		int i,j;
		for(i=0;i<3;i++)    //利用两重循环进行转置
			for(j=0;j<4;j++)
				b[j][i]=a[i][j];
		for(i=0;i<4;i++){
			for(j=0;j<3;j++)   //利用两重循环进行显示
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}
}
