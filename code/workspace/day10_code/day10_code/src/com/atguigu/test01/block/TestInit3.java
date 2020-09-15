package com.atguigu.test01.block;

public class TestInit3 {
	public static void main(String[] args) {
		Er r = new Er();//612645，因为子类重写了assign()
		
//		Ba b = new Ba();
	}
}
class Ba{
	private String str = assign();
	{
		System.out.println("(1)父类的非静态代码块");
	}
	public Ba(){
		System.out.println("(2)父类的无参构造");
	}
	public String assign(){
		System.out.println("(3)父类的assign()");
		return "ba";
	}
}
class Er extends Ba{
	private String str = assign();// 等价于this.assign()
	{
		System.out.println("(4)子类的非静态代码块");
	}
	public Er(){
		//super()  ==>调用父类的实例初始化方法，而且它在子类实例初始化方法的首行，实例化时，第一个执行
		
//难点： this在构造器中，在实例化初始方法中，代表的是正在创建的对象，Er r = new Er()，现在在创建子类的对象，
//		由于assign()被重写了，this.assign()调用的是子类的assign()
		System.out.println("(5)子类的无参构造");
	}
	
	public String assign(){
		System.out.println("(6)子类的assign()");
		return "er";
	}
}