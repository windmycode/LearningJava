/*
������ԭ��
��1��������������ʹ��
��2�������ò�ִ��

һ���޲��޷���ֵ�ķ���
1���������
�����η��� void ������(){
	������
}
2������
��1���ڱ����У�ͬһ������ֱ�ӵ���
	������();
	
��2�����������У���Ҫͨ��"������.����"
	������.������();

*/
class Test06_NoParamNoReturnValue{
	public static void main(String[] args){
		//1����������
		Student s1 = new Student();
		
		//2��ͨ������ȥ���÷���
		s1.printInfo();
		
		//3�������Ը�ֵ
		s1.name = "��鲨";
		s1.age = 23;
		s1.score = 100;
		
		//4���ٴε���s1�����printInfo()
		s1.printInfo();
		
		//int a = s1.printInfo();//����ģ��޷���ֵ
		//System.out.println(s1.printInfo());//����ģ��޷���ֵ
	}
}
class Student{
	//����
	String name;
	int age;
	int score;
	
	//����
	//ʡ�����η�
	//1������һ�����������Դ�ӡ��ǰѧ���������Ϣ
	void printInfo(){
		System.out.println("������" + name + ",���䣺" +age + ",�ɼ���" + score);
	}
	
	//void test(){
	//	printInfo();
	//}
}
