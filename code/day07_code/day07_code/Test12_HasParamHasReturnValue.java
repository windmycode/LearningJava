/*
�ġ��в��з���ֵ�ķ���
1��������ʽ
�����η��� ��void�ķ���ֵ����  ������(�β��б�){
	������
}

2�����ø�ʽ
��1����������
	���� = ������.������(ʵ���б�);
	
	��
	
	System.out.println(������.������(ʵ���б�));
��2������ͬ�������
		���� = ������(ʵ���б�);
		
		�� 
		System.out.println(������(ʵ���б�));
*/
class Test12_HasParamHasReturnValue{
	public static void main(String[] args){
		//1������MyMathTools����
		MyMathTools tools = new MyMathTools();
		
		//2������max()
		int m = tools.max(4,6);
		System.out.println("4,6���ֵ�ǣ�" + m);
		
		System.out.println("5,2���ֵ�ǣ�" +tools.max(5,2) );
		
		//3������threeNumberMax
		System.out.println("3,2,7�����ֵ�ǣ�" + tools.threeNumberMax(3,2,7));
	}
}

//����һ����ѧ���㹤����
class MyMathTools{
	//1���������������������ֵ
	int max(int a, int b){
		return a>b ? a : b;
	}
	
	//2���������������������ֵ
	int threeNumberMax(int x, int y ,int z){
		//����ͬ�������
		/*
		int m = max(x,y);
		m = max(m,z);
		return m;
		*/
		return max(max(x,y),z);
	}
}