/*
�޲��з���ֵ�ķ�����
double d = Math.random() ;
int num = input.nextInt();
double d = input.nextDouble() ;

һ���޲��з���ֵ�ķ���
1��������ʽ
�����η��� ��void�ķ���ֵ���� ������(){
	������
}

2�����ø�ʽ
��1���������У�
	���� = ������.������();
	��
	System.out.println(������.������());
	
	��������������շ���ֵ
��2�������ͬ��������
	���� = ������();
	����
	System.out.println(������());
*/
class Test08_NoParamHasReturnValue{
	public static void main(String[] args){
		//1����������
		Account a = new Account();
		a.id = "10101010101";
		a.balance = 10000;
		
		//����a��printInfo()
		a.printInfo();
		
		//����a��getMonthlyRate()
		//���� = ������.������();//�޲��з���ֵ�ķ����ĵ���
		double d = a.getMonthlyRate();
		System.out.println("�����ʣ�" + d);
	}
}
//Account�˻�
class Account{
	String id;//�˺�
	double balance;
	double rate = 0.035;//�����ʣ������ٽ���̬�����⣬����û���þ�̬
	
	//1����ӡ��ǰ�˻�����Ϣ
	void printInfo(){
		System.out.println("�˻���" + id + 
			"����" + balance + 
			"�������ʣ�" + rate +  
			"�������ʣ�" + getMonthlyRate());//����ͬ�������е��ã�����ʡ�ԡ�������.��
	}
	
	//2������������
	//������ = ������ / 12;
	double getMonthlyRate(){
		return rate / 12;
	}
}