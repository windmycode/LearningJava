/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
*/
 
class Test11_Exer1_2{
	public static void main(String[] args){
		//1������һ����ά���飬����ȷ������
		//��Ϊÿһ�е�������ͬ�������޷�ֱ��ȷ������
		int[][]  arr = new int[5][];
		
		
		for(int i=0; i<arr.length; i++){
			//2��ȷ��ÿһ�е�����
			arr[i] = new int[i+1];
			
			//3��ȷ��Ԫ�ص�ֵ
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = i+1;
				
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}
}