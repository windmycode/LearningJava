//�������󣺼����2000��1��1�տ�ʼ������㣬����ɹ����
//�Ӽ����������������ꡢ�¡��գ���ʾ�����Ǵ��㻹��ɹ����
class Day04_Test06{
	public static void main(String[] args){
		//1���Ӽ��̷ֱ������ꡢ�¡���
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("�꣺");
		int year = input.nextInt();
		
		System.out.print("�£�");
		int month = input.nextInt();
		
		System.out.print("�գ�");
		int day = input.nextInt();
		
		/*
		��1�����������һ�����2000��1��1���ǵڼ���
		�ٵ�month�µ�day��
		�ڵ�year���[1,month-1]������
		�۴�[2000,year-1]����������
		��2����������%5����������������1,2,3�Ǵ��㣬4��0��ɹ��
		*/
		
		int days = day;//�ٵ�month�µ�day��
		
		//���ۼ�[1,month-1]����������
		for(int i=1; i<month; i++){//���i�����·�
			if(i==4 || i==6 || i==9 || i==11){
				days+=30;
			}else if(i==2){
				if(year%4==0 && year%100!=0 || year%400==0){
					days+=29;
				}else{
					days+=28;
				}
			}else{
				days+=31;
			}
		}
		
		//�۴�[2000,year-1]����������
		for(int i=2000; i<year; i++){//���i�������
			if(i%4==0 && i%100!=0 || i%400==0){
				days+=366;
			}else{
				days+=365;
			}
		}
		
		//�ж�
		if(days%5==1 || days%5==2 || days%5==3){
			System.out.println("����");
		}else{
			System.out.println("ɹ��");
		}
	}
}
