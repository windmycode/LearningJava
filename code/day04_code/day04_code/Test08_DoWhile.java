/*
ѭ���ṹ��
1��for
for(��ʼ��; ѭ������; �������){
	ѭ��������;
}
2��while
while(ѭ������){
	ѭ��������;
}
3��do...while

�﷨�ṹ��
do{
	ѭ�������飺��Ҫ�ظ��Ĵ���
}while(ѭ������);

˵����
��1��do{}while(ѭ��������);�����;Ҫע��

ִ�й��̣�
��1����ִ��һ��ѭ��������
��2��Ȼ�����ж����������Ƿ������һ��
��3����������������ٴ�ִ��ѭ�������飻Ȼ��ص���2��
     ���������������ֱ�ӽ���do...while
	 
do...whileѭ����for��while�������������ѭ��������������ִ��һ�Ρ�	 
*/
class Test08_DoWhile{
	public static void main(String[] args){
		/*
		3���Ӽ�����������������0������ͳ������������������ĸ�����
		*/
		//�Ӽ�����������=>java.util.Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num;//���������������Ŀ�ģ���Ϊ����do{}������Ȼ����ʹ��num
		int positive = 0;//ͳ�������ĸ���
		int negative = 0;//ͳ�Ƹ����ĸ���
		do{
			//��Ϊ�Ӽ��������������ظ��������Էŵ�ѭ������
			System.out.print("������������0��ʾ��������");
			num = input.nextInt();
			
			//ͳ������������������ĸ���
			if(num>0){
				positive++;
			}else if(num<0){
				negative++;
			}
		}while(num!=0);
		//ѭ������ �룺�������㣬����ִ��ѭ������䣬���������㣬����ѭ��
		//��ʱѭ��������num!=0
		
		System.out.println("�����ĸ�����" + positive);
		System.out.println("�����ĸ�����" + negative);
	}
} 