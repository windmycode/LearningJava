class Test09_Modify{
	public static void main(String[] args){
		int i = 1;
		int j = 5;
		//j *= i++ + j; �ȼ��� j = j * (i++ + j);
		/*
		��һ�����Ȱ�j��ֵ��5��������		
		
		�ڶ�����i++
		(1)��ȡi��ֵ��1����������
		(2)i������i=2
		�ڶ��������
		1 + 5 = 6
		����������
		j * (��) = 5 * 6 = 30
		���Ĳ�����ֵ���ѳ˻���ֵ��j
		*/
		j *= i++ + j;
		System.out.println("i = " +  i);//2
		System.out.println("j = " +  j);//30
	}
}