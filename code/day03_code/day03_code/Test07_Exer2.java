/*
2����С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ�������
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone7plus��
���ɼ�Ϊ[60,80]ʱ������һ�� iPad��
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�
*/
class Test07_Exer2{
	public static void main(String[] args){
		//1���Ӽ���������С������ĩ�ɼ�
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("��������С���ĳɼ���");
		int score = input.nextInt();
		
		//2���ж�
		if(score == 100){
			System.out.println("����һ��BMW");
		}else if(score>80){
			System.out.println("����һ̨iphone7plus");
		}else if(score>=60){
			System.out.println("����һ�� iPad");
		}else{
			System.out.println("ʲôҲû��");
		}
	}
}