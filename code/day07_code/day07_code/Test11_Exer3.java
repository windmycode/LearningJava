/*
1������һ��ͼ�ι����࣬����һ�����������Դ�ӡn��ĳ�ַ��ĵ���������
*/
class Test11_Exer3{
	public static void main(String[] args){
		//1������GraphicTools����
		GraphicTools tools = new GraphicTools();
		
		//2�����÷���
		tools.printEqualSideTriangle(6,'*');
	}
}
class GraphicTools{
	//����һ�����������Դ�ӡn��ĳ�ַ��ĵ���������
	/*
					*					
				*	*	*				
			*	*	*	*	*			
		*	*	*	*	*	*	*		
	*	*	*	*	*	*	*	*	*	
*	*	*	*	*	*	*	*	*	*	*
����6�У�
��1�������5���ո�1��*   5 = 6-1  1 = 2*1-1
��2�������4���ո�3��*
��3�������3���ո�5��*
��4�������2���ո�7��*
��5�������1���ո�9��*
��6�������0���ո�11��*	0 = 6-6  11 = 2*6-1

*/
	void printEqualSideTriangle(int n, char x){
		for(int i=1; i<=n; i++){
			//�ȴ�ӡ�ո񣺿ո���= n-i��
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			
			//��ӡx���ţ�x���ŵ����� = 2*i-1
			for(int k = 1; k<=2*i-1; k++){
				System.out.print(x);
			}
			
			//����
			System.out.println();
		}
	}
}