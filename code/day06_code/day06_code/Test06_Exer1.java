/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
*/
class Test06_Exer1{
	public static void main(String[] args){
		int[][] arr = {{1},{2,2},{3,3,3},{4,4,4,4},{5,5,5,5,5}};
		
		//������ά�����arr.length�е�����
		for(int i=0; i<arr.length; i++){
			//ÿһ��
			//(1)�ȴ�ӡarr[i]�еļ���Ԫ��
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			//(2)����
			System.out.println();
		}
	}
} 