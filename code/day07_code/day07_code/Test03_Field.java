/*
���Ե��ص㣺
1��������Ĭ��ֵ
	ԭ��������Ԫ�ص�Ĭ��ֵһ����
	��1��������������
	byte,short,int,long��0
	float,double��0.0
	boolean:false
	char:\u0000
	��2�������������ͣ�null
	���磺String��������������

2��ÿһ�����������ֵ�Ƕ�����
*/
class Test03_Field{
	public static void main(String[] args){
		//1������һ������Ķ���
		Animal a1 = new Animal();
		
		//2��ֱ�ӷ���a1���������ֵ
		System.out.println("a1��name����ֵ��" + a1.name);
		System.out.println("a1��legs����ֵ��" + a1.legs);
		
		//String str;//����: ������δ��ʼ������str
		//System.out.println("str = " +str);
		
		//2�������ڶ�������Ķ���
		Animal a2 = new Animal();
		a2.name = "����";
		a2.legs = 4;
		
		//����a1���������ֵ
		System.out.println("a1��name����ֵ��" + a1.name);
		System.out.println("a1��legs����ֵ��" + a1.legs);
		//����a2���������ֵ
		System.out.println("a2��name����ֵ��" + a2.name);
		System.out.println("a2��legs����ֵ��" + a2.legs);
	}
}
//Animal������
class Animal{
	//����
	String name;//���������
	int legs;//�ȵ�����
}