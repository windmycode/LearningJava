/*
����

1����������
��1�����������������
���˰���������ƾͱȽϳ��ˣ����ȫ���ƾͱ�Ϊ�ˣ���.����
����:
	java.util.Scanner ��Scanner���ȫ����
	java.lang.String��String���ȫ����
	java.lang.System��System���ȫ����
	java.lang.Math��Math���ȫ����
��2��������֯�����ڶ����
java.io����IO(�������)�й�
java.util���͸��ֳ��ù������й�
java.lang������ϵͳ��
java.net�����������й�
java.sql�������ݿ����й�
��3�����ڷ���Ȩ�޿���
���ĳ�����ĳ��������Ȩ�����η�ʡ�ԣ���ô�ͽ����ڱ���ʹ��

2�������������
�﷨��ʽ��
package ����;

��仰��Ҫ��
��1��һ��.javaԴ�ļ�ֻ����һ��
��2��������Դ�ļ��Ĵ�������

�����������淶��
��1�����е��ʶ�Сд��ÿ������֮����.�ָ�
��2��ϰ�����ù�˾���������� + ģ����
���磺com.atguigu.xx;
      com.mysql.xxx
	  com.alibaba.xxx
	  org.aphache.xxx
	  
һ��������
		com����ҵ
		org����Ӫ������֯
		gov������
		edu������
		....

3����α����������
�˽⣺
	javac -d . Դ�ļ���.java		
4��������д�������
�˽⣺
	java ��.����
5�����ʹ������������
ǰ�᣺��ʹ�õ�����Ա��Ȩ�����η���������ʹ��
��ʽ��
��1��ʹ��ȫ���ƣ���.����
��2��ʹ��import��� + ������	

˵����
��import �����д��  package�����class����֮���
�ڵ��������Ժܶ�䣬����ͬ������
��java.lang��������Բ�ʹ��import��䣬��ֱ��ʹ�ü�����
���磺System��String��Math....
�ܿ���ͬʱ����ͬһ�����еĺܶ���
import ��.*;
����������˲�ͬ��������������ͬ
���磺
	java.util.Date
	java.sql.Date
ֻ��һ��ѡ��ʹ��ȫ���ƣ�һ��ʹ�ü����ƣ�����ͬʱʹ�ü�����
*/
package com.atguigu.pkg;

import com.atguigu.bean.*;
import java.util.Date;
//import java.sql.Date;

class Test01_Package{
	public static void main(String[] args){
		System.out.println("hello pkg");
		
		//������һ��������
		Circle c1 = new Circle(1.2);
		//com.atguigu.bean.Circle c1 = new com.atguigu.bean.Circle(1.2);
		c1.printInfo();
		
		Rectangle r1 = new Rectangle();
		
		
		
	}
}
