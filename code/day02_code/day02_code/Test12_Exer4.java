class Test12_Exer4{
	public static void main(String[] args){
		int x = 1;
		int y = 1;
		/*
		��һ����x++
		(1)��ȡx��ֵ��1��
		(2)��x����x = 2
		�ڶ������Ƚ�
		�á�1����1�Ƚϣ� 1==1��������true
		
		�м���||���Ƕ�·������Ѿ�Ϊtrue,�ᷢ����·�����ұ߲�����
				
		
		���岽���߼�
		true & �������Ϊtrue���ܵ�if������Ҫִ��x = 7
		*/
		if(x++ == 1 || ++y==1){
			x = 7;
		}
		System.out.println("x = " + x + ",y = " + y);//x = 7,y = 1
	}
}