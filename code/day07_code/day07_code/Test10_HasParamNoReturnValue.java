/*
�����в��޷���ֵ�ķ���
1��������ʽ
�����η��� void ������(�β��б�){
	������
}

�β��б�ĸ�ʽ��
	(�������� �β���)
	(��������1 �β���1, ��������2 �β���2, ....)
	
2�����ø�ʽ
��1������ͬ����
	������(ʵ���б�);
��2����������
	������.������(ʵ���б�);
	
3���������ʣ�
�β��б�����ʱ()��
	(��������1 �β���1, ��������2 �β���2, ....)
	(int n,int m, char x)
ʵ���б�����ʱ()��
	(3,5,'%')
	(a,b,c)

5��ʵ�����β�
ʵ���Ǹ�ֵ���βθ�ֵ
Ҫ��ʵ�εĸ��������͡�˳�����β�һһ��Ӧ	
*/
class Test10_HasParamNoReturnValue{
	public static void main(String[] args){
		//1����������
		GraphicTools tools  = new GraphicTools();
		
		//2������print5Line10ColumnStarRectangle()
		tools.print5Line10ColumnStarRectangle();
		
		//3������printRectangle(int n,int m,char x)
		tools.printRectangle(3,5,'%');//(3,5,'%')��Ϊʵ���б�
		
		int a = 5;
		int b = 9;
		char c = '#';
		//4������printRectangle(int n,int m,char x)
		tools.printRectangle(a,b,c);//(a,b,c)��Ϊʵ���б�
	}
}
//GraphicToolsͼ�ι�����
//����������У��и��ִ�ӡͼ�εķ���
class GraphicTools{
	//���η�ʡ��
	//(1)����һ�����Դ�ӡ5��10�е�*�ľ���
	//�޲��޷���ֵ
	void print5Line10ColumnStarRectangle(){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//(2)����һ�����Դ�ӡn��m�е�ĳ�ַ��ľ���
	//�õ�����������ĳ���Ա��������n��m��x��ֵ
	//�β��б�(int n, int m, char x)
	void printRectangle(int n, int m, char x){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				System.out.print(x);
				
			}
			System.out.println();
		}
	}
}