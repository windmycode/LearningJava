//8��ʹ�� switch �Ѱ���������תΪ���㡢Ҽ���������������顢½���⡢�ơ������������Ķ���� ��other����
class Test14_Exer8{
	public static void main(String[] args){
		//1������0-9������
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������0-9�����֣�");
		int num = input.nextInt();
		
		//2��תΪ���Ĵ�д����
		switch(num){
			case 0:
				System.out.println("��");
				break;
			case 1:
				System.out.println("Ҽ");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("½");
				break;
			case 7:
				System.out.println("��");
				break;
			case 8:
				System.out.println("��");
				break;
			case 9:
				System.out.println("��");
				break;
			default:
				System.out.println("other");
		}
	}
}