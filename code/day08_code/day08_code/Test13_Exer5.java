/*
1������ѧ���࣬
��1�������ԣ����������䣬�ɼ�������˽�л���
��2���ṩ�вκ��޲ι���
��3���ṩ������get/set��
��4���ṩgetInfo()����������ѧ���������Ϣ
2���ڲ�����
��1�����вκ��޲ι���ֱ𴴽�����
��2����set�����޸�����ֵ
��3����getInfo()����ѧ����Ϣ

ϰ���ϣ�
��{
	�����б�;
	
	�������б�;
	
	�����б�;
}
*/
class Test13_Exer5{
	public static void main(String[] args){
		//1���޲ι��촴������
		Student s1 = new Student();
		//s1.setName = "����";//�����
		s1.setName("����");
		s1.setAge(23);
		s1.setScore(89);		
		System.out.println(s1.getInfo());
		
		//2���вι��촴������
		Student s2 = new Student("����",24, 34);
		System.out.println(s2.getInfo());
		s2.setScore(74);//�޸ĳɼ���ֵ
		System.out.println(s2.getInfo());
	}
}
class Student{
	private String name;
	private int age;
	private double score;
	
	public Student(){
		
	}
	public Student(String n, int a, double s){
		name = n;
		age = a;
		score = s;
	}
	
	//�ṩ������get/set��
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public void setScore(double s){
		score = s;
	}
	public double getScore(){
		return score;
	}
	
	public String getInfo(){
		return "������" + name + "������:" + age +"���ɼ���" +score;
	}
}