/*
1������һ�������࣬�����ԣ�������
2���ھ������У���������������
��1�����ؾ������
��2�����ؾ����ܳ�
3���ڲ������в���
*/
class Rectangle{
	//���ԣ�������
	double length;
	double width;
	
	//��1�����ؾ������
	double getArea(){
		return length * width;
	}
	
	//��2�����ؾ����ܳ�
	double getPerimeter(){
		return (length + width)*2;
	}
	
	void printInfo(){
		System.out.println("����" + length + "����" +width + "�������" + getArea() + "���ܳ���" + getPerimeter());
	}
}
class Test09_Exer2{
	public static void main(String[] args){
		//1����������
		Rectangle r = new Rectangle();
		
		//2��Ϊ���Ը�ֵ
		r.length = 3;
		r.width = 5;
		
		//3����ȡ������ܳ�
		System.out.println("�����" + r.getArea());
		System.out.println("�ܳ���" + r.getPerimeter());
		
		//4����ӡ��ϸ��Ϣ
		r.printInfo();
	}
}