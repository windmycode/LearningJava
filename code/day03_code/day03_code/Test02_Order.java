/*
һ��˳��ṹ
��������������˵����˳��ִ�еģ���main()��������ʼ��˳��������

�Ƚ��д����ԣ���������

1��������
System.out.println(xx); //���xx֮����
System.out.print(xx);//���xx֮�󲻻���

2���������
���裺
��1��׼��һ�����ݵ�ɨ���ǣ����󣩣�ָ�����ݵ���Դ
java.util.Scanner input = new java.util.Scanner(System.in);


���䣺
	�������� ������ = ֵ;
*/
class Test02_Order{
	public static void main(String[] args){
		/*
		��1��java.util.Scanner����һ��ɨ���ǵ����ͣ��������������ͣ�����ĸ�Ǵ�д
		����java.util�ǰ�
		��2��input��һ�������������������ɨ����
		��3��new java.util.Scanner(System.in)�Ǹ�input��ֵ�ģ�����һ���µĶ���
		��4��(System.in)��ָ�������ݵ���Դ��System.inĬ�ϴ����������
		��5����������У�Ψһ�����Լ��޸ĵľ���input���������
			������input�޸�Ϊ�����ˣ���ô����Ĵ��룬����input�ĵط����޸�Ϊ���Լ������ı�����
		*/
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("���������䣺");//������������֮ǰִ��
		/*
		nextInt()��input�������ķ���������Int��I�Ǵ�д����Ϊ�������ͱ�����һ�����ӵڶ������ʿ�ʼ����ĸ��д
		��Ϊ���Ƿ���������()����ʡ��
		*/
		int age = input.nextInt();//��ɨ�����л�ȡһ��int��ֵ����ֵ��age�������
		System.out.println("age = " + age);//���age������ֵ
		
		System.out.print("������������");
		String name = input.next();//��ΪString����̫�����ˣ����Է��������ˣ�û����nextString
		
		System.out.print("���������أ�");
		double weight = input.nextDouble();
		
		System.out.print("�������Ƿ�Ư����");
		boolean beautiful = input.nextBoolean();
		
		System.out.print("�������Ա�");
		char gender = input.next().charAt(0);//��Ϊ���뵥��char̫�����ˣ�Scanner��û���ṩ���뵥��char�ķ�������ô����ֻ�ܱ�ͨ���Ȱ��ַ������գ�Ȼ��ȡ��һ���ַ�
	
		System.out.println("������" + name);
		System.out.println("���䣺" + age);
		System.out.println("���أ�" + weight);
		System.out.println("�Ա�" + gender);
		System.out.println("�Ƿ�Ư����" + beautiful);
	}
}