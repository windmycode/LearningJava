/*
1������ѧ���࣬
��1�������ԣ����������䣬�ɼ�������˽�л���
��2���ṩ������get/set��
��3���ṩgetInfo()����������ѧ���������Ϣ
2���ڲ�������set������ֵ����getInfo()����ѧ����Ϣ
*/
class Test11_Exer4{
	public static void main(String[] args){
		Student stu = new Student();
		stu.setName("����");
		//stu.setName = "����";//�����
		stu.setAge(23);
		stu.setScore(80);
		
		System.out.println(stu.getInfo());
	}
}
class Student{
	private String name;
	private int age;
	private double score;
	
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
	
	//�ṩgetInfo()����������ѧ���������Ϣ
	public String getInfo(){
		return "������" + name + "�����䣺" + age + "���ɼ���" + score;
	}
}