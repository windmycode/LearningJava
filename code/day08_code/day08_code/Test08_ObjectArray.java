/*
������������һ�����������������ǻ����������ͣ�Ҳ������������������
���磺
	int[] arr; ����һ������
	char[] arr;����һ�鵥�ַ�
	
	String[] arr; ����һ���ַ�������
	Student[] arr; ����һ��ѧ������
	Circle[] arr; ����һ��Բ����

�����������д洢��һ�����ʱ����ô���ǳ�Ϊ�������顣	
*/
class Test08_ObjectArray{
	public static void main(String[] args){
		//Ҫ��һ�����飬�洢5��Բ���󣬰뾶�ֱ�Ϊ1-5
		//(1)����һ������
		//�����Ԫ�ص�������Circle
		Circle[] arr = new Circle[5];//���new�Ǵ����������
		
		//(2)Ϊ�����Ԫ�ظ�ֵ
		for(int i=0; i<arr.length; i++){
			//Ԫ�أ�������[�±�]
			//arr[i].radius = i+1;//java.lang.NullPointerException
			
			arr[i] = new Circle();//����Բ����
			arr[i].radius = i+1;
		}
		
		//(3)�������飬��ӡÿһ��Բ����Ϣ
		for(int i=0; i<arr.length; i++){
			//���ڵ������Ԫ��arr[i]����һ��Բ���󣬼�Ȼ��Բ���󣬾Ϳ��Ե���Բ�����Ժͷ���
			arr[i].printInfo();
			//System.out.println(arr[i]);
		}
	}
}
class Circle{
	double radius;
	
	double getArea(){
		return 3.14 * radius * radius;
	}
	
	void printInfo(){
		System.out.println("�뾶��" + radius + "�������" + getArea());
	}
}