/*
�����ȡ��
	������ȡ����ת��Ϊ��ʵ�����е���������==������������е���
	
�����ƣ�
	��ĳ�Ա�����
	5���Ա��5����ɲ��֣���
	1�����ԣ���������
	2����������Ϊ��������������
	3������������������ʱ��
	4������飺�����ʼ���Ͷ����ʼ��ʱ�õ�
	5���ڲ��ࣺ��ĳ����������У�������һ��������С��������𣬶���һ�����С������ֻΪ����������ʱ


��{
	��Ա�б�
}	
*/
class Body{
	//����
	double weight;
	char gender;
	
	//����
	void eat(){
		System.out.println("�Է�");
	}
	void sleep(){
		System.out.println("˯��");
	}
	
	//������
	Body(){
		
	}
	Body(double weight, char gender){
		this.weight = weight;
		this.gender = gender;
	}
	
	//�����
	{
		System.out.println("�Ǿ�̬�����");
	}
	static{
		System.out.println("��̬�����");
	}
	
	//�ڲ���
	class Heart{
		public void beat(){
			System.out.println("������");
		}
	}
	
}