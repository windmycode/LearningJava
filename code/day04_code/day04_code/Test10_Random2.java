/*
��Java�ĺ�������У�������Math�����ṩ��random()�������������
����java.util.Random����Ҳ�ṩ����������ķ�����
*/
class Test10_Random2{
	public static void main(String[] args){
		//(1)��׼������������Ĺ���
		java.util.Random tools = new java.util.Random();
		
		//(2)�ù��߻�ȡ�����
		int num = tools.nextInt();
		System.out.println("���������" + num) ;
		
		double d = tools.nextDouble();
		System.out.println("���С����" + d) ;
		
		//(3)�ù��߻�ȡһ����Χ�ڵ����ֵ
		int rangeNum = tools.nextInt(10);//[0,10)
		System.out.println("���[0,10)������" + rangeNum) ;
	}
}