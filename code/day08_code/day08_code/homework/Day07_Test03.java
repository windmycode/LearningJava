/*
����������Citizen���������ԣ����������գ����֤�ţ�
����������String���ͣ�������MyDate���ͣ����֤��Ҳ��String���͡�
�������Ǽ�ͥ��Ա�ļ������󣬲���ӡ��Ϣ��
*/
class Day07_Test03{
	public static void main(String[] args){
		//1�������ְֵĶ���
		Citizen baba = new Citizen();
		baba.name = "Сͷ�ְ�";
		baba.cardId = "1111111";
		//��ߵ�birthday��һ�������������͵ı������ұ߾���Ҫ��ֵһ������
		baba.birthday = new MyDate();
		//baba.birthday�Ƕ�����
		baba.birthday.year = 1967;
		baba.birthday.month = 5;
		baba.birthday.day = 2;
		
		//2����������Ķ���
		Citizen mama = new Citizen();
		mama.name = "Χȹ����";
		mama.cardId = "222222";
		
		MyDate bir = new MyDate();
		bir.year = 1970;
		bir.month = 6;
		bir.day = 1;
		
		mama.birthday = bir;
		
		System.out.println("�ְֵ�������" + baba.name + "�����֤�ţ�" + baba.cardId + "�����գ�" + baba.birthday.year+"��" + baba.birthday.month + "��" + baba.birthday.day+"��");
		System.out.println("�����������" + mama.name + "�����֤�ţ�" + mama.cardId + "�����գ�" + mama.birthday.year+"��" + mama.birthday.month + "��" + mama.birthday.day+"��");
	}
}
class MyDate{
	int year;
	int month;
	int day;
}
class Citizen{
	String name;//����
	MyDate birthday;//����   MyDate��Ȼ���Լ�д���࣬����Ҳ������ΪJava����������
	String cardId;//���֤��
}