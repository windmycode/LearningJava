class Test12_Exer2{
	public static void main(String[] args){
		int x = 1;
		int y = 1;
		/*
		��һ����x++
		(1)��ȡx��ֵ��1��
		(2)��x����x = 2
		�ڶ������Ƚ�
		�á�1����2�Ƚϣ� 1==2����������false
		
		��Ϊ&&�Ƕ�·�룬���Ϊfalse���ұ߾Ͳ�����
		
		
		
		���������߼�
		false & �������Ϊfalse���ܵ�if������
		*/
		if(x++ == 2 && ++y==2){
			x = 7;
		}
		System.out.println("x = " + x + ",y = " + y);//x = 2,y = 1
	}
}