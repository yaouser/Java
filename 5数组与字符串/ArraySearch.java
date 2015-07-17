import java.util.Arrays;
/*
 * 调用binarySearch方法在数组中查找指定的值。
 * 设计思路：可以直接使用数组类Arrays提供的binarySearch方法实现查找要求。
 * public static int binarySearch(Xxx a[], Xxx v)
 * 该方法用折半查找算法在指定的数组a查找值为v的元素。
 * 如果在数组a查找到值为v的元素，则返回该元素的下标；否则，返回一个负值r,位置-（r+1）为
 * v应该插入的位置。
 */
public class ArraySearch {
	public static void main(String args[]){
		char ch []={'a','b','c','e','f','h','i'};
		//char ch []={'h','f','c','d','e','a','b'};
		char key='f';
		int pos;
		System.out.println("数组为：");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		System.out.println("");
		//char key='a';
		pos=Arrays.binarySearch(ch, key);
		if(pos<0)
			System.out.println("元素"+key+"在数组中不存在");
		else
			System.out.println("元素"+key+"在数组中的位置为"+pos);
	}
}
