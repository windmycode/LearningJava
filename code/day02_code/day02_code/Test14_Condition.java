/*
�������
5�������������
��Ϊ����Ψһ����Ԫ�����������Ҳ��Ϊ��Ԫ�����

�������ʽ �� ������ʽ1 �� ������ʽ2

�������ʽ�����������֡�
�����������������ʽ��������ȡ������ʽ1��ֵ�������ȡ������ʽ2��ֵ

*/
class Test14_Condition{
	public static void main(String[] args){
		boolean marry = false;
		System.out.println(marry ? "�ѻ�" : "δ��");
		
		//�ҳ�x��y�е����ֵ
		int x = 4;
		int y = 4;
		int max = x>=y ? x : y;
		/*
		�ȼ���
		if(x>=y){
			max = x;
		}else{
			max = y;
		}
		*/
		System.out.println(x + "��" + y + "�е����ֵ�ǣ�" + max);
	}
}