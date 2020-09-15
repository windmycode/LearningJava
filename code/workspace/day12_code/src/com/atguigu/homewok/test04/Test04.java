package com.atguigu.homewok.test04;

/*
 * 属性没有多态性。多态性现象：编译时类型与运行时类型不一致
 * 属性都是按照编译时类型处理的。
 */
public class Test04 {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.num);//a编译时类型就是A  1
		System.out.println(((B)a).num);//编译后，因为a被强制成B类，是B类型  2
		System.out.println(((A)((B)a)).num);//编译后，a转成B又转成A，是A类型   1
		System.out.println("-------------------");
		B b = new B();
		System.out.println(b.num);//b编译时类型就是B   2
		System.out.println(((A)b).num);//b被强制升级为A类型，按A类型处理， 1
		System.out.println(((B)((A)b)).num);//b先转A又转B，最终是B类型  2
	}
}
class A{
	int num = 1;
}
class B extends A{
	int num = 2;
}
