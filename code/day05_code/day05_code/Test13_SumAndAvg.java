/*
�������ص��㷨������
1���������������ֵ/��Сֵ
2���������������ֵ/��Сֵ�����±�
3�������Ԫ���ۼӺͼ�ƽ��ֵ
*/
class Test13_SumAndAvg{
	public static void main(String[] args){
		/*
		��һ��ѧԱ�ĳɼ��洢�������У�ͳ���ֺܷ�ƽ����
		*/
		int[] scores = {78,89,56,99,100};
		
		//���ܷ�
		int sum = 0;
		for(int i=0; i<scores.length; i++){
			sum += scores[i];
		}
		
		//��ƽ��ֵ
		double avg = (double)sum / scores.length;
		System.out.println("�ܷ֣�" + sum);
		System.out.println("������" + scores.length);
		System.out.println("ƽ���֣�" + avg);
		
	}
}