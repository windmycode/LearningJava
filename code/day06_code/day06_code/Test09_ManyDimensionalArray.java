/*
��ά����ĳ�ʼ����
1����̬��ʼ��

2����̬��ʼ��
��1��ȷ��������
��2��ȷ��ÿһ�е�����
��3��ȷ��Ԫ�ص�ֵ

 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4

*/
class Test09_ManyDimensionalArray{
	public static void main(String[] args){
		//1������һ����ά����
		//int[][] arr;
		
		//2����̬��ʼ��
		//(1)ȷ��������
		//arr = new int[4][];
		
		//���������ȷ��������������
		int[][] arr = new int[4][];
		
		System.out.println("��������" + arr.length);
		//System.out.println("arr[0]�У�" + arr[0]);//null����Ϊ��ʱ���еĸ���ϸ����Ϣû��
		
		//(2)ȷ��ÿһ�е�����
		//��Ϊarr[0]�Ǵ���һ�У�����һ��һά����
		//arr[0] = new int[5];
		//System.out.println(arr[0][2]);
		
		//(3)ȷ��Ԫ�ص�ֵ
		//arr[0][0] = 1;
		//arr[0][1] = 1;
		//arr[0][2] = 1;
		//arr[0][3] = 1;
		//arr[0][4] = 1;
		
		//(2)ȷ��ÿһ�е�����
		for(int i=0; i<arr.length; i++){
			arr[i] = new int[5];//ÿһ�ж���5��Ԫ��
		}
		
		//(3)ȷ��Ԫ�ص�ֵ
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = i+1;
			}
		}
		
		//(4)����
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}