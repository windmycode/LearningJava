/*
3���������ϰ3��
	��һ�����飬��������һ���������7��Ӣ�ﵥ�ʣ�
	�Ӽ�������1-7����ʾ��Ӧ�ĵ���
*/	
class Test05_Exer3{
	public static void main(String[] args){
		//��һ�����飬��������һ���������7��Ӣ�ﵥ�ʣ�
		String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		//	�Ӽ�������1-7����ʾ��Ӧ�ĵ���
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("���������ڣ�1-7����");
		int week = input.nextInt();
		
		if(week<1 || week>7){
			System.out.println("��������");
		}else{
			//week��Ӧ��Ӣ�ﵥ����weeks������
			//week=1��weeks[0]
			//week=2��weeks[1]
			//...
			System.out.println(week+"��Ӧ�����ڵĵ����ǣ�" + weeks[week-1]);
		}
		
	}
}