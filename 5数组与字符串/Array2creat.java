/*
 * 二维数组结构示例
 */
public class Array2creat {
	public static void main(String args[]){
		int a2[][]={{12,34},{-5},{3,5,7}};
		int i,j;
		System.out.println("二维数组a2的长度为： "+a2.length);
		for(i=0;i<a2.length;i++){
			System.out.println("a2["+i+"]的长度为："+a2[i].length);
			for(j=0;j<a2[i].length;j++)
				System.out.print("a2["+i+"]["+j+"]="+a2[i][j]+"\t");
			System.out.println();
		}
	}
}
