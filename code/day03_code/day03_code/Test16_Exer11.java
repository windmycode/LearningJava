/*
11���Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ��� 
   ע���ж�һ���Ƿ�������ı�׼��
       1�����Ա�4�����������ɱ�100����
       2�����Ա�400����
*/
class Test16_Exer11{
	public static void main(String[] args){
		//1���Ӽ��̷ֱ������ꡢ�¡���
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("�꣺");
		int year = input.nextInt();
		
		System.out.print("�£�");
		int month = input.nextInt();
		
		System.out.print("�գ�");
		int day = input.nextInt();
		
		//�ж���һ���ǵ���ĵڼ���==>��1��1�տ�ʼ���ۼӵ�xx��xx����һ��
		//(1)[1,month-1]������������
		//(2)��month���µ�day��
		//(3)��������2�·��Ƿ���29�죨�����ǿ�year�Ƿ������꣩
		
		//2������һ������days�������洢������
		//int days = 0;
		//�ۼӵ�month���µ�day��
		//days += day;
		
		//�޸�����Ĵ��룬ֱ�Ӱ�days��ʼ��Ϊday
		int days = day;
		
		//3���ۼ�[1,month-1]������������
		/*
		switch(month){
			//case 1://����Ҫ�ۼ���������
			case 2:
				//�ۼ�1�µ���������
				days += 31;
				break;
			case 3:
				//�ۼ�1�º�2�µ���������
				days += 31 + 28;
				break;
			case 4:
				//�ۼ�1�¡�2�¡�3�µ���������
				days += 31 + 28 + 31;
				break;
			....
		}
		*/
		switch(month){
			case 12:
				//�ۼӵ�1-11��
				days += 30;//���30�Ǵ���11�·ݵ���������
				//����û��break������������
			case 11:
				//�ۼӵ�1-10��
				days += 31;//���31�Ǵ���10�µ���������
				//����û��break������������
			case 10:
				days += 30;//9��
			case 9:
				days += 31;//8��
			case 8:
				days += 31;//7��
			case 7:
				days += 30;//6��
			case 6:
				days += 31;//5��
			case 5:
				days += 30;//4��
			case 4:
				days += 31;//3��
			case 3:
				days += 28;//2��
				//4�������￼���Ƿ������29��
				if(year%4==0 && year%100!=0 || year%400==0){
					days++;//���1��
				}
			case 2:
				days += 31;//1��
		}
		
		//5��������
		System.out.println(year + "��" + month + "��" + day + "������һ��ĵ�" + days + "��");
	}
}	   