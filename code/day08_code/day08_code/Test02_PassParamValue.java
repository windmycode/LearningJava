/*
�����Ĳ������ݻ��ƣ�
	ʵ��-->�β�

��1���β��ǻ�����������
	ʵ�θ�ֵ���βε�������ֵ���β�ֵ���޸Ĳ�Ӱ��ʵ�Σ���Ϊʵ���ǡ�copy�����ơ���һ������ֵ���β�
��2���β���������������	
*/
class Test02_PassParamValue{
	public static void main(String[] args){
		int x = 1;
		int y = 2;
		//����ͬ����ķ�������
		swap(x,y);
		
		System.out.println("x = " + x + "��y = " + y);
	}
	//public static���η�
	public static void swap(int a,int b){
		System.out.println("a = " + a + "��b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + "��b = " + b);
	}
}