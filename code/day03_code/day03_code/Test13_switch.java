/*
������֧�ṹ
1�������жϣ�if..else
2��ѡ��ṹ��switch...case

��һ�������ж�
1������֧�����ж�
2��˫��֧�����ж�
3�����֧�����ж�
4��Ƕ�������ж�

������ѡ��ṹ
�﷨�ṹ��
switch(���ʽ){
	case ����ֵ1:
		����1;
		��break;��
	case ����ֵ2:
		����2;
		��break;��
	...
	��default:
		����n+1;
		��break;��
	��
}
Ҫ��
��1��case��������ǳ���ֵ
��2��case����ĳ���ֵ�����ظ�
��3��switch()�еı��ʽ��������Ҫ��
	����4�ֻ����������ͣ�byte,short,int,char
	����2�������������ͣ�ö�٣�JDK1.5֮�󣩡�String��JDK1.7֮��

ִ���ص㣺
��1�����
�ٵ�switch()�еı��ʽ��ֵ��ĳһ��case����ĳ���ֵ����ȡ����ͻ�����case����
�ڵ�switch()�еı��ʽ��ֵ�����е�case����ĳ���ֵ��������ȡ����ͻ�Ѱ��default����
��2������
����Ȼ���ڣ�switch�Ľ���}
���жϳ��ڣ�break    �������Ҫ����return�ȣ�
��3��һ���ҵ�����ڡ��ͻ�˳������ִ�У�ֱ�����������ڡ�
��4��default��λ�ò�һ�������ϰ��������д�����

switch������
*/
class Test13_switch{
	public static void main(String[] args){
		/*
		���������ڵ����֣������Ӧ��Ӣ�ﵥ��
		*/
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("���������ڣ�1-7����");
		int week = input.nextInt();
		
		//int a = 1;
		switch(week){
			default:
				System.out.println("��������");
				break;
			//case a:// a���ǳ���
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
	}
}