class FamilyAccount_2{
	public static void main(String[] args){
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
			//�����ڣ�double d = Math.random()
			//�����ڣ�double d = Math.sqrt(x)
			char select = Utility.readMenuSelection();//�����û���ѡ��
			
			//�ж��û���ѡ�񣬽��ж�Ӧ�Ĳ���
			switch(select){
				case '1':
					System.out.println(details);
					break;
				case '2':
					System.out.print("���������");
					int money = Utility.readNumber();
					
					System.out.print("��������˵����");
					String info = Utility.readString();
					
					balance += money;
					//����    1000           11000            �����
					details += "����\t" + money + "\t\t" + balance + "\t\t" + info + "\n";
					break;
				case '3':
					System.out.print("����֧����");
					money = Utility.readNumber();
					
					System.out.print("����֧��˵����");
					info = Utility.readString();
					
					balance -= money;
					//֧��    800            10200            ��ҵ��
					details += "֧��\t" + money + "\t\t" + balance + "\t\t" + info + "\n";
					break;
				case '4':
					System.out.print("ȷ���Ƿ��˳�(Y/N)��");
					char confirm = Utility.readConfirmSelection();
					if(confirm == 'Y' || confirm =='y'){
						flag = false;
					}
			}
		}
	}
}