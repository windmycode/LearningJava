/*
7��������Ϸ���������3��1-6��������
�����������ȣ���ô��Ϊ�����ӡ���
���������֮�ʹ���9����Ϊ���󡱣�
���������֮��С�ڵ���9����Ϊ��С����
�û��Ӽ�������Ѻ���ǡ����ӡ������󡱡���С�������ж��Ƿ�¶���
*/
class Test17_Exer7_2{
	public static void main(String[] args){
		//1���������3��1-6������
		int a = (int)(Math.random()*6 + 1);
		int b = (int)(Math.random()*6 + 1);
		int c = (int)(Math.random()*6 + 1);
		
		//2���ж�������������Ľ����ʲô
		int result;
		if(a == b && b == c){
			result = 1;//���豪��Ϊ1
		}else if(a + b + c > 9){
			result = 2;//�����Ϊ2
		}else{
			result = 3;//����СΪ3
		}
		
		//3���û��Ӽ�������Ѻ���ǡ����ӡ������󡱡���С��
		java.util.Scanner input = new java.util.Scanner(System.in);		
		System.out.println("1������");
		System.out.println("2����");
		System.out.println("3��С");
		System.out.print("��ѡ��");
		int ya = input.nextInt();
		
		//4���ж��û��������Ƿ�¶���
		//�Ƚ�ya��result�Ƿ���ͬ
		if(result==ya){
			System.out.println("�¶���");
		}else{
			System.out.println("�´���");
		}
		
		System.out.println("�������ǣ�" + a + "��" + b + "��" + c);

	}
}