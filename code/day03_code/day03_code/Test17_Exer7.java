/*
7��������Ϸ���������3��1-6��������
�����������ȣ���ô��Ϊ�����ӡ���
���������֮�ʹ���9����Ϊ���󡱣�
���������֮��С�ڵ���9����Ϊ��С����
�û��Ӽ�������Ѻ���ǡ����ӡ������󡱡���С�������ж��Ƿ�¶���
*/
class Test17_Exer7{
	public static void main(String[] args){
		//1���������3��1-6������
		int a = (int)(Math.random()*6 + 1);
		int b = (int)(Math.random()*6 + 1);
		int c = (int)(Math.random()*6 + 1);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		//2���ж�������������Ľ����ʲô
		String result;
		if(a == b && b == c){
			result = "����";
		}else if(a + b + c > 9){
			result = "��";
		}else{
			result = "С";
		}
		
		//3���û��Ӽ�������Ѻ���ǡ����ӡ������󡱡���С��
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("��Ѻ�������ӡ���С����");
		String ya = input.next();
		
		//4���ж��û��������Ƿ�¶���
		//�Ƚ�ya��result�Ƿ���ͬ
		//if(result==ya){
		if(result.equals(ya)){
			System.out.println("�¶���");
		}else{
			System.out.println("�´���");
		}
	}
}