/*
1����������ĸ�ʽ��
�����η��� class ����{
}
���磺
class Person{
}

˵����������ÿһ�����ʵ�����ĸ����д

���䣺�����һ������public�ģ���ôԴ�ļ���������������ͬ

2����ĵ�һ���Ա������
��1�����Ե�����
�����η��� �������� ������;

3�������������������
�﷨��ʽ��
	���� ������ = new ����();
	��������ʵҲ�Ǳ�����/���������

������/���������ӵڶ������ʿ�ʼ����ĸ��д

4��Ϊĳ����������Ը�ֵ
������.������ = ֵ;

5������ĳ�����������ֵ
���磺��ӡĳ�����������ֵ
System.out.println(������.������);
*/
//������
class Person{
	//��������
	String name;
	int age;
	char gender;
}

//������
public class Test01_Class{
	public static void main(String[] args){
		//(1)��������
		Person p = new Person();
		
		//(2)Ϊp�����name���Ը�ֵ
		p.name = "����";
		
		//Ϊp�����age���Ը�ֵ
		p.age = 23;
		
		//Ϊp�����gender���Ը�ֵ
		p.gender = '��';
		
		//(3)����/��ʾ��������Ե�ֵ
		System.out.println("������" + p.name);
		System.out.println("���䣺" + p.age);
		System.out.println("�Ա�" + p.gender);
	}
}
