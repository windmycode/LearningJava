class Test06_Exer1{
	public static void main(String[] args){
		int i = 1;
		/*
		��һ����i++
		��1����ȡi��ֵ��1����������
		��2��i������i=2
		�ڶ�����++i
		��1����������i=3
		��2����ȡi��ֵ��3����������
		��������������� 1 + 3 = 4
		
		*/
		System.out.println(i++ + ++i);//4
		System.out.println(i);//3
	}
}