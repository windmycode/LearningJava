class Day06_Test05{
	public static void main(String[] args){
		//1������һ����ά���飬��ȷ������
		String[][] arr = new String[2][];
		
		//2��ȷ����һ�е���������һ�д洢��ɫ
		arr[0] = new String[4];
		
		//3��ȷ���ڶ��е��������ڶ��д洢����
		arr[1] = new String[13];
		
		//4���ѻ�ɫ�͵����Ž�ȥ
		//��ɫ
		arr[0][0] = "����";
		arr[0][1] = "����";
		arr[0][2] = "÷��";
		arr[0][3] = "��Ƭ";
		
		//����
		arr[1][0] = "A";
		for(int i=1; i<=9; i++){//��ʾ�ڶ��в����±�
		//�ѵ�һ����int����ת��Ϊstring����
			arr[1][i] = i+1+"";
		}
		arr[1][10] = "J";
		arr[1][11] = "Q";
		arr[1][12] = "K";
	
		//5����ʾ
		for(int i=0; i<arr[0].length; i++){//��ѭ��ѭ����ɫ
			for(int j=0; j<arr[1].length; j++){//��ѭ��ѭ������
				//arr[0][?]�ǻ�ɫ
				//arr[1][?]�ǵ���
				System.out.print(arr[0][i] + arr[1][j] + " ");
			}
			System.out.println();
		}
	}
}