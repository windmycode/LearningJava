/*
�������Ļ���������
��1����װ
��2���̳�
��3����̬

һ����װ

1����װ�����壺
��1������ʵ��ϸ��
��2����ȫ

2����װ�����ͣ�
��1�����Եķ�װ�������ķ�װ��
��2������ķ�װ
��3��ϵͳ�ķ�װ

3����װ��ʵ�֣���Ȩ�����η������ƿɼ��ķ�Χ��
Ȩ�����η���
(1)�ɼ���Χ
				����	����	����������		����λ��
private��		 ��		��			��				��
ȱʡ/ʡ�ԣ�		 ��		��			��				��
protected��		 ��		��			��				��
public			 ��		��			��				��

(2)��Щ���Լ�Ȩ�����η�
�ࡢ���ԡ����������������ڲ���

(3)�ֱ���Լ�ʲôȨ�����η�
�ࣺȱʡ��public
	�����ǰ����public����ô������Դ�ļ�����ͬ
���ԣ����ֶ�����
���������ֶ�����	

4�����Եķ�װ
���������£����Զ���private
�������˽�л��ˣ����ǻ��ṩget/set����
get/set�ı�׼д����
	public void set������(�������� �β���){
		������ = �β���;
	}
	public ���Ե��������� get������(){
		return ������;
	}

5�������ķ�װ
���������£���������public

*/
public class Test10_Encapsulation{
	public static void main(String[] args){
		//1����������
		Circle c1 = new Circle();
		
		//2��Ϊ���Ը�ֵ
		//c1.radius = 1.2;//�����
		c1.setRadius(1.2);
		
		System.out.println("�뾶��" + c1.getRadius());
	}
}
class Circle{
	private double radius;//�����뱾���з���
	
	//radius���Ե�set���������������������޸�radius��ֵ
	public void setRadius(double r){
		if(r>0){//ʹ�ø�ֵ�ɿ�
			radius = r;
		}
	}
	//radius���Ե�get�������������������л�ȡradius��ֵ
	public double getRadius(){
		return radius;
	}
	
}