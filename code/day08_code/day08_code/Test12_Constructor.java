/*
��ĵ�������ɲ��֣�
	��������Ҳ��Ϊ���췽������Ϊ��1���������񷽷���2�����������һ��ʵ����ʼ������
	
1��������������
��1��������󣬴�������
��newһ��ʹ�ã�ÿ�ε����������ڴ����µĶ���	
��2�������ڴ��������ͬʱ�������Ը�ֵ

2�����������ص�
��1�������඼�й�����
��2�����һ����û����ʽ��������������ô�����������Զ�����һ��Ĭ�ϵ��޲ι���
��3�����һ������ʽ�����˹���������ô�������������Զ�����Ĭ�ϵ��޲ι�����
��4�������������Ʊ�����������ͬ
��5��������û�з���ֵ���ͣ�Ҳ��дvoid
��6����������������

���أ���ͬһ�����У���������ͬ���β��б�ͬ�������Ͷ���������ͷ���ֵ�����޹�

3�����������﷨�ṹ
	�����η��� ����(){
		
	}
	�����η��� ����(�β��б�){
		
	}
	
���䣺
	java.util.Scanner input = new java.util.Scanner(System.in);//���õ����вι���
	int num = input.nextInt();//�Ӽ�������һ������
	java.util.Random rand = new java.util.Random();//���õ����޲ι���
	int num = random.nextInt(10);//����һ��[0,10)������
*/
class Test12_Constructor{
	public static void main(String[] args){
		//��������
		//���� ������ = new  ����();
		//Circle c = new Circle();
		
		Circle c = new Circle(1.2);//1.2���뾶��ֵ���ڴ��������ͬʱ�����Ը�ֵ�õ�
		c.printInfo();
		
		c.setRadius(2.5);//��������֮���޸�����ֵ�õ�
		c.printInfo();
		
		Circle c2 = new Circle();//�ȴ������󣬲����뾶��ֵ
		c2.setRadius(3.6);
		c2.printInfo();
	}
}
class Circle{
	private double radius;
	
	//double r�����������β��б�
	public Circle(double r){//�вι���
		radius = r;//���뾶��ֵ
	}
	
	public Circle(){//�޲ι���
		
	}
	
	public void printInfo(){
		System.out.println("�뾶��" + radius);
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
}