/*
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 */
 
class Test10_ManyDimensionalArray{
	public static void main(String[] args){
		//����ά����ÿһ�е���������ͬ��
		
		//������ȷ��������ȷ��ÿһ�е�����һ�����
		int[][] arr = new int[4][5];//��4�У�ÿһ�ж���5��
		
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