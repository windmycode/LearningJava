class FamilyAccount{
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean flag = true;
		
		int balance = 10000;//������
		String details = "��֧\t�˻����\t��֧���\t˵    ��\n";

		while(flag){
			System.out.println("-----------------��ͥ��֧�������-----------------");

			System.out.println("\t\t1 ��֧��ϸ");
			System.out.println("\t\t2 �Ǽ�����");
			System.out.println("\t\t3 �Ǽ�֧��");
			System.out.println("\t\t4 ��    ��");

			System.out.print("��ѡ��(1-4)��");
			int select = input.nextInt();//�����û���ѡ��
			
			//�ж��û���ѡ�񣬽��ж�Ӧ�Ĳ���
			switch(select){
				case 1:
					System.out.println(details);
					break;
				case 2:
					System.out.print("���������");
					int money = input.nextInt();
					
					System.out.print("��������˵����");
					String info = input.next();
					
					balance += money;
					//����    1000           11000            �����
					details += "����\t" + money + "\t\t" + balance + "\t\t" + info + "\n";
					break;
				case 3:
					System.out.print("����֧����");
					money = input.nextInt();
					
					System.out.print("����֧��˵����");
					info = input.next();
					
					balance -= money;
					//֧��    800            10200            ��ҵ��
					details += "֧��\t" + money + "\t\t" + balance + "\t\t" + info + "\n";
					break;
				case 4:
					System.out.print("ȷ���Ƿ��˳�(Y/N)��");
					char confirm = input.next().charAt(0);
					if(confirm == 'Y' || confirm =='y'){
						flag = false;
					}
			}
		}
	}
}