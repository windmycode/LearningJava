/*
2���������ϰ2��
	��һ�����飬����ƽ��1-12�µ��������������ұ�����ʾ�����
	1�£�31��
	2�£�28��
	...
*/
class Test04_Exer2{
	public static void main(String[] args){
		//��һ�����飬����ƽ��1-12�µ�����������
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//���ұ�����ʾ���
		for(int i=0; i<daysOfMonth.length; i++){
			System.out.println((i+1) + "�£�" + daysOfMonth[i]);
		}
	}
}	