/*
1������һ��Բ��ͼ���࣬�����ԣ��뾶
2���ڲ������main�У�����Բ��2�����󣬲�Ϊ�뾶���Ը�ֵ
*/
class Test02_CirlceDemo{
	public static void main(String[] args){
		//1��������һ��Բ����
		//���� ������ = new ����();
		//Circle c1;//����һ�������������͵ı���,�����洢һ��Բ����
		//c1 = new Circle();//Ϊc1������ֵһ��Բ����
		
		//�������ϳ�һ��
		Circle c1 = new Circle();
		
		//2��Ϊ��һ��Բ����İ뾶��ֵ
		c1.radius = 2.5;
		
		//3����ʾ��һ��Բ����İ뾶ֵ
		System.out.println("��һ��Բ�İ뾶��" + c1.radius);
		
		//4�������ڶ���Բ����
		Circle c2 = new Circle();
		c2.radius = 1.2;
		System.out.println("�ڶ���Բ�İ뾶��" + c2.radius);
		
	}
}