/*
1������һ�����Σ������Σ��࣬�����ԣ�������
2���ڲ������main�У������������ζ��󣬲�Ϊ���Ը�ֵ
3�������ڴ�ͼ
*/
class Rectangle{
	double length;
	double width;
}
class Test04_RectangleDemo{
	public static void main(String[] args){
		//1��������һ�����ζ���
		Rectangle r1 = new Rectangle();
		//Ϊ��һ�����ζ�������Ը�ֵ
		r1.length = 1;
		r1.width = 3;
		//��ʾ��һ�����ζ������Ϣ
		System.out.println("����1�ĳ���" + r1.length + "����" + r1.width);
		
		//1�������ڶ������ζ���
		Rectangle r2 = new Rectangle();
		//Ϊ�ڶ������ζ�������Ը�ֵ
		r2.length = 4;
		r2.width = 5;
		//��ʾ�ڶ������ζ������Ϣ
		System.out.println("����2�ĳ���" + r2.length + "����" + r2.width);
	}
}