/*
��������������ֵ
*/
class Test17_Swap{
	public static void main(String[] args){
		int x = 1;
		int y = 2;
		
		/*
		ͨ�õķ������������������������
				�����ڵ�����ͨ�����͵���ʱ����
		*/
		int temp = x;//x������ֵ�͸�ֵ����temp  temp = 1
		x = y;//�ٰ�y�е�ֵ�ŵ�x�У�x = 2
		y = temp;//�ٰ�temp�е�ֵ��ֵ��y  y=1
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 1;
		y = 2;
		/*
		��������ֻ������int����������
		*/
		x = x ^ y;
		y = x ^ y;//(�µ�x) ^ ԭ����y = (ԭ����x ^ ԭ����y) ^ ԭ����y = ԭ����x  ����ͬ��
		x = x ^ y;//(�µ�x) ^ �µ�y = (ԭ����x ^ ԭ����y) ^ ԭ����x = ԭ����y
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 1;
		y = 2;
		/*
		��������ֻ������int����������
			�з��գ����ܻ����
		*/
		x = x + y;//�з��գ����ܻ����
		y = x - y;//(�µ�x) - ԭ����y = (ԭ����x + ԭ����y)- ԭ����y  = ԭ����x
		x = x - y;//(�µ�x) - �µ�y = (ԭ����x + ԭ����y) - ԭ����x = ԭ����y
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		/*
		���²��Ƽ�
		*/
		x = 1;
		y = 2;
		x = x * y;//���ո���
		y = x / y;
		x = x / y;
	}
}