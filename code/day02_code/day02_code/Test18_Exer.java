/*
1������һ��int���ͱ�����������ݣ��ж��������Ƿ�������
ע���ж�һ���Ƿ�������ı�׼��
       1�����Ա�4�����������ɱ�100����
       2�����Ա�400����
	   */
class Test18_Exer{
	public static void main(String[] args){
		int year = 2000;
		
		boolean result = year%4==0 && year%100!=0 || year%400==0;
		System.out.println(year + (result?"������":"��������"));
	}
}