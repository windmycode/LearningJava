/*
break��
��1������switch..case
���ã�����switch
��2������ѭ���ṹ
���ã�������ǰѭ��

���ۣ�����һ��ѭ�������������1��ѭ�����������㣨2��������break���ж�
*/
class Test11_Break{
	public static void main(String[] args){
		//3���Ӽ�����������������0������ͳ������������������ĸ�����
		//��Ϊ��Ҫ�Ӽ�������
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		while(true){//true����ʾ����������while(true)������Զ����
			System.out.print("������������");
			int num = input.nextInt();
			
			if(num>0){
				positive++;
			}else if(num<0){
				negative++;
			}else{//num=0
				//������ǰѭ��
				break;
			}
		}
		System.out.println("�����ĸ�����" + positive);
		System.out.println("�����ĸ�����" + negative);
		
		//for(;;){
			
		//}
	}
}