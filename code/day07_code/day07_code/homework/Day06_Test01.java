/*
�������Ӽ������뱾��ѧԱ��������
�ͱ���ѧԱ�ĳɼ���������洢�ɼ���Ȼ��ʵ�ִӸߵ�������
*/
class Day06_Test01{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//(1)��ȷ����������ȷ������ĳ���
		System.out.print("�����뱾��ѧԱ��������");
		int count = input.nextInt();
		
		//(2)��������
		int[] scores = new int[count];
		
		//(3)����ѧԱ�ĳɼ�
		for(int i=0; i<scores.length; i++){
			System.out.print("�������" +(i+1)+"��ѧԱ�ĳɼ���");
			scores[i] = input.nextInt();
		}
		
		//(4)����ð��
		for(int i=1; i<scores.length; i++){
			//�Ӹߵ��ͣ����Ӵ�С
			//���磺5����
			//�����ң�j�������0��
			//�յ���3,2,1,0
			//arr[j] ��arr[j+1]
			for(int j=0; j<scores.length-i; j++){
				if(scores[j] < scores[j+1]){
					int temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
				}
			}
		}
		
		//(5)��ʾ���
		for(int i=0; i<scores.length; i++){
			System.out.print(scores[i]+ " ");
		}
	}
}