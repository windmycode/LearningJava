/*
2����ӡ1-100��ż��

Ctrl + ������
*/
class Test04_Exer2{
	public static void main(String[] args){
		//��Ҫ����������1��������ѭ������
		//ѭ������i�ı仯�Ǵ�1-100
		for(int i=1; i<=100; i++){
			if(i%2==0){
				System.out.println(i);//��仰������ִ��
			}
		}
		
		System.out.println("-----------------------");
		for(int i=2; i<=100; i+=2){
			System.out.println(i);
		}
	}
}