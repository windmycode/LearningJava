/*
1���������ϰ
��һ������洢����ѧԱ�ĳɼ�����������ʾ
��1������ѧԱ�������Ӽ�������
��2��ѧԱ�ĳɼ��Ӽ�������
*/
class Test08_Exer4{
	public static void main(String[] args){
		/*
		���裺
		1����ȷ���������Ӽ�������
		2���������������飬�����洢�ɼ�
		3��ȷ��ÿһ���ɼ���Ϊÿһ��Ԫ�ظ�ֵ
		4��������ʾ
		*/
		
		//1����ȷ���������Ӽ�������
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�����뱾���������");
		int count = input.nextInt();
		
		//2���������������飬�����洢�ɼ�
		//int[] scores = new int[����];
		int[] scores = new int[count];
		
		//3��ȷ��ÿһ���ɼ���Ϊÿһ��Ԫ�ظ�ֵ
		for(int i=0; i<count; i++){
			System.out.print("�������"+ (i+1) + "��ѧԱ�ĳɼ���");
			//ΪԪ�ظ�ֵ��Ϊ˭��ֵ���Ͱ�˭д��=�����
			scores[i] = input.nextInt();//�ü��������ֵΪԪ�ظ�ֵ
		}
		
		//4��������ʾ
		System.out.println("����ѧԱ�ĳɼ����£�");
		for(int i=0; i<scores.length; i++){
			System.out.print(scores[i]+"\t");
		}
	}
}