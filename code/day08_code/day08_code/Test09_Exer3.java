/*
��ϰ2
��1������һ��ѧ����Student����������name�ͳɼ�score����
��2���ڲ�����TestStudentArray�д���һ������Ϊ3��ѧ������
��3���Ӽ�������Ϊѧ������������ͳɼ����Ը�ֵ
��4��������ʾѧ����Ϣ
��5��ʹ��ð����������鰴��ѧ���ɼ��ӵ͵�������
��6���ٴα�����ʾѧ����Ϣ
*/
class Test09_Exer3{
	public static void main(String[] args){
		//����һ������Ϊ3��ѧ������
		Student[] all = new Student[3];
		
		//�Ӽ�������Ϊѧ������������ͳɼ����Ը�ֵ
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i=0; i<all.length; i++){
			System.out.println("�������" + (i+1) + "��ѧԱ����Ϣ��");
			
			//�������ѧ������
			all[i] = new Student();
			
			System.out.print("������");
			all[i].name = input.next();
			
			System.out.print("�ɼ���");
			all[i].score = input.nextInt();
		}
		
		//������ʾѧ����Ϣ
		for(int i=0; i<all.length; i++){
			//all[i].printInfo();
			System.out.println(all[i].getInfo());
		}
		
		//ʹ��ð����������鰴��ѧ���ɼ��ӵ͵�������
		for(int i=1; i<all.length; i++){//��������
		
			//�ӵ͵��ߣ��Ѵ�������ƶ�
			/*
			��i=1, j=0,1  all[0]��all[1]  all[1]��all[2]
			��i=2��j=0    all[0]��all[1]
			all[j] �� all[j+1]
			*/
			for(int j=0; j<all.length-i; j++){
				//all[j]��һ��ѧ������
				//if(all[j] > all[j+1]){//��Ԫ����� '>' �Ĳ��������ʹ���
				if(all[j].score > all[j+1].score){
					//��������Ԫ�أ����ǽ��������˵ĳɼ�
					Student temp = all[j];//all[j]��һ��Student����
					all[j] = all[j+1];
					all[j+1] = temp;
				}
			}
			
		}
		
		//������ʾѧ����Ϣ
		for(int i=0; i<all.length; i++){
			//all[i].printInfo();
			System.out.println(all[i].getInfo());
		}
	}
}
class Student{
	String name;
	int score;
	
	void printInfo(){
		System.out.println("������" + name + "���ɼ���" + score);
	}
	String getInfo(){
		return "������" + name + "���ɼ���" + score;
	}
} 