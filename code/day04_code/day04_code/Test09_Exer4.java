/*
4���������һ��100���ڵ���������������Ϸ
�Ӽ��������������������ʾ�����ˣ����С�ˣ���ʾС�ˣ�������ˣ��Ͳ��ٲ��ˣ�
��ͳ��һ�����˶��ٴ�
*/
class Test09_Exer4{
	public static void main(String[] args){
		//�������һ��100���ڵ�����,[0,100)
		/*
		Math.random() -->[0,1)��С��
		Math.random()*100 -->[0,100)��С��
		[0,100)������ (int)(Math.random()*100 )
		*/
		int randNum = (int)(Math.random()*100);
	//	System.out.println(randNum);
		
		//�Ӽ��������������������ʾ�����ˣ����С�ˣ���ʾС�ˣ�������ˣ��Ͳ��ٲ��ˣ�
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num;//Ų��do{}���棬����������
		int count = 0;//ͳ�ƴ���
		do{
			System.out.print("��������Χ[0,100)��");
			num = input.nextInt();
			
			count++;//����һ�Σ��ʹ����һ��
			
			if(num > randNum){
				System.out.println("����");
			}else if(num<randNum){
				System.out.println("С��");
			}
		}while(num!=randNum);//�����������ظ�ִ��ѭ�������
		
		System.out.println("һ�����ˣ�" + count + "��");
	}
}