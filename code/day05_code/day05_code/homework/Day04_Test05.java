//�������󣺴Ӽ��̷ֱ������ꡢ�¡��գ�ʹ��ѭ��for+ifʵ�֣��ж���һ���ǵ���ĵڼ���
class Day04_Test05{
	public static void main(String[] args){
		//1���Ӽ��̷ֱ������ꡢ�¡���
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("�꣺");
		int year = input.nextInt();
		
		System.out.print("�£�");
		int month = input.nextInt();
		
		System.out.print("�գ�");
		int day = input.nextInt();
		
		int days = day;//�ۼ��˵�month�µ�day��
		//�ۼ�[1,month-1]����������
		for(int i=1; i<month; i++){
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
		
		//5��������
		System.out.println(year + "��" + month + "��" + day + "������һ��ĵ�" + days + "��");
	}
}