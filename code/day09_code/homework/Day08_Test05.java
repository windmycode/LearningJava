/*
������

?	1������һ��EmployeeԱ���࣬
?		�������ԣ����(id)������(name)��н��(salary)������(age)
?		����������
?		��1��void printInfo()�����Դ�ӡԱ������ϸ��Ϣ
?		��2��void setInfo(int  i, String n, double s, int a)������ͬʱ��id,name,salary,age��ֵ
?	2������һ��TestEmployee�����࣬
?	��1��public static void main(String[] args)��
	��main�����У�����Employee[]���飬������5��Ա������ŵ������У�
	��ΪԱ����������Ը�ֵ
?	��2��public static void print(Emplyee[] all)��������ӡԱ�������е�ÿ��Ա������ϸ��Ϣ������main�е���
?	��3��public static void sort(Employee[] all)����allԱ�����鰴������Ӹߵ������򣬲���main�е��ò���
?	��4��public static void addSalary(Employee[] all, double increament)����allԱ�������ÿһ��Ա���Ĺ��ʣ�����increament������main�е��Բ���
*/

class Day08_Test05{
	public static void main(String[] args){
		Employee[] all = new Employee[5];
		all[0] = new Employee();
		all[0].setInfo(1,"����",10000,23);
		
		all[1] = new Employee();
		all[1].setInfo(2,"����",12000,23);
		
		all[2] = new Employee();
		all[2].setInfo(3,"����",8000,18);
		
		all[3] = new Employee();
		all[3].setInfo(4,"����",6000,20);
		
		all[4] = new Employee();
		all[4].setInfo(5,"Ǯ��",15000,21);
		
		print(all);
		sort(all);
		System.out.println("------------------------------------------");
		print(all);
		
		addSalary(all, 200);
		System.out.println("------------------------------------------");
		print(all);
	}
	
	public static void print(Employee[] all){
		for(int i=0; i<all.length; i++){
			all[i].printInfo();
		}
	}
	
	public static void sort(Employee[] all){
		for(int i=1; i<all.length; i++){
			for(int j=0; j<all.length-i; j++){
				//�Ӹߵ���
				if(all[j].age < all[j+1].age){
					Employee temp = all[j];
					all[j] = all[j+1];
					all[j+1] = temp;
				}
			}
		}
	}
	
	public static void addSalary(Employee[] all, double increament){
		for(int i=0; i<all.length; i++){
			all[i].salary += increament;
		}
	}
}
class Employee{
	int id;
	String name;
	double salary;
	int age;
	
	void printInfo(){
		System.out.println("��ţ�" + id + "��������" + name + "��н�ʣ�" + salary + "�����䣺" +age);
	}
	void setInfo(int  i, String n, double s, int a){
		id = i;
		name = n;
		salary = s;
		age = a;
	}
}