/*
�������
*/
class Day06_Test04{
	public static void main(String[] args){
		//(1)��ȷ������
		int[][] yanghui = new int[10][];
		
		//(2)��ȷ��ÿһ�е�����
		//��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
		for(int i=0; i<yanghui.length; i++){
			yanghui[i] = new int[i+1];
		}
		
		//(3)��ȷ��Ԫ��
		for(int i=0; i<yanghui.length; i++){
			//ÿһ�еĵ�һ�������һ��Ԫ�ض���1
			yanghui[i][0] = 1;
			yanghui[i][i] = 1;
			
			//�м��Ԫ��
			for(int j=1; j<yanghui[i].length-1; j++){
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
			
		}
		
		//(4)��ӡ��ʾ
		for(int i=0; i<yanghui.length; i++){
			for(int j=0; j<yanghui[i].length; j++){
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}