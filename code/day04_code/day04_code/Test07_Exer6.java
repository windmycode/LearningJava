/*
6����1ѭ����150����ÿ�д�ӡһ��ֵ��
������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,
��ÿ��7�ı������ϴ�ӡ�����baz����
*/
class Test07_Exer6{
	public static void main(String[] args){
		//��1ѭ����150
		for(int i=1; i<=150; i++){
			//��ÿ�д�ӡһ��i��ֵ
			//System.out.println(i);//���i֮�����̻���
			System.out.print(i);//ֻ��ӡi��ֵ
			
			//ÿ��3�ı������ϴ�ӡ����foo��
			if(i%3==0){
				//System.out.println("foo");//���foo�����̻���
				System.out.print("\tfoo");//�����\t��Ϊ�˺ÿ�
			}
			
			//��ÿ��5�ı������ϴ�ӡ��biz��
			if(i%5==0){
				System.out.print("\tbiz");
			}
			
			//��ÿ��7�ı������ϴ�ӡ�����baz��
			if(i%7==0){
				System.out.print("\tbaz");
			}
			
			//������һ�е���ȫ����ɺ��ٻ���
			//System.out.print("\n");
			System.out.println();//ֻ��ӡ����
		}
	}
}