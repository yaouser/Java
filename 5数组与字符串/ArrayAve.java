/*
 * 计算数组元素的平均值
 */
public class ArrayAve {
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7};
		int j;
		System.out.println("数组a各元素的值为：");
		for(j=0;j<a.length;j++) {
			System.out.print(a[j]+"\t");
		}
		System.out.println();
		System.out.println("数组a的平均值为：");
		//a数组作实际参数不带括号
		System.out.println(arrayAaverage(a));
	}
	static float arrayAaverage(int x[ ]){
		float ave=0f;
		for(int i=0;i<x.length;i++) {
			ave=ave+x[i];
		}
		ave=ave/x.length;
		return ave;
	}
}
