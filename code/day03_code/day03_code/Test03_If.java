/*
������֧�ṹ
1�������жϣ�if..else
2��ѡ��ṹ��switch...case

��һ�������ж�
1������֧�����ж�
�﷨��ʽ��
if(��������ʽ){
	������������ʽ����ʱ����Ҫִ�е����
}

˵����
��1��if()�б���ʽ������boolean���͵Ľ��
�ٱ�������boolean���͵�ֵ
�ڱȽϱ���ʽ
���߼�����ʽ
��2����{}�е����ֻ��һ��ʱ������ʡ��{}
�������ǲ�����ʡ��{}

���ѣ�
ѧϰ���̿������ṹ��
��1���﷨��ʽ
��2��ִ���ص�
*/
class Test03_If{
	public static void main(String[] args){
		//1���Ӽ�������һ�����
		//(1)׼��Scannerɨ���Ƕ���
		java.util.Scanner input = new java.util.Scanner(System.in);
		//(2)��ʾ�������
		System.out.print("��������ݣ�");
		//(3)���벢����һ��������Ϊ���
		int year = input.nextInt();
		
		//2�������ж��������Ƿ������꣬Ȼ����ʾ����2�·ݵ�������
		/*�������������1����4���������ܱ�100������2����400����
		*/
		int days = 28;//ƽ��
		
		//��������꣬days �޸�Ϊ29
		/*
		if(year%4==0 && year%100!=0 || year%400==0){
			days = 29;
		}
		*/
		if(year%4==0 && year%100!=0 || year%400==0)
			days = 29;
		
		System.out.println(year+"��2�·ݵ��������У�" + days);
	}
}







