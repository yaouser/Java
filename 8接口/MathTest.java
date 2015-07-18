/*
 * Math类提供了用于几何学，三角学以及几种一般用途方法的浮点函数，来执行很多数
 * 学运算。
 * Math.E   Math.PI
 * Math类包含了常用的科学计算方法，如开方，指数运算，对数，三角函数等。这些方
 * 法都是静态方法,可以通过类名直接调用。
 */
public class MathTest {
	public static void main(String[] s){
		System.out.println("sin(π/2) is "+Math.sin(Math.PI/2.0));
		System.out.println("2的5次方是 "+Math.pow(2, 5));
		System.out.println("以e为底的对数是 "+Math.log(Math.E));
		System.out.println("64的平方根是 "+Math.sqrt(64));
	}
}

