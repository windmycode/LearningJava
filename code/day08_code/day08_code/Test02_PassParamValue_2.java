/*
�����Ĳ������ݻ��ƣ�
	ʵ��-->�β�

��1���β��ǻ�����������
	ʵ�θ�ֵ���βε�������ֵ���β�ֵ���޸Ĳ�Ӱ��ʵ�Σ���Ϊʵ���ǡ�copy�����ơ���һ������ֵ���β�
��2���β���������������	
	ʵ�θ�ֵ���βε��Ƕ���ĵ�ֵַ������β��޸��˶��������ֵ����ôʵ�ζ��������ֵҲ���޸ġ�
*/
class Test02_PassParamValue_2{
	public static void main(String[] args){
		Circle yuan = new Circle();
		yuan.radius = 1.0;
		
		doubleRadius(yuan);
		
		System.out.println("�뾶��" + yuan.radius);
	}
	//�����Ĺ��ܣ����԰�c���Բ����İ뾶����Ϊԭ����2��
	public static void doubleRadius(Circle c){
		c.radius *= 2;
	}
	
}
class Circle{
	double radius;
}