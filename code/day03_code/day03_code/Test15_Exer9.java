/*
9����������ָ���·ݣ���ӡ���·������ļ��ڡ�
3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����
*/
class Test15_Exer9{
	public static void main(String[] args){
		//1�������·�
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��������");
		}
	}
}