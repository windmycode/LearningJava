/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
*/
 
class Test11_Exer1{
	public static void main(String[] args){
		//1������һ����ά���飬����ȷ������
		//��Ϊÿһ�е�������ͬ�������޷�ֱ��ȷ������
		int[][]  arr = new int[5][];
		
		//2��ȷ��ÿһ�е�����
		for(int i=0; i<arr.length; i++){
			/*
			arr[0] ��������1
			arr[1] ��������2
			arr[2] ��������3
			arr[3] ��������4
			arr[4] ��������5
			*/
			arr[i] = new int[i+1];
		}
		
		//3��ȷ��Ԫ�ص�ֵ
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = i+1;
			}
		}
		
		//4��������ʾ
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}