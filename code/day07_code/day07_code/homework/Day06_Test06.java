/*
���󣺱���ȫ���ÿ����ĳɼ������Գɼ���ͳ��

1. �Ӽ�������һ���м���
2. �Ӽ�������ÿһ��ֱ��ж�����
3. �Ӽ�������ÿһ��ͬѧ�ĳɼ�
4. ͳ��ÿһ�����߷֡���ͷ�
5. ͳ��ÿһ���ƽ����
6. ͳ��ȫ�����߷֡���ͷ�
7. ͳ��ȫ���ƽ����
8. ͳ��ȫ���������
*/
class Day06_Test06{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//(1)�Ӽ�������һ���м��飬ȷ����ά���������
		System.out.print("������һ���м��飺");
		int group = input.nextInt();
		
		//(2)������ά���飬��ȷ������
		int[][] arr = new int[group][];
		
		//(3)�Ӽ�������ÿһ��ֱ��ж����ˣ�ȷ��ÿһ�е�����
		for(int i=0; i<arr.length; i++){
			System.out.print("�������" + (i+1) + "���м�����:");
			arr[i] = new int[input.nextInt()];
			
			//(4)�Ӽ�������ÿһ��ͬѧ�ĳɼ�
			for(int j = 0; j<arr[i].length; j++){
				System.out.print("�������" + (j+1) + "����Ա�ĳɼ���");
				arr[i][j] = input.nextInt();
			}
		}
		
		//(4)��ʾ�ɼ���
		System.out.println("ÿ��ɼ����£�");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		/*
		4. ͳ��ÿһ�����߷֡���ͷ�
		5. ͳ��ÿһ���ƽ����
		6. ͳ��ȫ�����߷֡���ͷ�
		7. ͳ��ȫ���ƽ����
		8. ͳ��ȫ���������
		*/
		int[] groupMax = new int[group];//�м�����м���Ԫ��
		int[] groupMin = new int[group];
		double[] groupAvg = new double[group];
		int max = -1;//ȫ�����߷�
		int min = 101;//ȫ�����ͷ֣�����ɼ��ķ�Χ��[0,100]
		double sum = 0;
		int count = 0 ;
		
		//��ÿһ�����߷֣���ͷ֣�����ʼ��Ϊ����ֵ
		for(int i=0; i<group; i++){
			groupMax[i] = -1;
			groupMin[i] = 101;
		}
		
		//ͳ��
		for(int i=0; i<arr.length; i++){
			double groupSum = 0;//ÿһ���ۼ��ܷ֣����Ǵ�0��ʼ
			for(int j=0; j<arr[i].length; j++){
				if(arr[i][j] > groupMax[i]){//��ÿ�����߷�
					groupMax[i] = arr[i][j];
				}
				if(arr[i][j] < groupMin[i]){//��ÿ�����ͷ�
					groupMin[i] = arr[i][j];
				}
				if(arr[i][j] > max){//��ȫ�����߷�
					max = arr[i][j];
				}
				if(arr[i][j] < min){//��ȫ�����ͷ�
					min = arr[i][j];
				}
				groupSum += arr[i][j];//�ۼ�ÿһ����ܷ�
				sum += arr[i][j];//�ۼ�ȫ�����ܷ�
				count++;//�ۼ�������
			}
			
			//ÿһ���ƽ���� = ÿһ����ܷ�/ÿһ�������
			groupAvg[i] = groupSum / arr[i].length;
		}
		
		//ȫ����ƽ���� = ȫ�����ܷ� / ������
		double avg = sum / count;
		
		System.out.println("ȫ�����߷֣�" + max);
		System.out.println("ȫ�����ͷ֣�" + min);
		System.out.println("ȫ���ƽ���֣�" + avg);
		System.out.println("ȫ�����������" + count);
		for(int i=0; i<arr.length; i++){
			System.out.println("��" + (i+1) + "�����߷֣�" + groupMax[i]);
			System.out.println("��" + (i+1) + "�����ͷ֣�" + groupMin[i]);
			System.out.println("��" + (i+1) + "���ƽ���֣�" + groupAvg[i]);
		}
	}
}