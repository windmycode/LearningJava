/*
8����ӡ1-100֮����������3��5��7�ı�������ӡ
*/
class Test13_Exer8{
	public static void main(String[] args){
		/*
		��ʹ��continue
		*/
		for(int i=1; i<=100; i++){
			//����3��5��7�ı�������ӡ
			//������������3��5,7�ı����ʹ�ӡ
			if(i%3!=0 && i%5!=0 && i%7!=0){
				System.out.println(i);
			}
		}
		System.out.println("-----------------------");
		/*
		ʹ��continue
		*/
		for(int i=1; i<=100; i++){
			//����3��5��7�ı�������ӡ
			//�����3,5,7�ı�����������ӡ���
			if(i%3==0 || i%5==0 || i%7==0){
				//break;//�����break����ôֻ��ӡ1��2
				continue;
			}
			System.out.println(i);
		}
	}
}