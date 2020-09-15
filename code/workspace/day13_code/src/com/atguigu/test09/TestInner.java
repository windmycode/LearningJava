package com.atguigu.test09;

/*
 * 1、内部类：
 * 	 定义在另外一个类里面的类，就叫做内部类，为了区别，把外面的类称为外部类。
 * 
 * 2、分类
 * 根据内部类的所在的位置不同：
 * （1）成员内部类：外部类中方法外
 * （2）局部内部类：方法体内，（虽然也可以在代码块内，但是不讨论这个）
 * 
 * 
 * 成员内部类：
 * （1）有static修饰的：静态成员内部类，我们通常就简称为静态内部类
 * （2）没有static修饰的：非静态成员内部类，我们通常就简称为成员内部类
 * 【修饰符】  class  外部类{
 * 		【其他修饰符】  static class 静态成员内部类{
 * 		}
 * 		【其他修饰符】   class 非静态成员内部类{
 * 		}
 * }
 * 
 * 【修饰符】  class  外部类  【extends 父类】  【implements 父接口们】{
 * 		【其他修饰符】  static class 静态内部类   【extends 父类】  【implements 父接口们】{
 * 		}
 * 		【其他修饰符】   class 非静态成员内部类   【extends 父类】  【implements 父接口们】{
 * 		}
 * }
 * 说明：外部类、内部类的父类、父接口没有关系，各是各的
 * 
 * 
 * 局部内部类：
 * （1）有名字的局部内部类：简称局部内部类
 * （2）没名字的局部内部类：简称匿名内部类
 * 
 * 局部内部类的语法格式：
 * 【修饰符】  class  外部类  【extends 父类】  【implements 父接口们】{
 * 		【修饰符】 返回值类型   方法名(【形参列表】){
 * 				【修饰符】  class 有名字的局部内部类   【extends 父类】  【implements 父接口们】{
 * 					...
 * 				}
 * 		}
 * }
 * 
 * 匿名内部类的语法格式：
 * 	特殊
 */
public class TestInner{
	
}
