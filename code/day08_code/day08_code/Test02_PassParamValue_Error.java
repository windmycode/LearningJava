/*
���壺
	���β��������������ͣ�ʵ�θ��βε�ֵַ֮��
	�β��޸��˵�ֵַ����ô��ʵ�ξ��޹���
*/
class Test02_PassParamValue_Error{
	public static void main(String[] args){
		Circle yuan = new Circle();
		yuan.radius = 1.0;
		
		doubleRadius(yuan);
		
		System.out.println("�뾶��" + yuan.radius);
	}
	//�����Ĺ��ܣ����԰�c���Բ����İ뾶����Ϊԭ����2��
	public static void doubleRadius(Circle c){
		c = new Circle();//����һ�����  �޸����β�c�д洢�ĵ�ֵַ����cָ���¶�����
		c.radius *= 2;
	}
	
}
class Circle{
	double radius;
}