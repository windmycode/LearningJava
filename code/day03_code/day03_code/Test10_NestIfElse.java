/*
������֧�ṹ
1�������жϣ�if..else
2��ѡ��ṹ��switch...case

��һ�������ж�
1������֧�����ж�
2��˫��֧�����ж�
3�����֧�����ж�
4��Ƕ�������ж�
�﷨��ʽ��
��if(){
	�����������ж�
}
����else{
	�����������ж�
}

��Ƕ��ʱ������������ж�Ҫ��ִ�е�ǰ�ᣬ�����if��elseҪ�����㡣

*/
class Test10_NestIfElse{
	public static void main(String[] args){
		
		/*�Ӽ�������ɼ����Ϸ�[0,100]֮��
		�ɼ���Ϊ��
			100�֣��������
			90-99���������
			70-89���������
			60-69���������
			60���£����������
		*/
		//1������ɼ�
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������ɼ���");
		int score = input.nextInt();
		
		//2���ж�
		if(score>=0 && score<=100){
			//��ȥ�ж����ĸ��ȼ���
			if(score == 100){
				System.out.println("����");
			}else if(score>=90 && score<=99){
				System.out.println("����");
			}else if(score>=70 && score<=89){
				System.out.println("����");
			}else if(score>=60 && score<=69){
				System.out.println("����");
			}else{
				System.out.println("������");
			}
		}else{
			System.out.println("�ɼ��������󣬳ɼ���Χ��[0,100]");
		}
	}
}






