/*
1���Ӽ�������һ�����������60�֣��������ϣ��ʹ�ӡ�ϸ����60�����£��ʹ�ӡ���ϸ�
��ʾ���Ӽ�������
*/
class Test05_Exer1{
	public static void main(String[] args){
		//1���Ӽ�������һ������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("������ɼ���");
		int score = input.nextInt();
		
		//2���ж�
		if(score >= 60){
			System.out.println("�ϸ�");
		}else{
			System.out.println("���ϸ�");
		}
	}
}