/*
������֧�ṹ
1�������жϣ�if..else
2��ѡ��ṹ��switch...case

��һ�������ж�
1������֧�����ж�
2��˫��֧�����ж�
if(�������ʽ){
	���������ʽ����ʱ��Ҫִ�е�����;
}else{
	���������ʽ������ʱ��Ҫִ�е�����;
}

˵����
��1���������ʽ������booleanֵ
��2����{}�е����ֻ��һ��ʱ������ʡ��{}
������ʡ��{}
*/
class Test04_IfElse{
	public static void main(String[] args){
		/*
		�Ӽ�������һ���������ж���ż����������
		*/
		//1����������
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		
		//2���ж�
		/*
		if(num%2==0){
			System.out.println(num + "��ż��");
		}else{
			System.out.println(num + "������");
		}
		*/
		
		if(num%2==0)
			System.out.println(num + "��ż��");
		else
			System.out.println(num + "������");
		
	}
}