/*
��ϰ2����ӡ������Ϣ
������Ϣʹ�ñ�������
*/
class TestExer2{
	public static void main(String[] args){
		String name = "������";
		int age = 18;
		char gender = 'Ů';
		double height = 152.0;
		double weight = 40.5;
		boolean marry = true;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(marry);
		System.out.println("---------------------");
		
		/*
		""�е����ݣ�ԭ����ʾ
		name�Ǳ���������ʾ��ʱ�򣬲�����ʾname���ʣ����ǰ�name�����д��ֵȡ������ʾ����������name����""
		"������" + name��������:��name�����е�ֵƴ������һ����ʾ
		*/
		System.out.println("������" + name);
		System.out.println("���䣺" + age);
		System.out.println("�Ա�" + gender);
		System.out.println("��ߣ�" + height);
		System.out.println("���أ�" + weight);
		System.out.println("�Ƿ��ѻ飺" + marry);
	}
}